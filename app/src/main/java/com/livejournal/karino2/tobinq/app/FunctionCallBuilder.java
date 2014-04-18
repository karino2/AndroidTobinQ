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

    // sublist = (XXSUBLIST ...)
    public void mergeSublist(Tree sublist) {
        for(int i = 0; i < sublist.getChildCount(); i++) {
            addChild(sublist.getChild(i));
        }
    }

    // "(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))"
    public static CommonTree convertAssignToFuncall(Tree op, Tree arg1, Tree arg2) {
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName("<-");
        builder.addArgument(arg1);
        builder.addNamedArgument("values", arg2);
        return builder.build();
    }

    // arg1 (XXSUBSCRIPT '[' lexpr sublist)
    // CommonTree actual = parseExpression("a[1:2] <- c");
    // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)))) c)
    // CommonTree actual = parseExpression("a[1:2, 3] <- c");
    // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)) (XXSUB1 3))) c)
    public static CommonTree convertSubscriptBracketAssignToFuncall(Tree op, Tree arg1, Tree arg2) {
        // (XXFUNCTION [<- (XXSUBLIST (XXSUB1 target) (XXSUB1 seq1) (XXSUB1 seq2)... (XXSUB1 right))
        return convertSubscriptXXAssignToFuncall("[<-", arg1, arg2);
    }

    private static CommonTree convertSubscriptXXAssignToFuncall(String funcName, Tree arg1, Tree arg2) {
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName(funcName);
        Tree target = arg1.getChild(1);
        Tree sublistRange = arg1.getChild(2);

        builder.addArgument(target);
        builder.mergeSublist(sublistRange);
        builder.addArgument(arg2);
        return builder.build();
    }

    public static CommonTree convertSubscriptBBAssignToFuncall(Tree op, Tree arg1, Tree arg2) {
        // (XXFUNCTION [[<- (XXSUBLIST (XXSUB1 target) (XXSUB1 seq1) (XXSUB1 seq2)... (XXSUB1 right))
        return convertSubscriptXXAssignToFuncall("[[<-", arg1, arg2);
    }

    // (XXSUBSCRIPT '[' lexpr sublist)
    public static CommonTree convertSubscriptBracketToFuncall(Tree subscript) {
        // (XXFUNCALL [ (XXSUBLIST (XXSUB1 lexpr) (XXSUB1 sublistchild1) (XXSUB1 sublistchild2)...))
        return convertSubscriptToFuncall(subscript, "[");
    }

    // (XXSUBSCRIPT LBB lexpr sublist)
    public static CommonTree convertSubscriptBBToFuncall(Tree subscript) {
        // (XXFUNCALL [ (XXSUBLIST (XXSUB1 lexpr) (XXSUB1 sublistchild1) (XXSUB1 sublistchild2)...))
        return convertSubscriptToFuncall(subscript, "[[");
    }


    private static CommonTree convertSubscriptToFuncall(Tree subscript, String funcName) {
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName(funcName);
        builder.addArgument(subscript.getChild(1));
        Tree sublist = subscript.getChild(2);
        builder.addArgument(sublist);
        // builder.mergeSublist(sublist);
        return builder.build();
    }
}
