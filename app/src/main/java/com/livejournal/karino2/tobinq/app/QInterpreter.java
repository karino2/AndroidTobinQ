package com.livejournal.karino2.tobinq.app;

import java.util.HashMap;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import com.livejournal.karino2.tobinq.app.ForestNode.Edge;
import com.livejournal.karino2.tobinq.app.ForestNode.Traversable;

public class QInterpreter {
	
	Writable _console;	
	public Writable getConsole(){ return _console; }
	public Environment _curEnv;
	Environment _rootEnv;

    public void registerFunction(String name, QFunction func) {
        _curEnv.put(name, func);
    }

	public void registerBuiltinFunction()
	{
		_curEnv.put("c", QFunction.createConcatinate());
		_curEnv.put("seq", QFunction.createSeq());
        _curEnv.put("rep", QFunction.createRep());
		_curEnv.put("plot", QFunction.createPlot(_plotable));
		_curEnv.put("lines", QFunction.createLines(_plotable));
        _curEnv.put("legend", QFunction.createLegend(_plotable));
		_curEnv.put("mean", QFunction.createMean());
        _curEnv.put("max", QFunction.createMax());
        _curEnv.put("min", QFunction.createMin());
		_curEnv.put("sum", QFunction.createSum());
        _curEnv.put("sapply", QFunction.createSapply());
		_curEnv.put("cumsum", QFunction.createCumulativeSum());
		_curEnv.put("length", QFunction.createLength());
		_curEnv.put("var", QFunction.createVar());
		_curEnv.put("sqrt", QFunction.createSqrt());
		_curEnv.put("data.frame", QFunction.createDataFrame());
		_curEnv.put("list", QFunction.createList());
		_curEnv.put("attributes", QFunction.createAttributes());
		_curEnv.put("as.numeric", QFunction.createAsNumeric());
		_curEnv.put("is.null", QFunction.createIsNull());
		_curEnv.put("substitute", QFunction.createSubstitute());
		_curEnv.put("deparse", QFunction.createDeParse());
		_curEnv.put("match.arg", QFunction.createMatchArg());
		_curEnv.put("read.csv", QFunction.createReadCsv(_csvRetrievable));
        _curEnv.put("matrix", QFunction.createMatrix());
        _curEnv.put("svd", QFunction.createSvd());
        _curEnv.put("diag", QFunction.createDiag());
        _curEnv.put("t", QFunction.createTranspose());
        _curEnv.put("unique", QFunction.createUnique());
        _curEnv.put("which", QFunction.createWhich());
        _curEnv.put("which.min", QFunction.createWhichMin());
        _curEnv.put("which.max", QFunction.createWhichMax());

        // not primitive
        registerNonePrimitiveFunction("class", "obj", "attributes(obj)[[\"class\"]]");
        registerNonePrimitiveFunction("dim", "obj", "attributes(obj)[[\"dim\"]]");
        registerNonePrimitiveFunction("$", "obj, sym", "obj[[deparse(substitute(sym))]]");


        // internal
        _curEnv.put("<-", QFunction.createInternalAssign());
        _curEnv.put("[<-", QFunction.createInternalBracketAssign());
        _curEnv.put("[[<-", QFunction.createInternalBBAssign());
        _curEnv.put("[", QFunction.createInternalSubscriptBracket());
        _curEnv.put("[[", QFunction.createInternalSubscriptBB());
        _curEnv.put("%*%", QFunction.createSpecialMultiply());
	}

    public void registerNonePrimitiveFunction(String name, String formal, String body)
    {
        _curEnv.put(name, createFunction(formal, body));
    }

    public QFunction createFunction(String formal, String body)
    {
        return new QFunction(QFunction.parseFormalList(formal), QFunction.parseExpr(body));
    }


    public QInterpreter(Writable console) {
		this(console, null,  null);
	}	


