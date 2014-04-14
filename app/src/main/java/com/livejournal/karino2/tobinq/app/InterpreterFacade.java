package com.livejournal.karino2.tobinq.app;

import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 * Created by karino on 4/12/14.
 */
public class InterpreterFacade {
    public interface NotifyListener {
        void notifyStatus(String message);
    }

    public interface FinishListener {
        void onFinish(QObject result);
    }

    NotifyListener notify;
    QInterpreter interpreter;
    FinishListener finishListener = new FinishListener() {
        @Override
        public void onFinish(QObject result) {

        }
    };

    public void loadTableOfContents()
    {
        try {
            String csvText = readTableOfContentsAsString();
            CsvTable table = CsvTableRetriever.textToTableStatic(csvText);
            interpreter.registerFunction("Qurl", QFunction.createQurl(table));
        } catch (FileNotFoundException e) {
            interpreter.getConsole().write("init script not found: " + e.getMessage());
        } catch (IOException e) {
        }
    }

    private String readTableOfContentsAsString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(assetManager.open("TableOfContent.csv")));
        try {
            StringWriter writer = new StringWriter();
            int n;
            char[] buf = new char[2048];
            while ((n = reader.read(buf)) != -1) {
                writer.write(buf, 0, n);
            }
            return writer.toString();
        }finally {
            reader.close();
        }
    }

    AssetManager assetManager;

    public InterpreterFacade(Writable console, Plotable plotable, NotifyListener notifyListener, Retriever retriever, AssetManager assets) {
        assetManager = assets;
        notify = notifyListener;
        interpreter = new QInterpreter(console, plotable, new CsvTableRetriever(new CsvTableRetriever.ResumeListener() {
            @Override
            public void onResume() {
                onScriptResume();
            }

            @Override
            public void onResumeFail(String message) {
                onScriptResumeFail(message);
            }

            @Override
            public void notifyStatus(String message) {
                notify.notifyStatus(message);
            }
        }, retriever));
        loadTableOfContents();
    }

    public void evalWithListener(String code, FinishListener listener) {
        finishListener = listener;
        eval(code);
    }

    public void eval(String code) {
        try {
            QObject result = interpreter.eval(code);
            finishListener.onFinish(result);
        } catch (BlockException be) {
            // block call. wait callback.
        } catch (RuntimeException re) {
            interpreter.println("error: " + re.toString());
        }
    }


    void onScriptResume() {
        try{
            QObject result = interpreter.resumeEval();
            finishListener.onFinish(result);
        }
        catch(BlockException be)
        {
            // block call. wait callback.
        }
        catch(RuntimeException e)
        {
            interpreter.println("error: " + e.toString());
        }
    }

    void onScriptResumeFail(String message) {
        interpreter.println("Block call failure:" + message);
    }

}
