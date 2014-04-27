package com.livejournal.karino2.tobinq.app;

import org.antlr.runtime.tree.Tree;

/**
 * Created by karino on 4/27/14.
 */
public class DataFrameBuilder {

    public QList createDataFrame(QObject args, Environment funcEnv, QInterpreter intp) {
        validateArg(args);

        QList ret = QList.createDataFrame();

        QObject rowNames = rowNames(args, intp);
        ret.setRowNamesAttr(rowNames);

        QObjectBuilder nameBldr = new QObjectBuilder();
        for(int i = 0; i < args.getLength(); i++)
        {
            QObject original = args.get(i);
            QObject o = intp.resolveIfNecessary(original);
            QList df = copyVectorAsDataFrame(o);

            QObject name = null;
            if(QObject.Null.equals(o.getAttribute("names"))) {
                if(original instanceof QPromise) {
                    QPromise promise = (QPromise) original;
                    Tree sexp = promise.getExpression();
                    if(sexp.getType() == QParser.SYMBOL) {
                        name = QObject.createCharacter(sexp.getText());
                    }
                }
                if(name == null)
                    name = QObject.createCharacter("V" + (i + 1));
            }
            else
                name = o.getAttribute("names");

            nameBldr.add(name);
            df.setNamesAttr(name);
            df.setRowNamesAttr(rowNames);
            // inside set, df is copied. so you must call here.
            ret.set(i, df);
        }
        ret.setNamesAttr(nameBldr.result());
        return ret;

    }

    QObject rowNames(QObject args, QInterpreter intp) {
        QObject o2 = intp.resolveIfNecessary(args.get(0));
        int rowNum = o2.getLength();
        return QList.defaultRowNames(rowNum);
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