    Plotable _plotable;
	CsvTableRetrievable _csvRetrievable;
	public QInterpreter(Writable console, Plotable plotable,  CsvTableRetrievable csvRetrievable) {
		_curEnv = _rootEnv = new Environment(null);
		_plotable = plotable;
		_csvRetrievable = csvRetrievable;
		this._console = console;
		registerBuiltinFunction();
	}
	
	public void println(String str)
	{
		_console.write(str + "\n");
	}

    boolean isDebug = false;
	void debugPrint(String str)
	{
        if(isDebug)
    		println("<deb#>" + str);
	}

    public Tree suspendedValue;
    public QObject resumeEval() {
        return continueEval(suspendedValue);
    }
	
	Tree _lastTree;
	public QObject eval(String codestext)
	{
		QObject ret = null;
		try {
			_lastTree = buildTree(codestext);
			debugPrint(_lastTree.toStringTree());
			ret = evalTree(_lastTree);
			if(!QObject.Null.equals(ret))
				println(ret.toString());
		} catch (RecognitionException e) {
			debugPrint("#parse Error!");
			_console.write(e.toString());
			e.printStackTrace();
		}
		return ret;
	}

	public static ForestIterater<Tree> createIterater(Tree root)
	{
		ForestNode<Tree> rootNode = new ForestNode<Tree>(new Traversable<Tree>() {

			public Tree getChild(Tree elem, int i) {
				return elem.getChild(i);
			}

			public Tree getParent(Tree elem) {
				return elem.getParent();
			}

			public int getChildCount(Tree elem) {
				return elem.getChildCount();
			}

			public int getChildIndex(Tree elem) {
				return elem.getChildIndex();
			}
			
		}, ForestNode.Edge.Leading, root);
		return new ForestIterater<Tree>(rootNode);
	}
	
	QObject evalTree(Tree tree) {
		QObject ret = null;
		ForestIterater<Tree> iter = createIterater(tree);
		while(iter.hasNext())
		{
			ForestNode<Tree> node = iter.next();
			if(node.getEdge() == Edge.Trailing)
				continue;
			Tree t = node.getElement();
			if(t.getType() == QParser.XXVALUE)
			{
				ret = evalValue(t);
				iter.skipChildren();
			}
		}
		return ret;
	}

	// (XXVALUE (XXBINARY + 2 3)), evalValue seems bad name.
	public QObject evalValue(Tree t) {
		QObject ret = QObject.Null;
		if(t.getChildCount() == 0)
			return ret;
		return evalExpr(t.getChild(0));
	}

    public QObject evalExprWithEnv(Environment env, Tree expr) {
        Environment originalEnv = _curEnv;
        try {
            _curEnv = env;
            return evalExpr(expr);
        }finally {
            _curEnv = originalEnv;
        }

    }


    private QObject evalPromiseForResolve(QPromise promise) {
        Environment originalEnv = _curEnv;
        try {
            _curEnv = promise.getEnvironment();
            QObject result = evalExprWithoutResolve(promise.getExpression());
            promise.setResolvedValue(result);
            return result;
        }finally {
            _curEnv = originalEnv;
        }
    }

    public QObject resolveOne(QPromise promise) {
        if(promise.isResolved())
            return promise.getResolvedValue();
        return evalPromiseForResolve(promise);
    }

    public QObject resolveIfNecessary(QObject obj) {
        while(obj instanceof QPromise) {
            QPromise promise = (QPromise)obj;
            if(promise.isResolved())
                obj =  promise.getResolvedValue();
            else
                obj = evalPromiseForResolve(promise);
        }
        return obj;
    }

    public QObject evalExpr(Tree term) {
        return resolveIfNecessary(evalExprWithoutResolve(term));
    }
	
