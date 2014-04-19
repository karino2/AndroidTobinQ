package com.livejournal.karino2.tobinq.app.test;


import com.livejournal.karino2.tobinq.app.FunctionCallBuilder;
import com.livejournal.karino2.tobinq.app.QLexer;
import com.livejournal.karino2.tobinq.app.QParser;

import junit.framework.TestCase;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;



public class QParserTest extends TestCase {
	public static CommonTree parseProg(String code) throws RecognitionException {
		QParser parser = createParser(code);
		
 		QParser.prog_return actual = parser.prog();
 	    CommonTree actual_tree = (CommonTree)actual.getTree();
		return actual_tree;
	}

    // used to create func call argument inside XXXapply
    public void test_sublist_only() throws RecognitionException {
        Tree actual = (Tree)createParser("hoge").sublist().getTree();
        String deb = actual.toStringTree();
        assertEquals("(XXSUBLIST (XXSUB1 hoge))", deb);
    }
	
	public void test_prog_twoAssign() throws RecognitionException
	{
		CommonTree actual = parseProg("x<-c(1,2,3)\ny<-c(5,76)");
		assertEquals(2, actual.getChildCount());
		assertEquals(QParser.XXVALUE, actual.getChild(0).getType());
		assertEquals(QParser.XXVALUE, actual.getChild(1).getType());
	}

	public void test_prog_threeAssign() throws RecognitionException
	{
		CommonTree actual = parseProg("x<-c(1,2,3)\ny<-c(5,76)\nz<-c(2, 3)");
		assertEquals(3, actual.getChildCount());
		assertEquals(QParser.XXVALUE, actual.getChild(0).getType());
		assertEquals(QParser.XXVALUE, actual.getChild(1).getType());
		assertEquals(QParser.XXVALUE, actual.getChild(2).getType());
	}
	
	
	public static CommonTree parseExpression(String code) throws RecognitionException {
		QParser parser = createParser(code);
		
 		QParser.expr_return actual = parser.expr();
 	    CommonTree actual_tree = (CommonTree)actual.getTree();
		return actual_tree;
	}
	
	public static CommonTree parseLExpression(String code) throws RecognitionException {
		QParser parser = createParser(code);
		
 		QParser.lexpr_return actual = parser.lexpr();
 	    CommonTree actual_tree = (CommonTree)actual.getTree();
		return actual_tree;
	}

	
	public static CommonTree parseExpressionOrAssign(String code) throws RecognitionException {
		QParser parser = createParser(code);
		
 		QParser.expr_or_assign_return actual = parser.expr_or_assign();
 	    CommonTree actual_tree = (CommonTree)actual.getTree();
		return actual_tree;
	}
	
	public void test_expr_plusBinary() throws RecognitionException
	{
		String code = "2+3";
		CommonTree actual_tree = parseExpression(code);

		assertEquals(QParser.XXBINARY, actual_tree.getType());
		// + is not symbol in R.
		assertEqualsNoType("+", actual_tree.getChild(0));
		assertIntEquals(2, actual_tree.getChild(1));
		assertIntEquals(3, actual_tree.getChild(2));		
		
	}
	
	public void test_expr_subscript() throws RecognitionException
	{
		// (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 1)))
		CommonTree actual_tree = parseExpression("a[1]");
		assertEquals(QParser.XXSUBSCRIPT, actual_tree.getType());
		assertEqualsNoType("[", actual_tree.getChild(0));
		assertEquals(QParser.XXSUBLIST, actual_tree.getChild(2).getType());
	}
	
	public void test_expr_subscript_row() throws RecognitionException
	{
		// (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 1) XXSUB0))
		CommonTree actual_tree = parseExpression("a[1, ]");
		assertEquals("(XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 1) XXSUB0))", actual_tree.toStringTree());
	}
	
	public void test_expr_subscript_subscript() throws RecognitionException
	{
		CommonTree actual_tree = parseExpression("a[[1]][2]");
		assertEquals("(XXSUBSCRIPT [ (XXSUBSCRIPT [[ a (XXSUBLIST (XXSUB1 1))) (XXSUBLIST (XXSUB1 2)))", actual_tree.toStringTree());
	}
	
	public void test_expr_lvalSubscript() throws RecognitionException
	{
		CommonTree actual_tree = parseExpression("a[1]-b[1]");
		// (XXBINARY - (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 1))) (XXSUBSCRIPT [ b (XXSUBLIST (XXSUB1 1))))
		assertEquals(3, actual_tree.getChildCount());
	}
	
	public void test_expr_function() throws RecognitionException
	{
		CommonTree actual_tree = parseExpression("function(){1; 2}");
		assertEquals("(XXDEFUN XXFORMALLIST (XXEXPRLIST 1 2))", actual_tree.toStringTree());
	}
	
