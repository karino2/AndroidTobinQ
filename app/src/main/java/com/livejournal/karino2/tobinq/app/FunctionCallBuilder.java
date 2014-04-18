package com.livejournal.karino2.tobinq.app;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karino on 4/18/14.
 */
public class FunctionCallBuilder {
    // (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2)))
    String funcName;
    CommonTreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setFunctionName(String name) {
        funcName = name;
    }

    CommonTree sublist = null;
    CommonTree getSublist() {
        if(sublist == null) {
            sublist = (CommonTree)adaptor.create(QParser.XXSUBLIST, "XXSUBLIST");
        }
        return sublist;
    }

    public CommonTree build() {
        CommonTree funcall = (CommonTree)adaptor.create(QParser.XXFUNCALL, "XXFUNCALL");
        CommonTree funSym = (CommonTree)adaptor.create(QParser.SYMBOL, funcName);
        funcall.addChild(funSym);
        funcall.addChild(getSublist());
        return funcall;
    }

   // (XXFUNCALL "<-" (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))
    public void addArgument(Tree arg) {
        CommonTree node = (CommonTree)adaptor.create(QParser.XXSUB1, "XXSUB1");
        node.addChild(arg);
        addChild(node);
    }

    // node must be (XXSUB1 a), etc.
    public void addChild(Tree node) {
        getSublist().addChild(node);
    }

    public void addNamedArgument(String name, Tree value) {
        CommonTree node = (CommonTree)adaptor.create(QParser.XXSYMSUB1, "XXSYMSUB1");
        CommonTree nameSymbol = (CommonTree)adaptor.create(QParser.SYMBOL, name);
        node.addChild(nameSymbol);
        node.addChild(value);
        addChild(node);
    }

    // "(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))"
    public static CommonTree convertAssignToFuncall(Tree op, Tree arg1, Tree arg2) {
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName("<-");
        builder.addArgument(arg1);
        builder.addNamedArgument("values", arg2);
        return builder.build();
    }

    /*
    if(arg1.getType() == QParser.XXSUBSCRIPT) {
        // (XXSUBSCRIPT '[' lexpr sublist)
        // or (XXSUBSCRIPT LBB lexpr sublist)
        if(arg1.getChild(0).getType() == QParser.LBB)
            throw new RuntimeException("NYI: LBB assignment");
        // return evalLexprForAssignSubscriptBracket(term);

    }
    */
    // arg1 (XXSUBSCRIPT '[' lexpr sublist)
    // CommonTree actual = parseExpression("a[1:2] <- c");
    // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)))) c)
    // CommonTree actual = parseExpression("a[1:2, 3] <- c");
    // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)) (XXSUB1 3))) c)
    public static CommonTree convertSubscriptBracketAssignToFuncall(Tree op, Tree arg1, Tree arg2) {
        // (XXFUNCTION [<- (XXSUBLIST (XXSUB1 target) (XXSUB1 seq1) (XXSUB1 seq2)... (XXSUB1 right))
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName("[<-");
        Tree target = arg1.getChild(1);
        Tree sublistRange = arg1.getChild(2);

        builder.addArgument(target);
        for(int i = 0; i < sublistRange.getChildCount(); i++) {
            builder.addChild(sublistRange.getChild(i));
        }
        builder.addArgument(arg2);
        return builder.build();
    }

}