	public QObject evalExprWithoutResolve(Tree term)
	{
		// R use numeric for most of the case (instead of int).
		if(term.getType() == QParser.DecimalLiteral)
			return QObject.createNumeric(Double.valueOf(term.getText()));
//			return QObject.createInt(Integer.valueOf(term.getText()));
		if(term.getType() == QParser.FloatingPointLiteral)
			return QObject.createNumeric(Double.valueOf(term.getText()));
		if(term.getType() == QParser.XXBINARY) // recursive call now.
			return evalBinary(term.getChild(0), term.getChild(1), term.getChild(2));
		if(term.getType() == QParser.XXFUNCALL)
		{
			try
			{
		    return evalCallFunction(term);
		}
			catch(BlockException e)
			{
				Tree xxval = getParentXXValue(term);
                suspendedValue = xxval;
				throw new BlockException(xxval);
			}
		}
		if(term.getType() == QParser.SYMBOL) {
            QObject obj = _curEnv.get(term.getText());
            if(obj != null)
                return obj;
            throw new QException("Error: " + term.getLine() + ":" + term.getCharPositionInLine()+ ": object '" + term.getText() + "' not found");
        }
		if(term.getType() == QParser.NULL_CONST)
			return QObject.Null;		
		if(term.getType() == QParser.TRUE)
			return QObject.TRUE;
		if(term.getType() == QParser.FALSE)
			return QObject.FALSE;
        if(term.getType() == QParser.NA)
            return QObject.NA;
		if(term.getType() == QParser.XXSUBSCRIPT)
			return evalSubscript(term);
		if(term.getType() == QParser.XXPAREN)
		{
			if(term.getChildCount() != 1)
				throw new RuntimeException("child num of XXPAREN is not 1. Which case?");
			return evalExprWithoutResolve(term.getChild(0));
		}
		// (XXEXPRLIST (XXBINARY <- b (XXBINARY * i 2)) (XXBINARY <- e (XXBINARY * i 13)))
		if(term.getType() == QParser.XXEXPRLIST)
		{
			QObject ret = QObject.Null;
			for(int i = 0; i < term.getChildCount(); i++)
			{
				ret = evalExprWithoutResolve(term.getChild(i));
			}
			return ret;
		}
		if(term.getType() == QParser.XXFOR)
			return evalFOR(term);
		// TODO: handle literal more seriously.
		if(term.getType() == QParser.STR_CONST)
			return QObject.createCharacter(term.getText().substring(1, term.getText().length()-1));
		// 		// (XXDEFUN XXFORMALLIST (XXEXPRLIST 1 2))
		if(term.getType() == QParser.XXDEFUN)
			return new QFunction(term.getChild(0), term.getChild(1));
		if(term.getType() == QParser.XXUNARY)
			return evalUnary(term);
		throw new QException("NYI2:" + term.getType());
	}

	QObject evalUnary(Tree term) {
		// (XXUNARY - 3)
		if("-".equals(term.getChild(0).getText()))
		{
			QObject target = evalExpr(term.getChild(1));
			QObjectBuilder bldr = new QObjectBuilder();
			for(int i = 0; i < target.getLength(); i++) {
				bldr.add(QObject.createNumeric(-target.get(i).getDouble()));
			}
			return bldr.result();
		}
		throw new QException("NYI unary: " + term.getChild(0).getText());
	}

	// "(XXFOR (XXFORCOND i (XXBINARY : 1 10)) (XXEXPRLIST (XXBINARY <- b (XXBINARY * i 2)) (XXBINARY <- e (XXBINARY * i 13))))
	private QObject evalFOR(Tree term) {
		Tree forCond = term.getChild(0);
		Tree sym = forCond.getChild(0);
		Tree forCondExp = forCond.getChild(1);
		if(sym.getType() != QParser.SYMBOL)
			throw new QException("argument of for expression is not symbol.");
		QObject condList = evalExpr(forCondExp);
		for(int i = 0; i < condList.getLength(); i++)
		{
			// for statements does not create env in R.
			_curEnv.put(sym.getText(), condList.get(i));
            // forExpr might replace by this evalExpr. So we need to getChild every time.
			evalExpr(term.getChild(1));
		}
		// for statements never return value in R (I think this is strange though).
		return QObject.Null;
	}

