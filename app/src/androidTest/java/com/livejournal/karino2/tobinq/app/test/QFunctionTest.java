package com.livejournal.karino2.tobinq.app.test;

import com.livejournal.karino2.tobinq.app.ForestIterater;
import com.livejournal.karino2.tobinq.app.ForestNode;
import com.livejournal.karino2.tobinq.app.QFunction;
import com.livejournal.karino2.tobinq.app.QObject;

import static com.livejournal.karino2.tobinq.app.test.QInterpreterTest.assertQCharEquals;
import static com.livejournal.karino2.tobinq.app.test.QInterpreterTest.assertQNumericEquals;
import static com.livejournal.karino2.tobinq.app.test.QInterpreterTest.createNumeric;
import static junit.framework.Assert.assertEquals;
import com.livejournal.karino2.tobinq.app.QFunction.QObjectForestAdapter;
import com.livejournal.karino2.tobinq.app.SVD_NR;


import junit.framework.TestCase;


public class QFunctionTest extends TestCase {
	// // @Test
	public void test_attributesAsList_null()
	{
		QObject i = createNumeric(0);
		QObject actual = i.attributesAsList();

		assertEquals(true, actual.isNull());
	}

    public void test_svd()
    {
        int nr = 6; int nc = 5 ;
        //int nr = 300; int nc = 300;
        //int nr = 600; int nc = 600;
        double[][] M = new double[nr][nc] ;
        for( int r = 0; r < nr; r++ ) {
            float p = (float)r / (nr-1);
            for( int c = 0; c < nc; c++ ) {
                float frac = (float)c / (nc-1);
                M[r][c] = Math.pow(frac,p);
            }
        }
        double[]   w = new double[nc];
        double[][] V = new double[nc][nc];
        SVD_NR.svd(M, w, V);
        assertEquals(4.014, w[0], 0.001);
    }


	// // @Test
	public void test_attributesAsList_oneAttr()
	{
		QObject i = QObject.createNumeric(0);
		i.setAttribute("hoge", QObject.createCharacter("ika"));
		
		QObject actual = i.attributesAsList();
		assertEquals(1, actual.getLength());
		assertEquals("list", actual.getMode());
		assertQCharEquals("ika", actual.getBB(QObject.createCharacter("hoge")));
	}
	
	// --------- other misc test -------------
    /*
	// // @Test
	public void test_getCurrentLine_onlyOneLine_center()
	{
		String codes = "abc";
		int pos = 1;
		String actual = WebTobinQ.getCurrentLine(pos, codes);
		
		assertEquals(codes, actual);
	}
	
	// // @Test
	public void test_getCurrentLine_onlyOneLine_beg()
	{
		String codes = "abc";
		int pos = 0;
		String actual = WebTobinQ.getCurrentLine(pos, codes);
		
		assertEquals(codes, actual);
	}
	
	// // @Test
	public void test_getCurrentLine_onlyOneLine_end()
	{
		String codes = "abc";
		int pos = 3;
		String actual = WebTobinQ.getCurrentLine(pos, codes);
		
		assertEquals(codes, actual);
	}
	
	// // @Test
	public void test_getCurrentLine_threeLine_secondBegin()
	{
		String expected = "bc";
		
		String codes = "a\nbc\nde";
		int pos = 2;
		String actual = WebTobinQ.getCurrentLine(pos, codes);
		
		assertEquals(expected, actual);
	}
	
	// // @Test
	public void test_getCurrentLine_threeLine_secondEnd()
	{
		String expected = "bc";
		
		String codes = "a\nbc\nde";
		int pos = 4;
		String actual = WebTobinQ.getCurrentLine(pos, codes);
		
		assertEquals(expected, actual);
	}
	*/
	
	
	ForestNode<QFunction.QObjectForestAdapter> nextWithTrailing(ForestIterater<QFunction.QObjectForestAdapter> iter)
	{
		ForestNode<QFunction.QObjectForestAdapter> node = iter.next();
		while(node.getEdge() != ForestNode.Edge.Trailing)
			node = iter.next();
		return node;
	}
	
	// // @Test
	public void test_ForestIterater_flat()
	{
		QObject r2 = createNumeric(2);
		QObject r3 = createNumeric(3);
		
		QObject r = createNumeric(1);
		r.set(1, r2);
		r.set(2, r3);

		ForestIterater<QObjectForestAdapter> iter = QFunction.createForestIterater(r, QInterpreterTest.createInterpreter());
		assertEquals(true, iter.hasNext());
		
		ForestNode<QObjectForestAdapter> node = nextWithTrailing(iter);
		assertQNumericEquals(1, node.getElement()._self);
		
		assertEquals(true, iter.hasNext());
		node = nextWithTrailing(iter);
		assertQNumericEquals(2, node.getElement()._self);
		
		assertEquals(true, iter.hasNext());
		node = nextWithTrailing(iter);
		assertQNumericEquals(3, node.getElement()._self);
		
		// root remains
		assertEquals(true, iter.hasNext());		
		nextWithTrailing(iter);
		
		assertEquals(false, iter.hasNext());
	}

	// // @Test
	public void test_ForestIterater_2level()
	{
		QObject r2 = createNumeric(2);
		QObject r3 = createNumeric(3);
		QObject r4 = createNumeric(4);
		
		QObject r = createNumeric(1);
		r2.set(1, r4);
		r.set(1, r2);
		r.set(2, r3);
		
		// c(1, c(2, 4), 3)

		ForestIterater<QObjectForestAdapter> iter = QFunction.createForestIterater(r, QInterpreterTest.createInterpreter());
		assertEquals(true, iter.hasNext());
		
		ForestNode<QObjectForestAdapter> node = nextWithTrailing(iter);
		assertQNumericEquals(1, node.getElement()._self);
		
		node = nextWithTrailing(iter);
		assertQNumericEquals(2, node.getElement()._self);
		
		node = nextWithTrailing(iter);
		assertQNumericEquals(4, node.getElement()._self);
		
		// skip trailing c(2, 4)
		node = nextWithTrailing(iter);
		
		node = nextWithTrailing(iter);
		assertQNumericEquals(3, node.getElement()._self);
		
		
		// root remains
		assertEquals(true, iter.hasNext());		
		nextWithTrailing(iter);
		
		assertEquals(false, iter.hasNext());
	}

}
