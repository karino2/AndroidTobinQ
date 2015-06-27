package com.livejournal.karino2.tobinq.app.test;

import com.livejournal.karino2.tobinq.app.Environment;
import com.livejournal.karino2.tobinq.app.FunctionCallBuilder;
import com.livejournal.karino2.tobinq.app.QException;
import com.livejournal.karino2.tobinq.app.QInterpreter;
import com.livejournal.karino2.tobinq.app.QList;
import com.livejournal.karino2.tobinq.app.QObject;
import com.livejournal.karino2.tobinq.app.QParser;
import com.livejournal.karino2.tobinq.app.QPromise;
import com.livejournal.karino2.tobinq.app.Writable;

import junit.framework.TestCase;

import static com.livejournal.karino2.tobinq.app.test.QParserTest.parseExpression;
import static com.livejournal.karino2.tobinq.app.test.QParserTest.parseExpressionOrAssign;
import static com.livejournal.karino2.tobinq.app.test.QParserTest.parseFormList;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class QInterpreterTest extends TestCase {
	public static class ConsoleForTest implements Writable
	{
		public StringBuffer Result = new StringBuffer();
		public void write(CharSequence cs) {
			Result.append(cs);
		}
	}

	public static void assertNumericEquals(QObject expected, QObject actual)
	{
		assertEquals(expected.getMode(), actual.getMode());
		assertEquals(expected.getValue(), actual.getValue());
	}
	
	public void test_eval_plus()
	{
		int expected = 5;

		QObject actual = _intp.eval("2+3");
		assertQNumericEquals(expected, actual);
	}
	
	public void test_eval_paren()
	{
		int expected = 3;
		
		QObject actual = _intp.eval("(4+8)/4");
		assertQNumericEquals(expected, actual);		
	}
	
	public void test_eval_dataFrame()
	{
        String expected = "  x y\n1 1 1\n2 2 2\n3 3 3";
		QObject df = _intp.eval("x<-1:3;y<-1:3;data.frame(x, y)");
		assertEquals(expected, df.toString());
	}
	
	public void test_eval_function()
	{
		int expected = 2;
		// (XXDEFUN XXFORMALLIST (XXEXPRLIST 1 2))
		QObject actual = _intp.eval("f <- function() { 1; 2}\nf()");
		assertQNumericEquals(expected, actual);
	}

    // promise env must be outside, otherwise, infinite lookup loop.
    public void test_eval_function_promiseResolve()
    {
        int expected = 10;
        QObject actual = _intp.eval("x<-1:10; f <- function(x) { length(x); }\nf(x)");
        assertQNumericEquals(expected, actual);

    }

    public void test_eval_function_promiseResolve2()
    {
        QObject actual = _intp.eval("f <- function(a) { a+1; }\nf(1+2+3)");
        assertQNumericEquals(7, actual);
    }


    public void test_eval_function_promiseModeBug()
    {
        double expected1 = 6.5;
        double expected2 = 18.5;
        String code = "x<-1:24; sumMonths <- function(total) { n<-(length(total)/12);"
        + "y<-1:n; for(i in 1:n) {b<-(12*(i-1))+1;e<-(12*(i-1))+12; y[i]<-mean(total[b:e]) }\n y}"
        + "\nsumMonths(x)";
        QObject actual = _intp.eval(code);
        assertEquals(QObject.createNumeric(expected1), actual.get(0));
        assertEquals(QObject.createNumeric(expected2), actual.get(1));
    }

    public void test_eval_localAssign()
    {
        QObject actual = _intp.eval("a<- 1; f<-function() {a <- 3}; f(); a");
        assertQNumericEquals(1, actual);
    }

    public void test_eval_enclosedAssign()
    {
        QObject actual = _intp.eval("a<- 1; f<-function() {a <<- 3}; f(); a");
        assertQNumericEquals(3, actual);
    }

    public void test_eval_enclosedAssignSubscript()
    {
        QObject actual = _intp.eval("a<- 1; f<-function() {a[2] <<- 3}; f(); a");
        assertEquals(2, actual.getLength());
        assertQNumericEquals(1, actual.get(0));
        assertQNumericEquals(3, actual.get(1));
    }

    public void test_eval_logicalAssign()
    {
        String code = "a <- 1:3; a[c(FALSE, TRUE, TRUE)] <- 5;a";
        QObject actual = _intp.eval(code);
        assertEquals(3, actual.getLength());
        assertQNumericEquals(1, actual.get(0));
        assertQNumericEquals(5, actual.get(1));
        assertQNumericEquals(5, actual.get(2));
    }

    public void test_eval_logicalAssign_rightHandRule()
    {
        String code = "a <- rep(0, 6); a[c(FALSE, TRUE)] <- 1:3;a";
        QObject actual = _intp.eval(code);
        assertEquals(6, actual.getLength());
        assertQNumericEquals(0, actual.get(0));
        assertQNumericEquals(1, actual.get(1));
        assertQNumericEquals(0, actual.get(2));
        assertQNumericEquals(2, actual.get(3));
        assertQNumericEquals(0, actual.get(4));
        assertQNumericEquals(3, actual.get(5));
    }


    public static void assertQCharEquals(String expected, QObject actual)
	{
		assertEquals(QObject.createCharacter(expected), actual);
	}
	
	public void test_evalExpr_minus() throws RecognitionException
	{
		int expected = -3;
		QObject actual = callEvalExpr("-3");
		assertQNumericEquals(expected, actual);
	}

	public void test_evalExpr_and() throws RecognitionException
	{
		QObject actual = callEvalExpr("1:3>1 & 1:3<3");
		assertEquals(3, actual.getLength());
		assertEquals(false, actual.get(0).isTrue());
		assertEquals(true, actual.get(1).isTrue());
		assertEquals(false, actual.get(2).isTrue());
	}

    public void test_evalExpr_matrix_class() throws RecognitionException
    {
        String expected = "matrix";
        QObject actual = callEvalExpr("class(matrix(1:4, 2, 2))");
        assertQCharEquals(expected, actual);
    }

    public void test_evalExpr_matrix_dim() throws RecognitionException
    {
        QObject actual = callEvalExpr("dim(matrix(1:6, 2, 3))");
        assertQNumericEquals(2, actual.get(0));
        assertQNumericEquals(3, actual.get(1));
    }

    public void test_evalExpr_matrix_toString() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1:6, 2, 3)");
        assertEquals("     [,1] [,2] [,3]\n[1,]    1    3    5\n[2,]    2    4    6",
                actual.toString());
    }

    public void test_evalExpr_matrix_multiDim() throws RecognitionException {
        QObject actual = callEvalExpr("matrix(1:6, 2, 3)[2, 3]");
        assertQNumericEquals(6, actual);
    }

    public void test_evalExpr_matrix_toString_precision() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1.2345)");
        assertEquals("       [,1]\n[1,] 1.2345",
                actual.toString());
    }

    public void test_evalExpr_matrix_svd() throws RecognitionException
    {
        QObject actual = callEvalExpr("svd(matrix(1:4, 2, 2))");
        //R output.		assertEquals("$d\n[1] 5.4649857 0.3659662\n\n$u\n           [,1]       [,2]\n[1,] -0.5760484 -0.8174156\n[2,] -0.8174156  0.5760484\n\n$v\n           [,1]       [,2]\n[1,] -0.4045536  0.9145143\n[2,] -0.9145143 -0.4045536\n\n",
        assertEquals("$d\n[1] 5.4649857 0.3659662\n\n$u\n          [,1]       [,2]\n[1,] 0.5760484  0.8174156\n[2,] 0.8174156 -0.5760484\n\n$v\n           [,1]      [,2]\n[1,]  0.4045536 0.9145143\n[2,] -0.9145143 0.4045536\n\n",
                actual.toString());
    }

    public void test_evalExpr_diag() throws RecognitionException
    {
        QObject actual = callEvalExpr("diag(1:3)");
        assertEquals("     [,1] [,2] [,3]\n[1,]    1    0    0\n[2,]    0    2    0\n[3,]    0    0    3",
                actual.toString());
    }

    public void test_evalExpr_transpose() throws RecognitionException
    {
        QObject actual = callEvalExpr("t(matrix(c(1, 2, 0, 0), 2, 2))");
        assertEquals("     [,1] [,2]\n[1,]    1    2\n[2,]    0    0",
                actual.toString());
    }

    public void test_evalExpr_matrix_crossproduct_result_mustbe_matrix() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1:3, ncol=3) %*% 1:3");
        assertEquals("matrix", actual.getQClass());
    }

    public void test_evalExpr_matrix_crossproduct() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1:3, ncol=3) %*% 1:3");
        assertQNumericEquals(14, actual.get(0));
    }

    public void test_evalExpr_matrix_crossproduct_2row() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1:6, 2, 3) %*% 1:3");
        assertQNumericEquals(22, actual.get(0));
        assertQNumericEquals(28, actual.get(1));
    }

    public void test_evalExpr_matrix_crossproduct_2row_tostring() throws RecognitionException
    {
        QObject actual = callEvalExpr("matrix(1:6, 2, 3) %*% 1:3");
        assertEquals("     [,1]\n[1,]   22\n[2,]   28", actual.toString());
    }


    public void test_evalExpr_exprList() throws RecognitionException
	{
		int expected = 5;
		QObject actual = callEvalExpr("{3; 5}");
		assertQNumericEquals(expected, actual);
	}
	
	public void test_evalExpr_forCond() throws RecognitionException
	{
		int expected = 10;

		QObject actual = callEvalExpr("for(i in 1:10) a<-i ");

		assertEquals(QObject.Null, actual);
		assertQNumericEquals(expected, _intp._curEnv.get("a"));
	}

    public void test_evalExpr_ifelse_onlyIf() throws RecognitionException {
        QObject actual = callEvalExpr("if(TRUE) 1");
        assertQNumericEquals(1, actual);
    }

    public void test_evalExpr_ifelse_onlyIf_block() throws RecognitionException {
        QObject actual = callEvalExpr("if(TRUE) {1; 2}");
        assertQNumericEquals(2, actual);
    }

    public void test_evalExpr_ifelse_onlyIf_notmatch() throws RecognitionException {
        QObject actual = callEvalExpr("if(FALSE) {1; 2}");
        assertEquals(QObject.Null, actual);
    }

    public void test_evalExpr_ifelse_true() throws RecognitionException {
        QObject actual = callEvalExpr("if(TRUE) 1 else 2");
        assertQNumericEquals(1, actual);
    }

    public void test_evalExpr_ifelse_false() throws RecognitionException {
        QObject actual = callEvalExpr("if(FALSE) 1 else 2");
        assertQNumericEquals(2, actual);
    }

	public void test_evalExpr_leftAssign_subscript() throws RecognitionException
	{
		callEvalExpr("a<-1");
		callEvalExpr("a[1:3]<-10:12");
		QObject actual = _intp._curEnv.get("a");
		assertQNumericEquals(10, actual.get(0));
		assertQNumericEquals(11, actual.get(1));
		assertQNumericEquals(12, actual.get(2));
	}

    public void test_evalExpr_dataFrame_explicitName() throws RecognitionException {
        QObject actual = callEvalExpr("data.frame(a=1:2)");
        assertQCharEquals("a", actual.getAttribute("names"));
        assertEquals(2, actual.getAttribute("row.names").getLength());
    }

    public void test_evalExpr_dataFrame_explicitNameMultiRow() throws RecognitionException {
        QList actual = (QList)callEvalExpr("data.frame(a=1:2, b=3:4)");
        assertEquals(2, actual.getAttribute("names").getLength());
        assertQCharEquals("a", actual.getAttribute("names").get(0));
        assertQCharEquals("b", actual.getAttribute("names").get(1));
        assertEquals(2, actual.getAttribute("row.names").getLength());
        assertQNumericEquals(1, actual.getBBInt(0).get(0));
        assertQNumericEquals(2, actual.getBBInt(0).get(1));
        assertQNumericEquals(3, actual.getBBInt(1).get(0));
        assertQNumericEquals(4, actual.getBBInt(1).get(1));
    }

	public void test_evalExpr_dataFrame_subscript() throws RecognitionException
	{
		// setup
		callEvalExpr("x<-1:3");
		callEvalExpr("y<-4:6");
		callEvalExpr("df<-data.frame(x, y)");

		QObject actual = callSubscript("df[1]");
		
		assertEquals("data.frame", actual.getQClass());
		assertQCharEquals("x", actual.getAttribute("names"));
		assertQCharEquals("1", actual.getAttribute("row.names").get(0));
		assertEquals(1, actual.getLength());
		
		assertNotNull(actual.toString());
	}

    public void test_evalExpr_dataFrame_subscriptMultiDim() throws RecognitionException
    {
        // setup
        callEvalExpr("x<-1:3");
        callEvalExpr("y<-4:6");
        callEvalExpr("df<-data.frame(x, y)");

        QObject actual = callSubscript("df[1, 2]");

        assertQNumericEquals(4, actual);
    }

	
	public void test_evalExpr_dataFrame_subscript_multiDimension_row() throws RecognitionException
	{
		/*
		 *  x y
		 *  1 4
		 *  2 5
		 *  3 6
		 */
		// setup
		callEvalExpr("x<-1:3");
		callEvalExpr("y<-4:6");
		callEvalExpr("df<-data.frame(x, y)");

		QObject actual_obj = callSubscript("df[2,]");
		
		assertEquals("data.frame", actual_obj.getQClass());
		QList actual = (QList) actual_obj;
		assertEquals(2, actual.getLength());
		assertQNumericEquals(2, actual.getBBInt(0));
		assertQNumericEquals(5, actual.getBBInt(1));
	}
	
	public void test_evalExpr_dataFrame_subscript_multiDimension_multirow() throws RecognitionException
	{
		/*
		 *  x y
		 *  1 4
		 *  2 5
		 *  3 6
		 */
		// setup
		callEvalExpr("x<-1:3");
		callEvalExpr("y<-4:6");
		callEvalExpr("df<-data.frame(x, y)");

		QObject actual_obj = callSubscript("df[2:3,]");

        assertEquals("data.frame", actual_obj.getQClass());
        QList actual = (QList) actual_obj;
        assertEquals(2, actual.getLength());
        QObject xcol = actual.getBBInt(0);
        assertEquals(2, xcol.getLength());
        assertQNumericEquals(2, xcol.get(0));
        assertQNumericEquals(3, xcol.get(1));

        QObject ycol = actual.getBBInt(1);
        assertEquals(2, ycol.getLength());
        assertQNumericEquals(5, ycol.get(0));
        assertQNumericEquals(6, ycol.get(1));
    }

    public void test_evalExpr_dataFrame_subscript_multiDimension_multicol() throws RecognitionException
    {
        callEvalExpr("x<-1:3");
        callEvalExpr("y<-4:6");
        callEvalExpr("z<-7:9");
        callEvalExpr("df<-data.frame(z, y, x)");

        QObject actual_obj = callSubscript("df[, c('x', 'y')]");

        assertEquals("data.frame", actual_obj.getQClass());
        QList actual = (QList) actual_obj;
        assertEquals(2, actual.getLength());
        QObject xcol = actual.getBBInt(0);
        assertEquals(3, xcol.getLength());
        assertQNumericEquals(1, xcol.get(0));
        assertQNumericEquals(3, xcol.get(2));

        QObject ycol = actual.getBBInt(1);
        assertEquals(3, ycol.getLength());
        assertQNumericEquals(4, ycol.get(0));
        assertQNumericEquals(6, ycol.get(2));
    }

	private QObject callSubscript(String code) throws RecognitionException {
		Tree tree = parseExpression(code);
		return _intp.evalSubscript(tree);
	}

	public static void assertQNumericEquals(int expected, QObject actual)
	{
		assertEquals(createNumeric(expected), actual);
	}
	
	public void test_evalExpr_dataFrame_subscriptBB() throws RecognitionException
	{
		// setup
		callEvalExpr("x<-1:3");
		callEvalExpr("y<-4:6");
		callEvalExpr("df<-data.frame(x, y)");

		QObject actual = callSubscriptBB("df[[\"y\"]]");

		assertEquals(3, actual.getLength());
		assertQNumericEquals(4, actual.get(0));
		assertNotNull(actual.toString());
		assertEquals("numeric", actual.getMode());
	}

    public void test_evalExpr_dataFrame_subscriptUSD() throws RecognitionException
    {
        // setup
        callEvalExpr("x<-1:3");
        callEvalExpr("y<-4:6");
        callEvalExpr("df<-data.frame(x, y)");

        QObject actual = callEvalExpr("df$y");

        assertEquals("4 5 6", actual.toString());
    }


    public void test_evalExpr_dataFrame_subscriptBB_int() throws RecognitionException
	{
		// setup
		callEvalExpr("x<-1:3");
		callEvalExpr("y<-4:6");
		callEvalExpr("df<-data.frame(x, y)");

		// R is 1 origin index.
		QObject actual = callSubscriptBB("df[[1]]");

		assertQNumericEquals(1, actual.get(0));
	}

    public void test_evalExpr_dataFrame_logicalSubscriptMultiDim() throws RecognitionException
    {
        // setup
        callEvalExpr("x<-1:3");
        callEvalExpr("y<-4:6");
        callEvalExpr("df<-data.frame(x, y)");

        QObject actual_obj = callEvalExpr("df[c(FALSE, TRUE, FALSE),]");
        assertEquals("data.frame", actual_obj.getQClass());
        QList actual = (QList) actual_obj;
        assertEquals(2, actual.getLength());
        QObject xcol = actual.getBBInt(0);
        assertEquals(1, xcol.getLength());
        assertQNumericEquals(2, xcol.get(0));

        QObject ycol = actual.getBBInt(1);
        assertEquals(1, ycol.getLength());
        assertQNumericEquals(5, ycol.get(0));
    }

	private QObject callSubscriptBB(String code) throws RecognitionException {
		Tree tree = parseExpression(code);
        Tree converted = FunctionCallBuilder.convertSubscriptBBToFuncall(tree);
        return _intp.evalCallFunction(converted);
    }


    public void test_evalExpr_rbind_dataFrame() throws RecognitionException {
        callEvalExpr("df1 <- data.frame(a=1:2, b=3:4)");
        callEvalExpr("df2 <- data.frame(a=5:6, b=7:8)");
        QList df = (QList) callEvalExpr("rbind(df1, df2)");
        assertEquals(2, df.getLength());
        assertQCharEquals("a", df.getAttribute("names").get(0));
        assertQCharEquals("b", df.getAttribute("names").get(1));
        assertEquals(4, df.getBBInt(0).getLength());
        assertQNumericEquals(1, df.getBBInt(0).get(0));
        assertQNumericEquals(5, df.getBBInt(0).get(2));
        assertQNumericEquals(3, df.getBBInt(1).get(0));
        assertQNumericEquals(7, df.getBBInt(1).get(2));
    }

    public void test_evalExpr_rbind_vector() throws RecognitionException {
        callEvalExpr("df1 <- data.frame(a=1:2, b=3:4)");
        QList df = (QList) callEvalExpr("rbind(df1, c(5, 6))");
        assertEquals(2, df.getLength());
        assertQCharEquals("a", df.getAttribute("names").get(0));
        assertQCharEquals("b", df.getAttribute("names").get(1));
        assertEquals(3, df.getBBInt(0).getLength());
        assertQNumericEquals(1, df.getBBInt(0).get(0));
        assertQNumericEquals(5, df.getBBInt(0).get(2));
        assertQNumericEquals(3, df.getBBInt(1).get(0));
        assertQNumericEquals(6, df.getBBInt(1).get(2));
    }

    public void test_evalExpr_rbind_three() throws RecognitionException {
        callEvalExpr("df1 <- data.frame(a=1:2, b=3:4)");
        callEvalExpr("df2 <- data.frame(a=5:6, b=7:8)");
        callEvalExpr("df3 <- data.frame(a=9:10, b=11:12)");
        QList df = (QList) callEvalExpr("rbind(df1, df2, df3)");
        assertEquals(6, df.getBBInt(0).getLength());
    }

    public void test_evalExpr_eqeq() throws RecognitionException {
        QObject result = callEvalExpr("c('abc', 'def', 'hij')=='def'");
        assertEquals(false, result.get(0).isTrue());
        assertEquals(true, result.get(1).isTrue());
        assertEquals(false, result.get(2).isTrue());
    }


    public void test_evalEq_true()
	{
		verifyEq(true, 1, 1);		
	}

	public void test_evalEq_false()
	{
		verifyEq(false, 1, 2);		
	}
	
	public void test_evalNe_true()
	{
		verifyNe(true, 1, 2);		
	}

	public void test_evalNe_false()
	{
		verifyNe(false, 1, 1);		
	}

	
	static interface BinaryCallable {
		QObject evalBinary(QObject a1, QObject a2);
	}
	
	void verifyBinary(boolean expected, int arg1, int arg2, BinaryCallable callable) {
		QObject expectedObj = createLogical(expected);

		QObject arg1Obj = createNumeric(arg1);
		QObject arg2Obj = createNumeric(arg2);
		QObject actual = callable.evalBinary(arg1Obj, arg2Obj);
		
		assertEquals(expectedObj, actual);
		
	}
	
	void verifyNe(boolean expected, int arg1, int arg2) {
		verifyBinary(expected, arg1, arg2, new BinaryCallable() {			
			public QObject evalBinary(QObject a1, QObject a2) {
				return _intp.evalNE(a1, a2);
			}
		});
	}

	
	void verifyEq(boolean expected, int arg1, int arg2) {
		verifyBinary(expected, arg1, arg2, new BinaryCallable() {			
			public QObject evalBinary(QObject a1, QObject a2) {
				return _intp.evalEQ(a1, a2);
			}
		});
	}

	void verifyLe(boolean expected, int arg1, int arg2) {
		verifyBinary(expected, arg1, arg2, new BinaryCallable() {			
			public QObject evalBinary(QObject a1, QObject a2) {
				return _intp.evalLE(a1, a2);
			}
		});
	}
	
	public void test_evalLE_oneLe_true()
	{
		verifyLe(true, 1, 2);
	}
	
	public void test_evalLE_oneLe_false()
	{
		verifyLe(false, 2, 1);
	}
	
	public void test_evalLE_vectorLe()
	{
		
		QObject arg1 = createNumeric(1);
		QObject q3 = createNumeric(3);
		arg1.set(1, q3);
		
		QObject arg2 = createNumeric(2);
		
		QObject actual = _intp.evalLE(arg1, arg2);

		assertEquals(2, actual.getLength());
		assertEquals(createLogical(true), actual.get(0));
		assertEquals(createLogical(false), actual.get(1));
	}
	
	private QObject createLogical(boolean b) {
		return QObject.createLogical(b);
	}

	public void test_evalExpr_int()
	{
		int expected = 3;

		QInterpreter intp = createInterpreter();
		CommonTree arg = createIntTree("3");
		
		QObject actual = intp.evalExprWithoutResolve(arg);
		assertQNumericEquals(expected, actual);
	}
	
	public void test_evalExpr_nullConst()
	{
		QObject expected = QObject.Null;

		CommonTree arg = createTree(QParser.NULL_CONST, null);
		QObject actual = _intp.evalExprWithoutResolve(arg);
		
		assertNumericEquals(expected, actual);
	}
	
	
	public void test_evalExpr_XXBINARY()
	{
		int expected = 3;
		
		CommonTree parent = createTree(QParser.XXBINARY, "");
		// "+" is not STR_CONST, but do this for the times being.
		parent.addChild(createTree(QParser.STR_CONST, "+"));
		parent.addChild(createIntTree("1"));
		parent.addChild(createIntTree("2"));
		
		QObject actual = _intp.evalExprWithoutResolve(parent);
		
		assertQNumericEquals(expected, actual);
	}
	
	
	public void test_evalExpr_subscript_one() throws RecognitionException
	{
		QObject expected = createNumeric(2);
		
		QObject target = createNumeric(1);
		target.set(1, expected);
		_intp._curEnv.put("a", target);
		
		Tree tree = parseExpression("a[2]");
		QObject actual = _intp.evalExprWithoutResolve(tree);
		
		assertNumericEquals(expected, actual);
	}
	
	public void test_eval_subscript_logical() throws RecognitionException
	{
		int expected = 2;
		CommonTree tree = parseExpression("(1:3)[c(FALSE, TRUE, FALSE)]");
		QObject actual = _intp.evalExprWithoutResolve(tree);
		assertQNumericEquals(expected, actual);
	}
	
	public void test_eval_subscript_logical_firstElement()
	{
		int expected = 1;
		QObject actual = _intp.eval("(1:3)[c(TRUE, FALSE, FALSE)]");
		assertQNumericEquals(expected, actual);
	}

    public void test_eval_subscript_logical_NoMuch()
    {
        QObject actual = _intp.eval("(1:3)[FALSE]");
        assertEquals(0, actual.getLength());
        // currently not compatible to R here.
        assertEquals("numeric(0)", actual.toString());
    }

    public void test_evalExpr_length() throws RecognitionException {
        int expected = 5;
        QObject actual = callEvalExpr("length(1:5)");
        assertQNumericEquals(expected, actual);

    }
	
	public void test_evalExpr_sum_flat() throws RecognitionException
	{
		int expected = 6;
		QObject actual = callEvalExpr("sum(1, 2, 3)");
		assertQNumericEquals(expected, actual);
	}
	
	public void test_evalExpr_sum_oneArg() throws RecognitionException
	{
		int expected = 6;
		QObject actual = callEvalExpr("sum(1:3)");
		assertQNumericEquals(expected, actual);
	}
	
	// this test was wrong meaning. But test itself is valid.
	public void test_evalExpr_sum_nest() throws RecognitionException
	{
		int expected = 10;
		QObject actual = callEvalExpr("sum(c(1, c(2, 3), 4))");
		assertQNumericEquals(expected, actual);
	}

    // max and min is almost the same, so min test is just one case.
    public void test_evalExpr_min_flat() throws RecognitionException
    {
        int expected = 1;
        QObject actual = callEvalExpr("min(1, 2, 3)");
        assertQNumericEquals(expected, actual);
    }

    public void test_evalExpr_max_flat() throws RecognitionException
    {
        int expected = 3;
        QObject actual = callEvalExpr("max(1, 2, 3)");
        assertQNumericEquals(expected, actual);
    }

    public void test_evalExpr_max_oneArg() throws RecognitionException
    {
        int expected = 3;
        QObject actual = callEvalExpr("max(1:3)");
        assertQNumericEquals(expected, actual);
    }

    // this test was wrong meaning. But test itself is valid.
    public void test_evalExpr_max_nest() throws RecognitionException
    {
        int expected = 4;
        QObject actual = callEvalExpr("max(1, c(2, 3), 4)");
        assertQNumericEquals(expected, actual);
    }

	
	public void test_evalExpr_asNumeric() throws RecognitionException
	{
		int expected = 127;
		QObject actual = callEvalExpr("as.numeric(\"123\")+4");
		assertQNumericEquals(expected, actual);
	}
	
	public void test_evalExpr_cumsum() throws RecognitionException
	{
		QObject actual = callEvalExpr("cumsum(1:3)");
		
		assertEquals(3, actual.getLength());
		assertQNumericEquals(1, actual.get(0));
		assertQNumericEquals(3, actual.get(1));
		assertQNumericEquals(6, actual.get(2));
		
	}
	
	public void test_eval_mean()
	{
		int expected = 2;
		QObject actual = _intp.eval("mean(1:3)");
		assertQNumericEquals(expected, actual);
	}
	public void test_eval_sqrt_vector()
	{
		QObject actual = _intp.eval("sqrt(1:3)");
		assertEquals(3, actual.getLength());
		assertEquals(Math.sqrt(1), actual.get(0).getDouble());
		assertEquals(Math.sqrt(2), actual.get(1).getDouble());
		assertEquals(Math.sqrt(3), actual.get(2).getDouble());
	}
	
	public void test_eval_sqrt()
	{		
		QObject actual = _intp.eval("sqrt(3)");
		assertEquals(1, actual.getLength());
		assertEquals(Math.sqrt(3), actual.getDouble());
	}
	
	public void test_eval_var()
	{
		int expected = 1;
		QObject actual = _intp.eval("var(1:3)");
		assertQNumericEquals(expected, actual);
	}
	
	public void test_evalExpr_concat() throws RecognitionException
	{
		QObject actual = callEvalExpr("c(1,2,3)");
		assertEquals(3, actual.getLength());
		assertEquals(1, actual.get(0).getInt());
		assertEquals(2, actual.get(1).getInt());
		assertEquals(3, actual.get(2).getInt());
	}
	
	public void test_evalExpr_concat_nest() throws RecognitionException
	{
		QObject actual = callEvalExpr("c(1,c(2,3))");
		assertEquals(3, actual.getLength());
		assertEquals(1, actual.get(0).getInt());
		assertEquals(2, actual.get(1).getInt());
		assertEquals(3, actual.get(2).getInt());
	}

    public void test_evalExpr_rep() throws RecognitionException {
        QObject actual = callEvalExpr("rep(2, 3)");
        assertEquals(3, actual.getLength());
        assertEquals(2, actual.get(0).getInt());
        assertEquals(2, actual.get(1).getInt());
        assertEquals(2, actual.get(2).getInt());
    }

    public void test_evalExpr_rep_vector() throws RecognitionException {
        QObject actual = callEvalExpr("rep(1:2, 2)");
        assertEquals(4, actual.getLength());
        assertEquals(1, actual.get(0).getInt());
        assertEquals(2, actual.get(1).getInt());
        assertEquals(1, actual.get(2).getInt());
        assertEquals(2, actual.get(3).getInt());
    }

    public void test_evalExpr_unique() throws RecognitionException {
        QObject actual = callEvalExpr("unique(c(3, 3, 4, 3, 4, 5, 4))");
        assertEquals(3, actual.getLength());
        assertQNumericEquals(3, actual.get(0));
        assertQNumericEquals(4, actual.get(1));
        assertQNumericEquals(5, actual.get(2));
    }

    public void test_evalExpr_which() throws RecognitionException {
        QObject actual = callEvalExpr("which(c(FALSE, TRUE, FALSE))");
        assertEquals(1, actual.getLength());
        assertQNumericEquals(2, actual.get(0));
    }

    public void test_evalExpr_which_multi() throws RecognitionException {
        QObject actual = callEvalExpr("which(c(TRUE, FALSE, TRUE))");
        assertEquals(2, actual.getLength());
        assertQNumericEquals(1, actual.get(0));
        assertQNumericEquals(3, actual.get(1));
    }

    public void test_evalExpr_which_nomatch() throws RecognitionException {
        QObject actual = callEvalExpr("which(c(FALSE, FALSE, FALSE))");
        assertEquals(0, actual.getLength());
        // this should be integer(0), but currently non compatible.
        assertEquals("numeric(0)", actual.toString());
    }

    public void test_evalExpr_whichmin() throws RecognitionException {
        QObject actual = callEvalExpr("which.min(c(3,4,1,5,2))");
        assertQNumericEquals(3, actual);
    }

    public void test_evalExpr_whichmax() throws RecognitionException {
        QObject actual = callEvalExpr("which.max(c(2,3,1,5,2,3))");
        assertQNumericEquals(4, actual);
    }

	public void test_evalExpr_priority() throws RecognitionException
	{
		int expected = 7;
		QObject actual = callEvalExpr("2*3+1");
		assertQNumericEquals(expected, actual);
		
	}

    public void test_evalExpr_priority2() throws RecognitionException {
        QObject actual = callEvalExpr("10-4+1");
        assertQNumericEquals(7, actual);
    }

    public void test_evalExpr_priorityDiv() throws RecognitionException
    {
        int expected = 2;
        QObject actual = callEvalExpr("2/3*3");
        assertQNumericEquals(expected, actual);

    }

	public void test_evalExpr_subscript_two() throws RecognitionException
	{
		QObject q2 = createNumeric(2);
		
		QObject target = createNumeric(1);
		target.set(1, q2);
		_intp._curEnv.put("a", target);
		
		QObject actual = callEvalExpr("a[1:2]");

		assertEquals(2, actual.getLength());
		assertQNumericEquals(1, actual.get(0));
		assertQNumericEquals(2, actual.get(1));
	}
	
	public void test_evalExpr_isnull_FALSE() throws RecognitionException
	{
		QObject actual = callEvalExpr("is.null(FALSE)");
		assertEquals(QObject.FALSE, actual);
	}

	public void test_evalExpr_isnull_TRUE() throws RecognitionException
	{
		QObject actual = callEvalExpr("is.null(NULL)");
		assertEquals(QObject.TRUE, actual); 		
	}

    public void test_evalExpr_NA() throws RecognitionException
    {
        QObject actual = callEvalExpr("NA");
        assertEquals(QObject.NA, actual);
    }

    public void test_eval_nonExistingSymbol()
    {
        try {
            _intp.eval("notExist");
            fail("should throw QException");
        }catch(QException qe) {
            assertEquals("Error: 1:0: object 'notExist' not found", qe.getMessage());
        }
    }


    public void test_eval_substitute_insideFunction()
	{
		QObject actual = _intp.eval("f <- function(a) { substitute(a); }\nf(1+2+3)");
		assertEquals("(XXBINARY + (XXBINARY + 1 2) 3)", actual.toString());
	}


	public void test_evalExpr_substitute_justSymbol() throws RecognitionException
	{
		QObject actual = callEvalExpr("substitute(a)");
		assertEquals(actual._mode, "call");
		Tree tree = actual.getSexp();
		assertEquals(QParser.SYMBOL, tree.getType());
		assertEquals("a", tree.getText());
	}
	
	public void test_evalExpr_substitute() throws RecognitionException
	{
		QObject actual = callEvalExpr("substitute(2 + 3)");
		// This is not real expectation. But don't care about print expression of substitute now.
		assertEquals("(XXBINARY + 2 3)", actual.toString());
		
	}
	
	public void test_evalExpr_deparse() throws RecognitionException
	{
		QObject actual = callEvalExpr("deparse(substitute(1+2+3))");
		assertEquals("\"1+2+3\"", actual.toString());
	}
	
	public void test_evalExpr_deparse_symbol() throws RecognitionException
	{
		// unbound symbol do not support now.
		callEvalExpr("a<-1");
		QObject actual = callEvalExpr("deparse(substitute(1+2+a))");
		assertEquals("\"1+2+a\"", actual.toString());
	}
	
	public void test_evalExpr_matchArg_exactMatch() throws RecognitionException
	{
		QObject actual = callEvalExpr("match.arg(\"hoge\", c(\"ika\", \"fuga\", \"hoge\", \"higa\"))");
		assertEquals("\"hoge\"", actual.toString());
	}
	
	public void test_evalExpr_matchArg_partialMatch() throws RecognitionException
	{
		QObject actual = callEvalExpr("match.arg(\"ho\", c(\"ika\", \"fuga\", \"hoge\", \"higa\"))");
		assertEquals("\"hoge\"", actual.toString());
	}
	
	// // @Test
	public void test_eval_matchArg_defaultArg()
	{
		QObject actual = _intp.eval("f <- function(tp = c(\"foo\", \"bar\", \"baz\")) { match.arg(tp); }\nf(\"ba\")");
		assertQCharEquals("bar", actual);
	}

    public void test_eval_list_LBBassign() {
        QObject actual = _intp.eval("a <- list(); a[['hoge']]<- 3;a");
        assertQNumericEquals(3, actual.getBB(QObject.createCharacter("hoge")));
    }


    public void test_eval_list_creation() {
        QObject actual = _intp.eval("a <- list();a");
        assertEquals("list", actual.getMode());
    }

    public void test_eval_sapply() {
        QObject actual = _intp.eval("sapply(1:3, function(x) x+1)");
        assertEquals(3, actual.getLength());
        assertQNumericEquals(2, actual.get(0));
        assertQNumericEquals(3, actual.get(1));
        assertQNumericEquals(4, actual.get(2));
    }

    public void test_eval_comment() throws RecognitionException {
        QObject actual = _intp.eval("#Hey this line is test\n3 #hello world \n#last line comment");
        assertQNumericEquals(3, actual);
    }



    private QObject callEvalExpr(String code) throws RecognitionException {
		Tree tree = parseExpression(code);
		QObject actual = _intp.evalExprWithoutResolve(tree);
		return actual;
	}
	
	CommonTree createTree(int type, String val)
	{
		return new CommonTree(new CommonToken(type, val));
	}
	
	// // @Test
	public void test_evalExpr_symbol()
	{
		QInterpreter intp = createInterpreter();
		Object expected = intp._curEnv.get("c");
		
		Object actual = intp.evalExprWithoutResolve(createTree(QParser.SYMBOL, "c"));
		assertEquals(expected, actual);
	}

	private CommonTree createIntTree(String val) {
		return createTree(QParser.DecimalLiteral, val);
	}
	
	// @Test
	public void test_eval_plus_2statements()
	{
		int expected = 9;
		QInterpreter intp = createInterpreter();
		QObject actual = intp.eval("2+3\n4+5");
		assertQNumericEquals(expected, actual);
	}
	
	// @Test
	public void test_eval_plus_3terms()
	{
		int expected = 6;
		QObject actual = _intp.eval("1+2+3");
		assertQNumericEquals(expected, actual);
	}
	
	// @Test
	public void test_evalBinary_assign() throws RecognitionException
	{
		Tree t = parseExpression("x<-3");

		assertNull(_intp._curEnv.get("x"));

		QObject ret = _intp.evalBinary(t.getChild(0), t.getChild(1), t.getChild(2));
		assertEquals(QObject.Null, ret);
		
		assertQNumericEquals(3, _intp._curEnv.get("x"));
	}

	// @Test
	public void test_evalBinary_eqAssign() throws RecognitionException
	{
		Tree t = parseExpressionOrAssign("x=3");

		//the same as test_evalBinary_assign()...
		assertNull(_intp._curEnv.get("x"));

		QObject ret = _intp.evalBinary(t.getChild(0), t.getChild(1), t.getChild(2));
		assertEquals(QObject.Null, ret);
		
		assertQNumericEquals(3, _intp._curEnv.get("x"));
	}
	
	// @Test
	public void test_evalBinary_plus() throws RecognitionException
	{
		int expected = 5;
		QObject actual = evalSimpleBinary("2+3");
		assertQNumericEquals(expected, actual);
	}
	
	// @Test
	public void test_evalBinary_modulo() throws RecognitionException
	{
		int expected = 1;
		QObject actual = evalSimpleBinary("4%%3");
		assertQNumericEquals(expected, actual);
	}
	
	// @Test
	public void test_evalBinary_seq() throws RecognitionException
	{
		QObject actual = evalSimpleBinary("3:5");

		assertEquals(3, actual.getLength());
		assertQNumericEquals(3, actual.get(0));
		assertQNumericEquals(4, actual.get(1));
		assertQNumericEquals(5, actual.get(2));
		
	}

    public void test_evalBinary_power() throws RecognitionException
    {
        QObject actual = evalSimpleBinary("(2:4)^(2:4)");
        assertEquals(3, actual.getLength());
        assertQNumericEquals(4, actual.get(0));
        assertQNumericEquals(27, actual.get(1));
        assertQNumericEquals(256, actual.get(2));
    }

	// @Test
	public void test_evalPlus_normal()
	{
		int expected = 3;
		
		QObject arg1 = QObject.createInt(1);
		QObject arg2 = QObject.createInt(2);
		QObject actual = _intp.evalPlus(arg1, arg2);
		assertQNumericEquals(expected, actual);
	}
	
	public static QObject createInt(int i){ return QObject.createInt(i); }
	
	// @Test
	public void test_evalPlus_vectorPlusScalar()
	{
		QObject vector = QObject.createInt(1);
		QObject r2 = QObject.createInt(2);
		QObject r3 = QObject.createInt(3);
		vector.set(1, r2);
		// (1, 2) + 3 = (4, 5)
		QObject actual = _intp.evalPlus(vector, r3);
		
		assertEquals(2, actual.getLength());
		assertQNumericEquals(4, actual.get(0));
		assertQNumericEquals(5, actual.get(1));
	}
		
	static public QObject createNumeric(int i) {
		return QObject.createNumeric(i);
	}

	// @Test
	public void test_evalPlus_scalarPlusVector()
	{
		QObject vector = QObject.createInt(1);
		QObject r2 = QObject.createInt(2);
		QObject r3 = QObject.createInt(3);
		vector.set(1, r2);
		// 3+(1, 2) = (4, 5)
		QObject actual = _intp.evalPlus(r3, vector);
		
		assertEquals(2, actual.getLength());
		assertQNumericEquals(4, actual.get(0));
		assertQNumericEquals(5, actual.get(1));
	}

	// @Test
	public void test_assignToFormalList_nullFormalList_multipleArg() throws RecognitionException
	{
		Environment target = callAssignToFormalListWithNullFormalList("c(1, 2, 3)");
		QObject ret = target.get(ARGNAME);
		assertEquals(3, ret.getLength());
		
		assertVector123WithResolve(ret);
	}
	
	// @Test
	public void test_assignToFormalList_nullFormalList_vectorArg() throws RecognitionException
	{
		Environment target = callAssignToFormalListWithNullFormalList("data.frame(c(1, 2, 3))");
		QObject ret = target.get(ARGNAME);
		assertEquals(1, ret.getLength());
		
		assertVector123(resolve(ret.get(0)));
	}

	// code should include funcname, like "c(1, 2, 3)"
	private Environment callAssignToFormalListWithNullFormalList(String code) throws RecognitionException {
		Tree subList = buildSubList(code);
		
		Environment target = new Environment(null);
		_intp.assignToFormalList(subList, null, target);
		return target;
	}
	
	private Environment callAssignToFormalList(String formalListCode, String code) throws RecognitionException {
		Tree formalList = parseFormList(formalListCode);
		Tree subList = buildSubList(code);
		
		Environment target = new Environment(null);
		_intp.assignToFormalList(subList, formalList, target);
		return target;
	}
	
	// @Test
	public void test_assignToFormalList_nullFormalList_single() throws RecognitionException
	{
		Environment target = callAssignToFormalListWithNullFormalList("c(1)");
		QObject actual = target.get(ARGNAME);
		
		assertEquals("list", actual.getMode());
		assertEquals(1, actual.getLength());
		assertQNumericEquals(1, resolve(actual.get(0)));
	}

    private void assertVector123WithResolve(QObject ret) {
        assertEquals(3, ret.getLength());
        assertQNumericEquals(1, resolve(ret.get(0)));
        assertQNumericEquals(2, resolve(ret.get(1)));
        assertQNumericEquals(3, resolve(ret.get(2)));
    }


    private void assertVector123(QObject ret) {
		assertEquals(3, ret.getLength());
		assertQNumericEquals(1, ret.get(0));
		assertQNumericEquals(2, ret.get(1));
		assertQNumericEquals(3, ret.get(2));
	}
	
	public final String ARGNAME = "__arg__";
	
	// @Test
	public void test_assignToFormalList() throws RecognitionException
	{
		Tree subList = buildSubList("c(1)");
		
		Environment target = new Environment(null);
		_intp.assignToFormalList(subList, null, target);
		QObject args = target.get(ARGNAME);
		
		assertNotNull(args);
		assertEquals("list", args.getMode());
        assertFalse(((QPromise) args.get(0)).isResolved());
		assertEquals(1.0, resolveAndGetValue(args.get(0)));
	}

    Object resolveAndGetValue(QObject obj) {
        return resolve(obj).getValue();
    }

    private QObject resolve(QObject obj) {
        return _intp.resolveIfNecessary((QPromise) obj);
    }

    // @Test
	public void test_assignToFormalList_begEnd() throws RecognitionException
	{
		Environment target = callAssignToFormalList("beg, end", "seq(1, 10)");
		
		QObject beg = target.get("beg");
		QObject end = target.get("end");
		
		assertNotNull(beg);
		assertNotNull(end);
		assertQNumericEquals(1, resolve(beg));
		assertQNumericEquals(10, resolve(end));
	}
	
	// @Test
	public void test_assignToFormalList_readServer_num_not_updated() throws RecognitionException
	{
		Environment target = callAssignToFormalList("url, table, fields, range, num=10",
				"read.server(\"dummy\", \"dummy\", c(\"dummy\"), num=100)");
		
		QObject num = target.get("num");
		
		assertQNumericEquals(100, resolve(num));
	}

	// code is like "c(1, 2, 3)"
	private Tree buildSubList(String code) throws RecognitionException {
		// (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2) (XXSUB1 3)))
		Tree expr = parseExpression(code);
		Tree subList = expr.getChild(1);
		return subList;
	}
	
	QInterpreter _intp = createInterpreter();

	// @Test
	public void test_evalCallFunction() throws RecognitionException
	{
		// (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2) (XXSUB1 3)))
		Tree expr = parseExpression("c(1, 2, 3)");
		QObject ret = _intp.evalCallFunction(expr);

		assertVector123(ret);		
	}

	private QObject evalSimpleBinary(String code) throws RecognitionException {
		Tree t = parseExpression(code);
		
		return _intp.evalBinary(t.getChild(0), t.getChild(1), t.getChild(2));
	}

	public String getConsoleOutput(QInterpreter intp) {
		String result;
		ConsoleForTest console = (ConsoleForTest)intp.getConsole();
		result = console.Result.toString();
		return result;
	}
		
	public static QInterpreter createInterpreter()
	{
		ConsoleForTest console = new ConsoleForTest();
		return new QInterpreter(console);
	}

	
	// @Test
	public void test_Environment_root()
	{
		QObject expected = QObject.createInt(1);
		Environment env = new Environment(null);
		env.put("a", expected);
		
		assertNull(env.get("dummy"));
		assertEquals(expected,env.get("a"));
	}
	
	// @Test
	public void test_Environment_chain()
	{
		QObject expectedA = QObject.createInt(1);
		QObject expectedB = QObject.createInt(2);

		Environment envParent = new Environment(null);
		envParent.put("a", expectedA);
		Environment envChild = new Environment(envParent);
		envChild.put("b", expectedB);
		
		
		assertNull(envParent.get("b"));
		assertEquals(expectedA, envParent.get("a"));
		
		assertEquals(expectedB, envChild.get("b"));
		assertEquals(expectedA, envChild.get("a"));
	}
}