	private Tree getParentXXValue(Tree start) {
		Tree cur = start;
		while(cur != null && cur.getType() != QParser.XXVALUE )
			cur = cur.getParent();
		if(cur == null)
			throw new RuntimeException("Invalid AST tree. no XXVALUE in parent.");
		return cur;
	}

	// (XXSUBSCRIPT '[' lexpr sublist)
	// or (XXSUBSCRIPT LBB lexpr sublist)
    public QObject evalSubscript(Tree term) {
        Tree converted;
        Tree parent = term.getParent();
		if(term.getChild(0).getType() == QParser.LBB)
            converted = FunctionCallBuilder.convertSubscriptBBToFuncall(term);
        else
            converted = FunctionCallBuilder.convertSubscriptBracketToFuncall(term);
        if(parent != null)
            parent.replaceChildren(term.getChildIndex(), term.getChildIndex(), converted);
        return evalCallFunction(converted);
    }

	// (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2)))
    public QObject evalCallFunction(Tree term) {
		QObject funcCand = _curEnv.get(term.getChild(0).getText());
        if(funcCand == null)
            throw new QException("Error: object '"+ term.getChild(0).getText() +"' not found");
		if(funcCand.getMode() == "function")
		{
			QFunction func = (QFunction)funcCand;
                return callFuncWithArgTree(func, term.getChild(1));
            }
		// error handling, can I use exception in JS env?
		_console.write("right value of func call is not function. After investigate exception, I'll handle.");
		return QObject.Null;
	}

    public QObject callFuncWithArgTree(QFunction func, Tree argTree) {
        Environment funcEnv = new Environment(_curEnv);
        assignToFormalList(argTree, func.getFormalList(), funcEnv);
        return callFunctionWithFuncEnv(func, funcEnv);
    }

    private QObject callFunctionWithFuncEnv(QFunction func, Environment funcEnv) {
        Environment outer = _curEnv;
        QObject ret;
        try
        {
            _curEnv = funcEnv;
            if(func.isPrimitive())
                ret = func.callPrimitive(funcEnv, this);
            else
                ret = evalFuncBodyExpr(func.getBody());
        }
        finally
        {
            _curEnv = outer;
        }
        return ret;
    }

    private QObject evalFuncBodyExpr(Tree body) {
        // no parenthes, ex. function(x) x+1
        if(body.getType() != QParser.XXEXPRLIST)
            return  evalExpr(body);
        return evalExprList(body);
    }

    // (XXEXPRLIST 1 2)
	private QObject evalExprList(Tree body) {
		QObject ret = QObject.Null;
		for(int i = 0; i < body.getChildCount(); i++)
		{
			ret = evalExpr(body.getChild(i));
		}
		return ret;
	}
	public final String ARGNAME = "__arg__";
	
	// (XXSUBLIST (XXSUB1 1) (XXSYMSUB1 beg 4))
	// (XXFORMALLIST (XXFORMAL0 beg) (XXFORMAL1 end 10))
    public void assignToFormalList(Tree subList, Tree formalList,
                                   Environment funcEnv) {
		if(formalList == null) {
			assignToDefaultArgs(subList, funcEnv);
			return;
		}
		HashMap<String, Boolean> assigned = new HashMap<String, Boolean>();

		// (..., x=y, ...)
		handleXXSymSub1(subList, funcEnv, assigned);

		// (..., x, ...)
		handleXXSub(subList, formalList, funcEnv, assigned);
		
		assignRemainingDefaultArguments(formalList, funcEnv, assigned);
		storeDefaultArg(formalList, funcEnv);
	}

	// (XXFORMALLIST (XXFORMAL0 beg) (XXFORMAL1 end 10))
	private void storeDefaultArg(Tree formalList, Environment funcEnv) {
		for(int i = 0; i < formalList.getChildCount(); i++)
		{
			Tree formArg = formalList.getChild(i);
			if(formArg.getType() != QParser.XXFORMAL1)
				continue;
			Tree sym = formArg.getChild(0);
			Tree val = formArg.getChild(1);
            QPromise promise = new QPromise(_curEnv, val);
			funcEnv.putDefault(sym.getText(), promise /* evalExprWithoutResolve(val) */);
		}
	}

