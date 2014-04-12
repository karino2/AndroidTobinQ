package com.livejournal.karino2.tobinq.app;

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