	public void test_expr_function_newline() throws RecognitionException
	{
		CommonTree expect_tree = parseExpression("function(){1; 2}");
		CommonTree actual_tree = parseExpression("function(){\n1; 2}");
		assertEquals(expect_tree.toStringTree(), actual_tree.toStringTree());
	}
	
	public void debP(CommonTree tree)
	{
		System.out.println(tree.toStringTree());		
	}
	
	public void test_lexpr_for() throws RecognitionException
	{
		CommonTree actual_tree = parseLExpression("for(i in 1:10){ b <- i*2; e <- i*13;}");
		assertEquals("(XXFOR (XXFORCOND i (XXBINARY : 1 10)) (XXEXPRLIST (XXBINARY <- b (XXBINARY * i 2)) (XXBINARY <- e (XXBINARY * i 13))))", actual_tree.toStringTree());
	}

    public void test_multicative_priority() throws RecognitionException
    {
        CommonTree actual = parseExpression("2/3*3");
        assertEquals("(XXBINARY * (XXBINARY / 2 3) 3)", actual.toStringTree());
    }

    // (XXBINARY : (XXBINARY %*% (XXFUNCALL matrix (XXSUBLIST (XXSUB1 (XXBINARY : 1 3)) (XXSYMSUB1 ncol 3))) 1) 3)
    public void test_seq_priority() throws RecognitionException {
        CommonTree actual = parseExpression("a * 1:2");
        assertEquals("(XXBINARY * a (XXBINARY : 1 2))", actual.toStringTree());
    }

    public void test_spacial_priority() throws RecognitionException {
        CommonTree actual = parseExpression("a %*% 1:2");
        assertEquals("(XXBINARY %*% a (XXBINARY : 1 2))", actual.toStringTree());
    }

    /*
            FunctionCallBuilder Test.
     */
    public void test_FunctionCallBuilder() throws RecognitionException {
        // a <- b
        // (XXBINARY = a b)
        CommonTree binary = parseExpressionOrAssign("a = b");
        FunctionCallBuilder builder = new FunctionCallBuilder();
        builder.setFunctionName("<-");
        builder.addArgument(binary.getChild(1));
        builder.addNamedArgument("values", binary.getChild(2));

        CommonTree actual = builder.build();
        Tree child0 = actual.getChild(0);
        Tree child1 = actual.getChild(1);
        Tree child1_0 = child1.getChild(0);
        Tree child1_1 = child1.getChild(1);
        Tree child1_1_0 = child1_1.getChild(0);
        String deb = child1_0.toStringTree();

        assertEquals("(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))", actual.toStringTree());
    }

    public void test_convertAssignToFuncall() throws RecognitionException {
        // (XXBINARY = a b)
        CommonTree binary = QParserTest.parseExpressionOrAssign("a = b");
        CommonTree actual = FunctionCallBuilder.convertAssignToFuncall(binary.getChild(0), binary.getChild(1), binary.getChild(2));
        assertEquals("(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))", actual.toStringTree());
    }

    public void test_convertAssignToFuncall_rightHandFunction() throws RecognitionException {
        CommonTree binary = QParserTest.parseExpressionOrAssign("a = c(1, 2)");
        CommonTree actual = FunctionCallBuilder.convertAssignToFuncall(binary.getChild(0), binary.getChild(1), binary.getChild(2));
        assertEquals("(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values (XXFUNCALL c (XXSUBLIST (XXSUB1 1) (XXSUB1 2))))))", actual.toStringTree());
    }

    public void test_convertSubscriptBracketAssignToFuncall() throws RecognitionException {
        CommonTree binary = QParserTest.parseExpressionOrAssign("a[1] <- 2");
        CommonTree actual = FunctionCallBuilder.convertSubscriptBracketAssignToFuncall(binary.getChild(0), binary.getChild(1), binary.getChild(2));
        assertEquals("(XXFUNCALL [<- (XXSUBLIST (XXSUB1 a) (XXSUB1 1) (XXSUB1 2)))", actual.toStringTree());
    }

    public void test_convertSubscriptBracketAssignToFuncall_multiDim() throws RecognitionException {
        CommonTree binary = QParserTest.parseExpressionOrAssign("a[1, 2] <- 3");
        CommonTree actual = FunctionCallBuilder.convertSubscriptBracketAssignToFuncall(binary.getChild(0), binary.getChild(1), binary.getChild(2));
        assertEquals("(XXFUNCALL [<- (XXSUBLIST (XXSUB1 a) (XXSUB1 1) (XXSUB1 2) (XXSUB1 3)))", actual.toStringTree());
    }