	void assignRemainingDefaultArguments(Tree formalList, Environment funcEnv,
			HashMap<String, Boolean> assigned) {
		for(int i = 0; i < formalList.getChildCount(); i++)
		{
			Tree formArg = formalList.getChild(i);
			if(formArg.getType() != QParser.XXFORMAL1)
				continue;
			Tree sym = formArg.getChild(0);
			if(isAssigned(sym.getText(), assigned))
				continue;
			Tree val = formArg.getChild(1);
            QPromise promise = new QPromise(_curEnv, val);
            funcEnv.put(sym.getText(), promise);
		}
	}

	void handleXXSub(Tree subList, Tree formalList,
			Environment funcEnv, HashMap<String, Boolean> assigned) {
		for(int i = 0; i < subList.getChildCount(); i++)
		{
			Tree node = subList.getChild(i);
			if(node.getType() != QParser.XXSUB1)
				continue;
			Tree formArg = getNextFormArgSym(formalList, assigned);
			Tree val = node.getChild(0);
            QPromise promise = new QPromise(_curEnv, val);
            funcEnv.put(formArg.getText(), promise);
			assigned.put(formArg.getText(), true);
		}
	}
	
	private boolean isAssigned(String name, HashMap<String, Boolean> assigned)
	{
		return assigned.containsKey(name) && assigned.get(name);
	}

	// slow
	// (XXFORMALLIST (XXFORMAL0 beg) (XXFORMAL1 end 10))
	private Tree getNextFormArgSym(Tree formalList,
			HashMap<String, Boolean> assigned) {
		for(int i = 0; i < formalList.getChildCount(); i++)
		{
			Tree arg = formalList.getChild(i);
			Tree sym = arg.getChild(0);
			if(isAssigned(sym.getText(), assigned))
				continue;
			return sym;
		}
		throw new QException("Too much arguments");
    }

	void handleXXSymSub1(Tree subList, Environment funcEnv,
			HashMap<String, Boolean> assigned) {
		for(int i = 0; i < subList.getChildCount(); i++)
		{
			Tree node = subList.getChild(i);
			if(node.getType() != QParser.XXSYMSUB1)
				continue;
			Tree sym = node.getChild(0);
			Tree val = node.getChild(1);
            QObject arg = new QPromise(_curEnv, val);
			funcEnv.put(sym.getText(), arg);
			
			assigned.put(sym.getText(), true);
		}
	}

	private void assignToDefaultArgs(Tree subList, Environment funcEnv) {
		QObject args = new QList();
		int argNum = 0;
		for(int i = 0; i < subList.getChildCount(); i++)
		{
            Tree expression = subList.getChild(i).getChild(0);
            if(expression != null) {
                QObject arg = new QPromise(_curEnv, expression);
                args.set(argNum++, arg);
            }
		}
		funcEnv.put(ARGNAME, args);
	}
	
	interface binaryOperable {
		QObject execute(QObject i, QObject j);
	}


	interface doubleBinaryOperable {
		QObject execute(double i, double j);
	}
	
	QObject evalBinaryGeneric(QObject arg1, QObject arg2, binaryOperable op)
	{
		if(arg1.getLength() == 1 &&arg2.getLength() == 1)
			return op.execute(arg1,arg2);
		QObjectBuilder bldr = new QObjectBuilder();
		QObject r1 = arg1;
		QObject r2 = arg2;
		if(r1.getLength() > r2.getLength())
			r2 = arg2.recycle(r1.getLength());
		else if(r1.getLength() < r2.getLength())
			r1 = arg1.recycle(r2.getLength());	
		for(int i = 0; i < r1.getLength(); i++)
		{
			QObject q = op.execute(r1.get(i), r2.get(i));
			bldr.add(q);
		}
		return bldr.result();
		
	}

	
	QObject evalBinaryDouble(QObject arg1, QObject arg2, final doubleBinaryOperable op)
	{
		return evalBinaryGeneric(arg1, arg2, new binaryOperable() {
			public QObject execute(QObject i, QObject j) {
				return op.execute(i.getDouble(), j.getDouble());
			}			
		});
	}

