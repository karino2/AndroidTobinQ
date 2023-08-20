package com.livejournal.karino2.tobinq.app;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by karino on 4/10/14.
 */
public class Retriever {
    Database database;
    OkHttpClient httpClient;

    public static long lastScriptUpdateAt = -1;

    public Retriever(OkHttpClient http, Database db) {
        this.httpClient = http;
        this.database = db;
    }

    boolean isResponse200(Response res) {
        return res.code() == 200;
    }


    public interface OnScriptEntityReadyListener {
        void onReady(List<ScriptEntity> ents, String lastModified);
        void onNotModified();
        void onFail(String message);
    }

    public void retrieveScriptList(final long lastChecked, String lmodified, final OnScriptEntityReadyListener listener) {
        final GetScriptEntityTask task = new GetScriptEntityTask(lmodified, new OnScriptEntityReadyListener() {
            @Override
            public void onReady(List<ScriptEntity> ents, String lastModified) {
                ArrayList<ScriptEntity> filtered = new ArrayList<ScriptEntity>();
                for(ScriptEntity ent : ents) {
                    if (ent._updatedAt > lastChecked)
                    {
                        filtered.add(ent);
                    }
                }

                for(ScriptEntity ent : filtered) {
                    database.saveScript(ent);
                    // ent.id must be filled by above save
                    assert(ent.id != -1);
                }
                listener.onReady(filtered, lastModified);
            }

            @Override
            public void onNotModified() {
                listener.onNotModified();
            }

            @Override
            public void onFail(String message) {
                listener.onFail(message);
            }
        });
        task.execute();
    }

    public interface OnContentReadyListener {
        void onReady(String responseText);
        void onFail(String message);
    }


    String retrieveFromCache(String url) {
        return database.retrieveContent(url, lastScriptUpdateAt);
    }

    public void retrieveFromRemote(final String url, final OnContentReadyListener listener) {
        GetStringTask task = new GetStringTask(url, new OnContentReadyListener() {
            @Override
            public void onReady(String responseText) {
                database.insertContent(url, responseText);
                listener.onReady(responseText);
            }

            @Override
            public void onFail(String message) {
                listener.onFail(message);
            }
        });
        task.execute();
    }

    /*
        Retrieve scripts.json from server.
        It takes into account of LastModified header.
        But it does not check each entry's _updateAt.
     */
    class GetScriptEntityTask extends AsyncTask<Object, String, Boolean> {
        final String baseUrl = "https://karino2.github.io/TobinQJsonBackend/scripts.json";

        OnScriptEntityReadyListener resultListener;

        String lastModified;
        GetScriptEntityTask(String lastModified, OnScriptEntityReadyListener listener) {
            resultListener = listener;
            this.lastModified = lastModified;
        }


        String errorMessage = null;
        List<ScriptEntity> results;

        @Override
        protected Boolean doInBackground(Object... params) {
            String url = baseUrl;

            Request httpGet = createRequest(url);

            try {
                Response res = httpClient.newCall(httpGet).execute();
                if (res.code() == 304)
                    return true;
                if(res.code() != 200) {
                    errorMessage = "HttpGet is not 200: " + res.code();
                    return false;
                }
                lastModified = res.header("Last-Modified");
                results = readScripts(res);
                return true;
            } catch (IOException e) {
                errorMessage = "fail retrieve:" + e.getMessage();
                return false;
            }
        }

        private Request createRequest(String url) {
            if (lastModified.equals(""))
                return new Request.Builder()
                    .url(url)
                    .get()
                    .build();
            else
                return new Request.Builder()
                        .url(url)
                        .get()
                        .header("If-Modified-Since", lastModified)
                        .build();
        }

        private List<ScriptEntity> readScripts(Response response) throws IOException {
            Gson gson = new Gson();
            ArrayList<ScriptEntity> res = new ArrayList<ScriptEntity>();
            JsonReader reader = new JsonReader(new InputStreamReader(response.body().byteStream(), "UTF-8"));
            // JsonReader reader = new JsonReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
            reader.beginArray();
            while (reader.hasNext()) {
                ScriptEntity ent = gson.fromJson(reader, ScriptEntity.class);
                res.add(ent);
            }
            reader.endArray();
            reader.close();
            return res;
        }

        @Override
        protected void onPostExecute(Boolean success) {
            if(success){
                if (results != null)
                    resultListener.onReady(results, lastModified);
                else
                    resultListener.onNotModified();
            }
            else
                resultListener.onFail(errorMessage);
        }
    }


    class GetStringTask extends AsyncTask<Object, String, Boolean> {

        OnContentReadyListener resultListener;
        String url;
        GetStringTask(String url, OnContentReadyListener listener) {
            this.url = url;
            resultListener = listener;
        }

        String readBody(Response res) throws IOException {
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(res.body().byteStream(), "UTF-8"));
            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            boolean first = true;
            while(line != null) {
                if(!first)
                    builder.append("\n");
                first = false;
                builder.append(line);
                line = reader.readLine();
            }
            return builder.toString();
        }

        String responseText = null;
        String errorMessage = null;

        @Override
        protected Boolean doInBackground(Object... params) {
            Request httpGet = new Request.Builder()
                    .url(url)
                    .get()
                    .build();
            try {
                Response res = httpClient.newCall(httpGet).execute();
                if(res.code() != 200) {
                    errorMessage = "HttpGet is not 200: " + res.code();
                    return false;
                }
                responseText = readBody(res);
                return true;
            } catch (IOException e) {
                errorMessage = "fail retrieve:" + e.getMessage();
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean success) {
            if(success)
                resultListener.onReady(responseText);
            else
                resultListener.onFail(errorMessage);
        }
    }

}