    public void test_convertSubscriptBracket() throws RecognitionException {
        CommonTree binary = QParserTest.parseExpressionOrAssign("a[1]");
        CommonTree actual = FunctionCallBuilder.convertSubscriptBracketToFuncall(binary);
        String deb = actual.toStringTree();
        assertEquals("(XXFUNCALL [ (XXSUBLIST (XXSUB1 a) (XXSUB1 (XXSUBLIST (XXSUB1 1)))))", actual.toStringTree());
    }

    // 		QObject actual_obj = callSubscript("df[2:3,]");
    public void test_convertSubscriptBracket_colMissing() throws RecognitionException {
        CommonTree binary = QParserTest.parseExpressionOrAssign("a[1,]");
        CommonTree actual = FunctionCallBuilder.convertSubscriptBracketToFuncall(binary);
        String deb = actual.toStringTree();
        assertEquals("(XXFUNCALL [ (XXSUBLIST (XXSUB1 a) (XXSUB1 (XXSUBLIST (XXSUB1 1) XXSUB0))))", actual.toStringTree());
    }


    public void test_funcall_temp() throws RecognitionException
    {
        CommonTree actual = parseExpression("matrix(1:3, ncol=3) %*% 1:3");
        String deb = actual.toStringTree();
        // assertEquals("dummy", deb);


        /*
        // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)) (XXSUB1 3))) c)
        CommonTree actual = parseExpression("a[1:2, 3] <- c");
        */

        /*
        // (XXBINARY <- (XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 (XXBINARY : 1 2)))) c)
        CommonTree actual = parseExpression("a[1:2] <- c");
         */


        // (XXFUNCALL a (XXSUBLIST (XXSUB1 b) (XXSYMSUB1 values c)))
        /*
        CommonTree actual = parseExpression("a(b, values=c)");
        Tree arg1 = actual.getChild(1);
        Tree arg1_0 = arg1.getChild(0);
        String deb1 = arg1_0.toStringTree();
        String deb = actual.toStringTree();
        */

        /*
        // (XXFUNCALL hoge (XXSUBLIST (XXSUB1 2) (XXSUB1 a) (XXSYMSUB1 values c)))
        CommonTree actual = parseExpression("a <- b");
        String deb = actual.toStringTree();
        Tree arg0 = actual.getChild(0);
        Tree arg1 = actual.getChild(1);
        assertEquals("(XXBINARY * (XXBINARY / 2 3) 3)", actual.toStringTree());
        */
    }


    public void test_expr_paren() throws RecognitionException
	{
		CommonTree actual_tree = parseExpression("(1+2)/3");
		// (XXBINARY / (XXPAREN (XXBINARY + 1 2)) 3)
		assertEquals(QParser.XXPAREN, actual_tree.getChild(1).getType());
	}

	public void test_expr_dotsymbol() throws RecognitionException
	{
		CommonTree actual = parseExpression("gdp.year");
		assertEquals("gdp.year", actual.getText());
	}
	
	private void assertEqualsNoType(String expect, Tree actual) {
		assertEquals(expect, actual.getText());
	}
	

	public void assertStringEquals(String expect, Tree actual) {
		assertStringOrSymbol(expect, actual, QParser.STR_CONST);
	}
	
	public void assertSymbolEquals(String expect, Tree actual) {
		assertStringOrSymbol(expect, actual, QParser.SYMBOL);
	}

	private void assertStringOrSymbol(String expect, Tree actual, int expectType) {
		assertEquals(expectType, actual.getType());
		assertEquals(expect, actual.getText());
	}

	private void assertIntEquals(int expect, Tree actual) {
		assertEquals(QParser.DecimalLiteral, actual.getType());
		assertEquals(expect, (int)Integer.valueOf(actual.getText()));
	}
	
	public void test_formlist_nullArg() throws RecognitionException
	{
		String code = "";
		CommonTree actual_tree = parseFormList(code);
 	    
 	    assertEquals(actual_tree.getType(), QParser.XXFORMALLIST);
 	    assertEquals(actual_tree.getChildCount(), 0);
	}
	
	public void test_formlist_oneArgSymbol() throws RecognitionException
	{
		String code = "x";
		CommonTree actual_tree = parseFormList(code);
		
 	    assertEquals(actual_tree.getType(), QParser.XXFORMALLIST);
 	    assertEquals(actual_tree.getChildCount(), 1);
	}


	public static CommonTree parseFormList(String code) throws RecognitionException {
		QParser parser = createParser(code);
		
 		QParser.formlist_return actual = parser.formlist();
 	    CommonTree actual_tree = (CommonTree)actual.getTree();
		return actual_tree;
	}

	public static QParser createParser(String code) {
		QLexer lex = createLexer(code);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		QParser parser = new QParser(tokens);
		return parser;
	}

	private static QLexer createLexer(String code) {
		CharStream codes = new ANTLRStringStream(code);
		QLexer lex = new QLexer(codes);
		return lex;
	}

}