	public QObject evalPlus(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createNumeric(i+j);
			}
			
		});
	}

	QObject evalMinus(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createNumeric(i-j);
			}
			
		});
	}
	QObject evalMultiple(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createNumeric(i*j);
			}
			
		});
	}
	QObject evalDivide(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createNumeric(i/j);
			}
			
		});
	}
	
	// <=
    public QObject evalLE(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i <= j);
			}
			
		});
	}

	// <
	QObject evalLT(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i < j);
			}
			
		});
	}
	
	QObject evalGT(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i > j);
			}
			
		});
	}
	QObject evalGE(QObject arg1, QObject arg2)
	{
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i >= j);
			}
			
		});
	}
	public QObject evalEQ(QObject arg1, QObject arg2) {
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i == j);
			}
			
		});
	}
	public QObject evalNE(QObject arg1, QObject arg2) {
		return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
			public QObject execute(double i, double j) {
				return QObject.createLogical(i != j);
			}
		});
	}
	public QObject evalAND(QObject arg1, QObject arg2) {
		return evalBinaryGeneric(arg1, arg2, new binaryOperable() {
			public QObject execute(QObject i, QObject j) {
				return QObject.createLogical(i.isTrue() && j.isTrue());
			}
		});
	}
    public QObject evalPower(QObject arg1, QObject arg2) {
        return evalBinaryDouble(arg1, arg2, new doubleBinaryOperable() {
            public QObject execute(double i, double j) {
                return QObject.createNumeric(Math.pow(i, j));
            }

        });
    }

    public QObject evalBinary(Tree op, Tree arg1, Tree arg2) {
		if(QParser.LEFT_ASSIGN == op.getType() ||
				QParser.EQ_ASSIGN == op.getType())
		{

            // a <- c(1, 2)
            // (XXBINARY <- a (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2))))
            // a <- b
            // (XXBINARY <- a b)
            // (XXFUNCALL "<-" (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))
            // (XXSYMSUB1 beg 4)
            // 	// (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2)))
            // hoge(2, a, values=c)
            // (XXFUNCALL hoge (XXSUBLIST (XXSUB1 2) (XXSUB1 a) (XXSYMSUB1 values c)))
            // hoge(2, a, values=c(1, 2))
            // (XXFUNCALL hoge (XXSUBLIST (XXSUB1 2) (XXSUB1 a) (XXSYMSUB1 values (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2))))))
            if(arg1.getType() == QParser.SYMBOL) {
                Tree parent = op.getParent();
                Tree converted = FunctionCallBuilder.convertAssignToFuncall(op, arg1, arg2);
                replaceBinaryOp(parent, converted);
                return evalCallFunction(converted);
            }
            if(arg1.getType() == QParser.XXSUBSCRIPT) {
                // (XXSUBSCRIPT '[' lexpr sublist)
                // or (XXSUBSCRIPT LBB lexpr sublist)
                Tree parent = op.getParent();
                Tree converted;
                if(arg1.getChild(0).getType() == QParser.LBB)
                    converted = FunctionCallBuilder.convertSubscriptBBAssignToFuncall(op, arg1, arg2);
                else
                    converted = FunctionCallBuilder.convertSubscriptBracketAssignToFuncall(op, arg1, arg2);
                replaceBinaryOp(parent, converted);
                return evalCallFunction(converted);
            }
            throw new QException("assign: unsupported lexpr type(" + arg1.getType() + ")");
		}


        if(":".equals(op.getText()))
        {
            return convertAndCallBinaryCall("seq", arg1, arg2);
        }
        else if("%*%".equals(op.getText()) || "$".equals(op.getText()))
        {
            return convertAndCallBinaryCall(op.getText(), arg1, arg2);
        }
        /*
        else if("%*%".equals(op.getText())){
            return convertAndCallBinaryCall(op.getText(), arg1, arg2);
        }else if("$".equals(op.getText()))
        {
            CommonTree node = new CommonTree(new CommonToken(QParser.STR_CONST, arg2.getText()));
            return convertAndCallBinaryCall(op.getText(), arg1, node);
        }
        */


		QObject term1 = evalExpr(arg1);
		QObject term2 = evalExpr(arg2);
		if("+".equals(op.getText()))
		{
			return evalPlus(term1, term2);
		}
		else if("-".equals(op.getText()))
		{
			return evalMinus(term1, term2);
		}
		else if("*".equals(op.getText()))
		{
			return evalMultiple(term1, term2);
		}
		else if("/".equals(op.getText()))
		{
			return evalDivide(term1, term2);
		}
		else if("%%".equals(op.getText()))
		{
			return evalBinaryDouble(term1, term2, new doubleBinaryOperable() {
				public QObject execute(double i, double j) {
					return QObject.createNumeric(i%j);
				}
			});
		}
		else if(QParser.LT == op.getType())
		{
			return evalLT(term1, term2);
		}
		else if(QParser.LE == op.getType())
		{
			return evalLE(term1, term2);
		}
		else if(QParser.GT == op.getType())
		{
			return evalGT(term1, term2);
		}
		else if(QParser.GE == op.getType())
		{
			return evalGE(term1, term2);
		}
		else if(QParser.EQ == op.getType())
		{
			return evalEQ(term1, term2);
		}
		else if(QParser.NE == op.getType())
		{
			return evalNE(term1, term2);
		}
		else if(QParser.AND == op.getType())
		{
			return evalAND(term1, term2);
		}
        else if("^".equals(op.getText()))
        {
            return evalPower(term1, term2);
        }
		else 		throw new QException("NYI1");
	}

    private void replaceBinaryOp(Tree parent, Tree converted) {
        if(parent!= null && parent.getParent() != null) {
            parent.getParent().replaceChildren(parent.getChildIndex(), parent.getChildIndex(), converted);
        }
    }

    private QObject convertAndCallBinaryCall(String funcName, Tree arg1, Tree arg2) {
        Tree parent = arg1.getParent();
        Tree converted = FunctionCallBuilder.convertBinaryCallToFuncall(funcName, arg1, arg2);
        // Are you sure!?
        replaceBinaryOp(parent, converted);
        return evalCallFunction(converted);
    }

    private Tree buildTree(String codestext) throws RecognitionException {
		CharStream codes = new ANTLRStringStream(codestext);
		QLexer lex = new QLexer(codes);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		QParser parser = new QParser(tokens){
            @Override
            public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
                String hdr = getErrorHeader(e);
                String msg = getErrorMessage(e, tokenNames);
                throw new QException("Syntax Error: " + hdr+ ": " + msg);
            }
        };
	 	QParser.prog_return r = parser.prog();
		Tree tree = (Tree)r.getTree();
		return tree;
	}

	public QObject continueEval(Tree suspendedValue) {
		boolean reached = false;
		QObject ret = QObject.Null;
		ForestIterater<Tree> iter = createIterater(_lastTree);
		while(iter.hasNext())
		{
			ForestNode<Tree> node = iter.next();
			if(node.getEdge() == Edge.Trailing)
				continue;
			Tree t = node.getElement();
			if(t.getType() == QParser.XXVALUE)
			{
				if(t == suspendedValue) {
					reached = true;
					ret = evalValue(t);
				} else if(reached){
					ret = evalValue(t);
				}
				iter.skipChildren();
			}
		}
		if(!QObject.Null.equals(ret))
			println(ret.toString());
		return ret;
	}


}
