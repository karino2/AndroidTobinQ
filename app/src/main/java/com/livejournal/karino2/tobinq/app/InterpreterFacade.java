package com.livejournal.karino2.tobinq.app;

/**
 * Created by karino on 4/12/14.
 */
public class InterpreterFacade {
    public interface NotifyListener {
        void notifyStatus(String message);
    }

    NotifyListener notify;
    QInterpreter interpreter;
    public InterpreterFacade(Writable console, Plotable plotable, NotifyListener notifyListener, Retriever retriever) {
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
    }

    public void eval(String code) {
        try {
            interpreter.eval(code);
        } catch (BlockException be) {
            // block call. wait callback.
        } catch (RuntimeException re) {
            interpreter.println("error: " + re.toString());
        }
    }


    void onScriptResume() {
        try{
            interpreter.resumeEval();
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
