package com.livejournal.karino2.tobinq.app;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by karino on 4/10/14.
 */
public class Retriever {
    Database database;
    DefaultHttpClient httpClient;

    public Retriever(DefaultHttpClient http, Database db) {
        this.httpClient = http;
        this.database = db;
    }

    boolean isResponse200(HttpResponse res) {
        return res.getStatusLine().getStatusCode() == 200;
        // return (res.getStatusLine().getStatusCode() & 200) != 0;
    }

    public interface OnContentReadyListener {
        void onReady(String responseText);
        void onFail(String message);
    }

    String retrieveFromCache(String url) {
        return database.retrieveContent(url);
    }

    public void retrieveFromRemote(final String url, final OnContentReadyListener listener) {
        GetTask task = new GetTask(url, new OnContentReadyListener() {
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

    class GetTask extends AsyncTask<Object, String, Boolean> {

        OnContentReadyListener resultListener;
        String url;
        GetTask(String url, OnContentReadyListener listener) {
            this.url = url;
            resultListener = listener;
        }

        String readBody(HttpResponse res) throws IOException {
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(res.getEntity().getContent(), "UTF-8"));
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
            HttpGet httpGet = new HttpGet(url);
            try {
                HttpResponse res = httpClient.execute(httpGet);
                if(res.getStatusLine().getStatusCode() != 200) {
                    errorMessage = "HttpGet is not 200: " + res.getStatusLine().getStatusCode();
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
