package com.livejournal.karino2.tobinq.app;

import org.antlr.runtime.tree.Tree;

/**
 * Created by karino on 4/13/14.
 */
public class QPromise extends QObject {

    Environment environment;
    Tree expression;
    boolean isResolved;
    QObject resolvedValue;

    // promise is only used internally, so some QObject method does not behave collectlly.
    public QPromise(Environment env, Tree sexp) {
        super("promise");
        environment = env;
        expression = sexp;
        isResolved = false;
        resolvedValue = QObject.Null;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolvedValue(QObject val) {
        resolvedValue = val;
        isResolved = true;
    }

    public QObject getResolvedValue() {
        return resolvedValue;
    }

    public Environment getEnvironment() {
        return environment;
    }
    public Tree getExpression() {
        return expression;
    }
}
