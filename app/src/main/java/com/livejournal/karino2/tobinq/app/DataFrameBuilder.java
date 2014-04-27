package com.livejournal.karino2.tobinq.app;

import android.util.Log;

import org.antlr.runtime.tree.Tree;

/**
 * Created by karino on 4/27/14.
 */
public class DataFrameBuilder {

    public QList createDataFrame(QObject args, Environment funcEnv, QInterpreter intp) {
        validateArg(args);

        QList ret = QList.createDataFrame();

        QObject rowNames = null;

        QObjectBuilder nameBldr = new QObjectBuilder();
        for(int i = 0; i < args.getLength(); i++)
        {
            QObject oneArg = args.get(i);
            QObject oneArgValue;
            QObject defaultName = null;
            if(oneArg instanceof QPromise) {
                QPromise promise = (QPromise)oneArg;
                Tree sexp = promise.getExpression();
                if(sexp.getType() == QParser.XXSYMSUB1) {
                    defaultName = QObject.createCharacter(sexp.getChild(0).getText());
                    oneArgValue = intp.evalExpr(sexp.getChild(1));

                } else if(sexp.getType() == QParser.SYMBOL) {
                    defaultName = QObject.createCharacter(sexp.getText());
                    oneArgValue = intp.resolveIfNecessary(oneArg);
                } else {
                    oneArgValue = intp.resolveIfNecessary(oneArg);
                }
            } else {
                oneArgValue = intp.resolveIfNecessary(oneArg);
            }
            if(i == 0) {
                rowNames = QList.defaultRowNames(oneArgValue.getLength());
                ret.setRowNamesAttr(rowNames);
            }

            QList df = copyVectorAsDataFrame(oneArgValue);

            QObject name = null;
            if(QObject.Null.equals(oneArgValue.getAttribute("names"))) {
                if(defaultName != null)
                    name = defaultName;
                else
                    name = QObject.createCharacter("V" + (i + 1));
            }
            else
                name = oneArgValue.getAttribute("names");

            nameBldr.add(name);
            df.setNamesAttr(name);
            df.setRowNamesAttr(rowNames);
            // inside set, df is copied. so you must call here.
            ret.set(i, df);
        }
        ret.setNamesAttr(nameBldr.result());
        return ret;

    }

    public static void validateArg(QObject args) {
        if(args.getMode() != QList.LIST_TYPE)
            throw new QException("data.frame arg is not list");
        int len = args.get(0).getLength();
        for(int i = 0; i < args.getLength(); i++)
        {
            if(args.get(i).getLength() != len)
            {
                throw new QException("data.frame arg length mismatch: 0's=" + len + ", " + i + "'s=" + args.get(i).getLength());
            }
        }
    }

    QList copyVectorAsDataFrame(QObject o) {
        QList df = QList.createDataFrame();
        QObjectBuilder bldr = new QObjectBuilder();
        for(int i = 0; i < o.getLength(); i++) {
            o.get(i).share();
            bldr.add(o.get(i));
        }
        df.set(0, bldr.result());
        return df;
    }
}
