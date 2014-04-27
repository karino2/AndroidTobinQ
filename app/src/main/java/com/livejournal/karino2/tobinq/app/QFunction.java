package com.livejournal.karino2.tobinq.app;

import android.graphics.Color;

import org.achartengine.chart.PointStyle;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import com.livejournal.karino2.tobinq.app.ForestNode.*;

import java.util.HashMap;
import java.util.Random;


public class QFunction extends QObject {
	Tree _body;
	Tree _formalList;
	
	public final String ARGNAME = "__arg__";
	public static Tree parseFormalList(String code)
	{
        QParser parser = createParser(code);
		try {
			return (Tree)parser.formlist().getTree();
		} catch (RecognitionException e) {
			// This input is statically determined.
			// Never come here if once it passed.
			e.printStackTrace();
		}
		return null;
	}

    public static Tree parseExpr(String code)
    {
        QParser parser = createParser(code);
        try {
            return (Tree)parser.expr().getTree();
        } catch (RecognitionException e) {
            // This input is statically determined.
            // Never come here if once it passed.
            e.printStackTrace();
        }
        return null;
    }

    private static QParser createParser(String code) {
        CharStream codes = new ANTLRStringStream(code);
        QLexer lex = new QLexer(codes);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        return new QParser(tokens);
    }

    public QFunction(Tree formalList, Tree body)
	{
		super("function");
		_formalList = formalList;
		_body = body;
	}
	
	public Tree getFormalList() { return _formalList; }
	public Tree getBody() { return _body; }
	
	public boolean isPrimitive() { return false; }
	public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
	{
		return null;
	}
	
	public QObject QClone() {
		return this;
	}

    public static QObject resolve(QObject obj, QInterpreter intp) {
       return intp.resolveIfNecessary(obj);
    }

    public abstract static class QPrimitive extends QFunction {
        public QPrimitive(Tree formalList) {
            super(formalList, null);
        }
        public boolean isPrimitive() {return true; }
        public abstract QObject callPrimitive(Environment funcEnv, QInterpreter intp);
    }


    // "matrix"
    public static QFunction createMatrix() {
        return new QPrimitive(parseFormalList("data=NA, nrow=1, ncol=1, byrow = FALSE, dimnames = NULL")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject nrow = getR(funcEnv, "nrow", intp);
                QObject ncol = getR(funcEnv, "ncol", intp);
                QObject data = getR(funcEnv, "data", intp);

                int irow = nrow.getInt();
                int icol = ncol.getInt();
                return createRawMatrix(data, irow, icol);
            }
        };
    }

    // %*%
    interface VectorMatrixAdapter {
        int getRowNum();
        int getColNum();
        QObject rawGetByRowCol(int row, int col);
    }
    public static QFunction createSpecialMultiply() {
        return new QPrimitive(parseFormalList("e1, e2")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject term1 = getR(funcEnv, "e1", intp);
                QObject term2 = getR(funcEnv, "e2", intp);

                if(term1.getQClass() == "matrix" &&
                        term2.getQClass() == "matrix")
                {
                    return matrixMatrixCrossProduct(term1, term2);
                }
                else if(term1.getQClass() == "matrix")
                {
                    return matrixVectorCrossProduct(term1, term2);


                }
                else
                    throw new QException("NYI: cross product, first term is not matrix");
           }


            private QObject matrixVectorCrossProduct(QObject term1, final QObject term2) {
                VectorMatrixAdapter term2wrapper = new VectorMatrixAdapter() {
                    @Override
                    public int getRowNum() {
                        return term2.getLength();
                    }
                    @Override
                    public int getColNum() {
                        return 1;
                    }
                    @Override
                    public QObject rawGetByRowCol(int row, int col) {
                        return term2.get(row);

                    }
                };
                return matrixMatrixProductCommon(term1, term2wrapper);
            }

            private QObject matrixMatrixProductCommon(QObject term1, VectorMatrixAdapter term2wrapper) {
                if(term1.getColNum() != term2wrapper.getRowNum())
                    throw new QException("%*%: non-conformable arguments");
                QObject ret = createRawMatrix(QObject.NA, term1.getRowNum(), term2wrapper.getColNum());
                int resultCol = 0;
                for(int resultRow = 0; resultRow < term1.getRowNum(); resultRow++)
                {
                    double sum = 0;
                    for(int icol = 0; icol < term1.getColNum(); icol++)
                    {
                        double arg1 = term1.rawGetByRowCol(resultRow, icol).getDouble();
                        double arg2 = term2wrapper.rawGetByRowCol(icol, resultCol).getDouble();
                        sum += arg1*arg2;
                    }
                    ret.rawSetByRowCol(resultRow, resultCol, QObject.createNumeric(sum));
                }
                return ret;
            }

            private QObject matrixMatrixCrossProduct(QObject term1, final QObject term2) {
                VectorMatrixAdapter term2wrapper = new VectorMatrixAdapter() {
                    @Override
                    public int getRowNum() {
                        return term2.getRowNum();
                    }
                    @Override
                    public int getColNum() {
                        return term2.getColNum();
                    }

                    @Override
                    public QObject rawGetByRowCol(int row, int col) {
                         return term2.rawGetByRowCol(row, col);
                    }
                };
                return matrixMatrixProductCommon(term1, term2wrapper);
            }
        };
    }

    static QObject createRawMatrix(QObject data, int irow, int icol) {
        QObject matrix;
        if(data.isNA())
            matrix = QObject.createNumeric(0);
        else
            matrix = data.QClone();

        matrix.setAttribute("class", QObject.createCharacter("matrix"));

        QObject dim =QObject.createNumeric(irow);
        dim.set(1, QObject.createNumeric(icol));
        matrix.setAttribute("dim", dim);

        return matrix;
    }



    // "c"
	public static QFunction createConcatinate()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				QObjectBuilder bldr = new QObjectBuilder();
				for(int i = 0; i < args.getLength(); i++)
				{
					// should validate args here.
					QObject obj = getIR(args, i, intp);
					if(obj.getLength() == 1)
						bldr.add(obj);
					else
					{
						for(int j = 0; j < obj.getLength(); j++)
						{
							bldr.add(getIR(obj, j, intp));
						}
					}
				}
				return bldr.result();
				
			}
		};
	}

    // getWithResolved, but use too often so I add short name.
    static QObject getR(Environment funcEnv, String valName, QInterpreter intp) {
        return resolve(funcEnv.get(valName), intp);
    }
	
	// "seq"
	public static QFunction createSeq()
	{
		return new QFunction(parseFormalList("beg, end, by=1"), null) {
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject begO = getR(funcEnv, "beg", intp);
				QObject endO = getR(funcEnv, "end", intp);
				if(begO == null || endO == null)
					throw new QException("seq argument seems wrong");
				double beg = begO.getDouble();
				double end = endO.getDouble();
				
				QObject res = new QObject("numeric");
				for(int i = 0; i <= end-beg; i++)
				{
					res.set(i, QObject.createNumeric(beg+i));
				}
				return res;				
			}
		};
	}

    // only support x, times. and x should be num or num vector now.
    // "rep"
    public static QFunction createRep()
    {
        // x, times = 1, length.out = NA, each = 1
        return new QFunction(parseFormalList("x, times = 1, each = 1"), null) {
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject x = getR(funcEnv, "x", intp);
                QObject times = getR(funcEnv, "times", intp);

                QObject ret = new QObject("numeric");
                for(int i = 0; i < times.getInt(); i++) {
                    for(int l = 0; l < x.getLength(); l++) {
                        ret.set(i*x.getLength()+l, getIR(x, l, intp));
                    }
                }
                return ret;
            }
        };
    }


    static int[] DEFAULT_COLORS = new int[] { Color.RED, Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.CYAN,
            Color.BLUE };
    static int CURRENT_POS = 0;
    static void RESET_DEFAULT_COLOR() {
        CURRENT_POS = 0;
    }
    static int GET_DEFAULT_COLOR() {
        CURRENT_POS = (CURRENT_POS+1)%DEFAULT_COLORS.length;
        return DEFAULT_COLORS[CURRENT_POS];
    }

	
	public static Plotable _plotable;

    private static XYMultipleSeriesDataset dataset = new XYMultipleSeriesDataset();
    private static XYMultipleSeriesRenderer renderer = new XYMultipleSeriesRenderer();


    // "plot"
	public static QObject createPlot(Plotable plotable) {
		_plotable = plotable;
		return new QFunction(parseFormalList("x, y, main=NULL, xlim=NULL, ylim=NULL, xlab=NULL, ylab=NULL, type=\"p\""), null) {
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject x = getR(funcEnv, "x", intp);
				QObject y = getR(funcEnv, "y", intp);
                QObject xlim = getR(funcEnv, "xlim", intp);
				QObject ylim = getR(funcEnv, "ylim", intp);
				QObject main = getR(funcEnv, "main", intp);
                QObject xlab = getR(funcEnv, "xlab", intp);
                QObject ylab = getR(funcEnv, "ylab", intp);
                QObject typ = getR(funcEnv, "type", intp);
				if(x.getLength() != y.getLength())
					throw new QException("x, y length differ");
				// _plotable.resetChart();

                // renderer hold XYAxis related param. So recreate is better.
                RESET_DEFAULT_COLOR();
                dataset = new XYMultipleSeriesDataset();
                renderer = new XYMultipleSeriesRenderer();
                renderer.setChartTitleTextSize(30);
                renderer.setAxisTitleTextSize(20);
                renderer.setLabelsTextSize(20);
                renderer.setLegendTextSize(20);
                renderer.setLegendHeight(50);
                renderer.setMargins(new int[]{50, 50, 50, 60});
                renderer.setXLabelsColor(Color.WHITE);


                XYSeriesRenderer thisRenderer = new XYSeriesRenderer();
                thisRenderer.setColor(GET_DEFAULT_COLOR());
                renderer.addSeriesRenderer(thisRenderer);

				if(ylim != QObject.Null)
				{
					if(ylim.getLength() != 2)
						throw new QException("ylim is not 2 element object");
                    renderer.setYAxisMin(getIR(ylim, 0, intp).getDouble());
                    renderer.setYAxisMax(getIR(ylim, 1, intp).getDouble());
				}

                if(xlim != QObject.Null)
                {
                    if(xlim.getLength() != 2)
                        throw new QException("xlim is not 2 element object");
                    renderer.setXAxisMin(getIR(xlim, 0, intp).getDouble());
                    renderer.setXAxisMax(getIR(xlim, 1, intp).getDouble());
                }

                if(main != QObject.Null)
                    renderer.setChartTitle((String)main.getValue());

                if(xlab != QObject.Null)
                    renderer.setXTitle((String)xlab.getValue());

                if(ylab != QObject.Null)
                    renderer.setYTitle((String)ylab.getValue());

                XYSeries series = new XYSeries("");


			    addPoints(x, y, series, intp);

                if(typ.getValue().equals("o") ||
                        typ.getValue().equals("b"))
                    thisRenderer.setPointStyle(PointStyle.SQUARE);

                dataset.addSeries(series);
                _plotable.setDatasetRenderer(dataset, renderer);
			    
			    _plotable.showChart();
			    
				return QObject.Null;
			}
		};
	}


    QObject toQVector(double[] values)
    {
        QObjectBuilder bldr = new QObjectBuilder();
        for(double v : values)
        {
            bldr.add(QObject.createNumeric(v));
        }
        return bldr.result();
    }

    // "svd"
    public static QObject createSvd() {
        return new QPrimitive(parseFormalList("x")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject matrix = getR(funcEnv, "x", intp);
                double[][] darray = toDoubleArray(matrix);
                double[]   w = new double[matrix.getColNum()];
                double[][] V = new double[matrix.getColNum()][matrix.getColNum()];
                SVD_NR.Rsvd(darray, w, V);
                QList ret = QList.createList();
                ret.setNamesAttr(new String[] {"d", "u", "v"});
                ret.set(0, toQVector(w));
                ret.set(1, toQMatrix(darray));
                ret.set(2, toQMatrix(V));
                return ret;
            }

            private QObject toQMatrix(double[][] s) {
                QObject matrix = createRawMatrix(QObject.NA, s.length, s[0].length);
                for(int row = 0; row < s.length; row++)
                {
                    for(int col = 0; col < s[0].length; col++)
                    {
                        matrix.rawSetByRowCol(row, col, QObject.createNumeric(s[row][col]));
                    }
                }
                return matrix;
            }

            private double[][] toDoubleArray(QObject matrix) {
                double[][] darray = new double[matrix.getRowNum()][matrix.getColNum()];
                for(int row = 0; row < matrix.getRowNum(); row++)
                {
                    for(int col = 0; col < matrix.getColNum(); col++)
                    {
                        darray[row][col] = matrix.rawGetByRowCol(row, col).getDouble();
                    }
                }
                return darray;
            }
        };
    }

    // "t"
    public static QObject createTranspose() {
        return new QPrimitive(parseFormalList("x")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject mat = getR(funcEnv, "x", intp);
                QObjectBuilder bldr = new QObjectBuilder();
                for(int row = 0; row < mat.getRowNum(); row++) {
                    for(int col = 0; col < mat.getColNum(); col++)
                    {
                        bldr.add(mat.rawGetByRowCol(row, col));
                    }
                }
                return createRawMatrix(bldr.result(), mat.getColNum(), mat.getRowNum());
            }
        };
    }

    // "diag"
    public static QObject createDiag() {
        return new QPrimitive(parseFormalList("x")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject v = getR(funcEnv, "x", intp);
                QObject m = createRawMatrix(QObject.NA, v.getLength(), v.getLength());
                QObject zero = QObject.createNumeric(0);
                for(int row = 0; row < v.getLength(); row++) {
                    for(int col = 0; col < v.getLength(); col++)
                    {
                        if(row == col)
                            m.rawSetByRowCol(row, col, v.get(row));
                        else
                            m.rawSetByRowCol(row, col, zero);
                    }
                }
                return m;
            }
        };
    }


    public static QObject createLines(Plotable plotable) {
		// Share to createPlot. Be careful!
		_plotable = plotable;
		return new QFunction(parseFormalList("x, y=NULL,type=\"l\""), null) {
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject x = getR(funcEnv, "x", intp);
				QObject y = getR(funcEnv, "y", intp);
                QObject typ = getR(funcEnv, "type", intp);
				if(QObject.Null.equals(y))
					throw new QException("lines: y=NULL, NYI");
				if(x.getLength() != y.getLength())
					throw new QException("lines: x, y length differ");

                XYSeries series = new XYSeries("");
			    addPoints(x, y, series, intp);
                dataset.addSeries(series);

                XYSeriesRenderer thisRenderer = new XYSeriesRenderer();
                thisRenderer.setColor(GET_DEFAULT_COLOR());
                renderer.addSeriesRenderer(thisRenderer);

                if(typ.getValue().equals("o") ||
                        typ.getValue().equals("b"))
                    thisRenderer.setPointStyle(PointStyle.SQUARE);

			    _plotable.showChart();
				return QObject.Null;
			}			
		};
	}
    private static void addPoints(QObject x, QObject y, XYSeries series, QInterpreter intp) {
        for (int i = 0; i < x.getLength(); i++)
        {
            double x1 = getIR(x, i, intp).getDouble();
            double y1 = getIR(y, i, intp).getDouble();
            series.add(x1, y1);
        }
    }

    // currently, x and y is just ignored.
    public static QObject createLegend(Plotable plotable) {
        // Share to createPlot. Be careful!
        _plotable = plotable;
        return new QFunction(parseFormalList("x, y=NULL, legend"), null) {
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject legend = getR(funcEnv, "legend", intp);
                if(QObject.Null.equals(legend))
                    throw new QException("at legend(), argument legend=NULL");

                for(int i = 0; i < legend.getLength(); i++) {
                    if(i >= dataset.getSeriesCount())
                        break;
                    dataset.getSeriesAt(i).setTitle((String)getIR(legend, i, intp).getValue());
                }

                _plotable.showChart();
                return QObject.Null;
            }
        };
    }


    public static double sumObj(QObject obj, QInterpreter intp)
	{
		int len = obj.getLength();
		double sum = 0;
		for(int i = 0; i < len; i++)
		{
			sum += getIR(obj, i, intp).getDouble();
		}
		return sum;
	}
	
	public static QFunction createVar()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				if(args.getLength() != 1)
					throw new QException("Argument of var should be 1");
				QObject arg = getIR(args, 0, intp);
				int len = arg.getLength();
				double mean = sumObj(arg, intp)/len;
				
				double var = 0;
				for(int i = 0; i < len; i++)
				{
					double x = getIR(arg, i, intp).getDouble();
					var += (x - mean)*(x-mean);
				}
				var = var/(len-1);
				return QObject.createNumeric(var);
				
			}
		};
	}
	
	public static class QObjectForestAdapter {
		QObjectForestAdapter _parent;
		public QObject _self;
		int _childIndex;
		public QObjectForestAdapter(QObjectForestAdapter parent, QObject slf, int childIndex) {
			_parent = parent;
			_self = slf;
			_childIndex = childIndex;
		}
		public QObjectForestAdapter getParent()
		{
			return _parent;
		}
	}
	
	public static ForestIterater<QObjectForestAdapter> createForestIterater(QObject rootObj, final QInterpreter intp) {
		QObjectForestAdapter rootAda = new QObjectForestAdapter(null, rootObj, 0);
		ForestNode<QObjectForestAdapter> root = new ForestNode<QObjectForestAdapter>(new Traversable<QObjectForestAdapter>(){

			public QObjectForestAdapter getChild(QObjectForestAdapter elem,
					int i) {
				// this is not child for some case. but I guess it's ok for this case.
				QObject child = intp.resolveIfNecessary(elem._self.get(i));
				return new QObjectForestAdapter(elem, child, i);
			}

			public QObjectForestAdapter getParent(QObjectForestAdapter elem) {
				return elem.getParent();
			}

			public int getChildCount(QObjectForestAdapter elem) {
				QObject obj = elem._self;
				if(obj.getMode() == QList.LIST_TYPE)
					return obj.getLength();
				// in this case, obj is leaf
				if(obj.getLength() == 1)
					return 0;
				return obj.getLength();
			}

			public int getChildIndex(QObjectForestAdapter elem) {
				return elem._childIndex;
			}
			
		}, ForestNode.Edge.Leading, rootAda);
		return new ForestIterater<QObjectForestAdapter>(root);
	}

    static Environment findEnclosedEnv(String symName, Environment funcEnv) {
        Environment cur = funcEnv._parent;
        cur = cur._parent;
        while(true) {
            QObject obj = cur.get(symName);
            if(obj != null) {
                return cur;
            }
            Environment parent = cur._parent;
            if(parent == null) {
                return cur;
            }
            cur = parent;
        }
    }

    interface TargetEnvRetriever {
        Environment getEnv(String symName, Environment funcEnv);
            }

    static class EnclosedEnvRetriever implements  TargetEnvRetriever {

        @Override
        public Environment getEnv(String symName, Environment funcEnv) {
            return findEnclosedEnv(symName, funcEnv);
        }
    }
    static class ParentEnvRetriever implements TargetEnvRetriever {

        @Override
        public Environment getEnv(String symName, Environment funcEnv) {
            return funcEnv._parent;
        }
    }

    static class AssignOperation extends QPrimitive {
        TargetEnvRetriever targetEnvRetriever;
        AssignOperation(TargetEnvRetriever envRetriever ) {
            super(parseFormalList("target, values"));
            targetEnvRetriever = envRetriever;
        }

        @Override
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QPromise promiseTarget = (QPromise)funcEnv.get("target");
                Tree expression = promiseTarget.getExpression();
                if(expression.getType() != QParser.SYMBOL)
                    throw new QException("Left expr of assign is not symbol: " + expression.toStringTree());

                String symName = expression.getText();
                QObject vals = getR(funcEnv, "values", intp);
                vals.share();

            Environment cur = targetEnvRetriever.getEnv(symName, funcEnv);
            cur.put(symName, vals);
                return QObject.Null;
            }
    }

    // <<-
    public static QPrimitive createEnclosedAssign()
    {
        return new AssignOperation(new EnclosedEnvRetriever());
            }


    //  "(XXFUNCALL <- (XXSUBLIST (XXSUB1 a) (XXSYMSUB1 values b)))"
    // <-
    public static QFunction createInternalAssign()
    {
        return new AssignOperation(new ParentEnvRetriever());
    }

    static class SubscriptAssignOperation extends QPrimitive {
        TargetEnvRetriever targetEnvRetriever;
        SubscriptAssignOperation(TargetEnvRetriever envRetriever ) {
            super(null);
            targetEnvRetriever = envRetriever;
        }

        @Override
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject args = funcEnv.get(ARGNAME);
                QPromise promiseTarget = (QPromise)args.get(0);
                QObject rightVal = getIR(args, args.getLength()-1, intp);
                if(args.getLength() != 3)
                    throw new QException("NYI: multi dimensional assignment.");

                QObject range = getIR(args, 1, intp);
                if(range.getMode().equals("logical")) {
                    return assignByLogicalSubscript(funcEnv, promiseTarget, range, rightVal, intp);
                }


                return assignByNumericSubscript(funcEnv, promiseTarget, range, rightVal, intp);
            }
            private QObject assignByLogicalSubscript(Environment funcEnv, QPromise promiseTarget, QObject range, QObject rightVal, QInterpreter intp) {
                QObject targetCand = intp.resolveIfNecessary(promiseTarget);

                if(range.getLength() != targetCand.getLength()) {
                    range = range.recycle(targetCand.getLength());
                }


                if(targetCand.getLength() != rightVal.getLength()) {
                    rightVal = rightVal.recycle(targetCand.getLength());
                }

                Tree expression = promiseTarget.getExpression();
                if(expression.getType() != QParser.SYMBOL)
                    throw new QException("Left expr of assign is not symbol: " + expression.toStringTree());

                String symName = expression.getText();
                if(targetCand.isShared())
                    targetCand = targetCand.QClone();


                int ridx = 0;
                for (int i = 0; i < range.getLength(); i++) {
                    if(range.get(i).isTrue()) {
                        QObject rval = getIR(rightVal, ridx, intp);
                        rval.share();
                        targetCand.set(i, rval);
                        ridx++;
                    }
                }
            Environment cur = targetEnvRetriever.getEnv(symName, funcEnv);
            cur.put(symName, targetCand);
                return QObject.Null;
            }

            private QObject assignByNumericSubscript(Environment funcEnv, QPromise promiseTarget, QObject range, QObject rightVal, QInterpreter intp) {
                if(range.getLength() != rightVal.getLength()) {
                    rightVal = rightVal.recycle(range.getLength());
                }

                Tree expression = promiseTarget.getExpression();
                if(expression.getType() != QParser.SYMBOL)
                    throw new QException("Left expr of assign is not symbol: " + expression.toStringTree());

                String symName = expression.getText();
                QObject targetCand = intp.resolveIfNecessary(promiseTarget);
                if(targetCand.isShared())
                    targetCand = targetCand.QClone();


                for (int i = 0; i < range.getLength(); i++) {
                    int idx = range.get(i).getInt();
                    QObject rval = getIR(rightVal, i, intp);
                    rval.share();
                    targetCand.set(idx - 1, rval);
                }
            Environment cur = targetEnvRetriever.getEnv(symName, funcEnv);
            cur.put(symName, targetCand);
                return QObject.Null;
            }
    }

    // "(XXFUNCALL [<- (XXSUBLIST (XXSUB1 a) (XXSUB1 1) (XXSUB1 "rightHandVal")))"
    // [<-
    public static QFunction createInternalBracketAssign()
    {
        return new SubscriptAssignOperation(new ParentEnvRetriever());
    }

    // [<<-
    public static QFunction createEnclosedBracketAssign()
    {
        return new SubscriptAssignOperation(new EnclosedEnvRetriever());
    }


    // [[<-
    public static QFunction createInternalBBAssign() {
        return new QFunction(null, null) {
            public boolean isPrimitive() {
                return true;
            }

            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject args = funcEnv.get(ARGNAME);
                QPromise promiseTarget = (QPromise)args.get(0);
                QObject rightVal = getIR(args, args.getLength()-1, intp);
                if(args.getLength() != 3)
                    throw new QException("NYI: multi dimensional assignment.");
                QObject range = getIR(args, 1, intp);
                if(range.getLength() != 1)
                    throw new QException("attempt to select more than one element.");

                Tree expression = promiseTarget.getExpression();
                if(expression.getType() != QParser.SYMBOL)
                    throw new QException("Left expr of assign is not symbol: " + expression.toStringTree());

                String symName = expression.getText();
                QObject targetCand = intp.resolveIfNecessary(promiseTarget);
                if(targetCand.isShared())
                    targetCand = targetCand.QClone();
                targetCand.setBB(range, rightVal);

                funcEnv._parent.put(symName, targetCand);
                return QObject.Null;
            }
        };
    }


    //  "(XXFUNCALL [ (XXSUBLIST (XXSUB1 a) (XXSUB1 (XXSUBLIST (XXSUB1 1))))"
    // [
    public static QFunction createInternalSubscriptBracket()
    {
        return new QFunction(null, null) {
            public boolean isPrimitive() {
                return true;
            }

            private void validateSubscriptBracket(Tree sublistTree) {
                if(sublistTree.getChildCount() > 2)
                    throw new QException("NYI: multi dimentional array more than 2");
                if(sublistTree.getChild(0).getType() != QParser.XXSUB1)
                    throw new QException("Sublist with assign: gramatically accepted, but what situation?");
            }

            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject args = funcEnv.get(ARGNAME);
                QObject lexpr = getIR(args, 0, intp);
                QPromise sublistPromise = (QPromise)args.get(1);
                Environment proEnv = sublistPromise.getEnvironment();
                Tree sublist = sublistPromise.getExpression();
                validateSubscriptBracket(sublist);

                if(sublist.getChildCount() == 1)
                {
                    QObject range = intp.evalExprWithEnv(proEnv, sublist.getChild(0).getChild(0));
                    return lexpr.subscriptByOneArg(range);
                }
                else // argNum == 2
                {
                    Tree rangeRowNode = sublist.getChild(0);
                    Tree rangeColNode = sublist.getChild(1);

                    // a[1,]
                    // -> "(XXSUBSCRIPT [ a (XXSUBLIST (XXSUB1 1) XXSUB0))"
                    if(rangeRowNode.getType() != QParser.XXSUB0
                            && rangeColNode.getType() == QParser.XXSUB0)
                    {
                        QObject rangeRow = intp.evalExprWithEnv(proEnv, rangeRowNode.getChild(0));
                        if(!lexpr.isDataFrame())
                            throw new QException("NYI: multi dimensional subscript for none data frame");
                        QList df = (QList) lexpr;
                        if(rangeRow.getMode() == "logical")
                            return subscriptByRowLogical(df, rangeRow);
                        return df.subscriptByRow(rangeRow);
                    }
                    // other case, NYI.
                    throw new QException("NYI: multi dimensional subscript");
                }
            }
        };
    }

    private static QList subscriptByRowLogical(QList df, QObject rangeRow) {
        if(rangeRow.getLength() != df.getRowNum())
            rangeRow = rangeRow.recycle(df.getRowNum());

        QList ret = df.dupBaseDataFrame();
        int newRowIndex = 0;
        for(int i = 0; i < df.getRowNum(); i++) {
            if(rangeRow.get(i).isTrue()) {
                ret.setRowName(newRowIndex, df.getRowName(i));
                QList row = (QList)df.subscriptByRowIndex(i);
                for(int col = 0; col < df.getLength(); col++)
                {
                    QList columnDf = ret.getColumn(col);
                    columnDf.setRowName(newRowIndex, df.getRowName(i));
                    QObject cell = row.rawGetByRowCol(0, col);
                    cell.share();
                    columnDf.rawSetByRowCol(newRowIndex, 0, cell);
                }
                newRowIndex++;
            }
        }

        return ret;
    }

    //  "(XXFUNCALL [[ (XXSUBLIST (XXSUB1 a) (XXSUB1 1)))"
    // [[
    public static QFunction createInternalSubscriptBB() {
        return new QFunction(null, null) {
            public boolean isPrimitive() {
                return true;
            }

            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject args = funcEnv.get(ARGNAME);
                QObject lexpr = getIR(args, 0, intp);
                QPromise sublistPromise = (QPromise)args.get(1);
                Environment proEnv = sublistPromise.getEnvironment();
                Tree sublist = sublistPromise.getExpression();
                if(sublist.getChildCount() > 1)
                    throw new QException("[[]] with multi dimentional, what's happend?");

                if(sublist.getChild(0).getType() != QParser.XXSUB1)
                    throw new QException("Sublist with assign: gramatically accepted, but what situation?");
                QObject index = intp.evalExprWithEnv(proEnv, sublist.getChild(0).getChild(0));
                return lexpr.getBB(index);

            }
        };
    }


    // sapply
    public static QFunction createSapply()
    {
        return new QFunction(parseFormalList("X, FUN"), null){
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject seq = getR(funcEnv, "X", intp);
                QObject funCand = (QObject)getR(funcEnv, "FUN", intp);

                if(!funCand.getMode().equals("function"))
                    throw new QException("Argument of sapply, FUN is not function");

                QFunction fun = (QFunction)funCand;

                Environment callEnv = funcEnv._parent;

                // might conflict...
                String randArgName = "..tmp_hiden_arg_XXX" + Math.abs((new Random()).nextInt());

                QObject ret = new QObject(seq.getMode());
                Environment preservedEnv = intp._curEnv;
                try {
                    intp._curEnv = callEnv;
                    for(int i = 0; i < seq.getLength(); i++) {
                        QObject arg = getIR(seq, i, intp);
                        callEnv.put(randArgName, arg);
                        Tree argTree = (Tree)createParser(randArgName).sublist().getTree();
                        QObject obj = intp.callFuncWithArgTree(fun, argTree);
                        ret.set(i, obj);
                    }
                    callEnv.remove(randArgName);
                } catch (RecognitionException e) {
                    throw new QException("Never reached here. sapply: " + e.getMessage());
                } finally {
                    intp._curEnv = preservedEnv;
                }

                return ret;
            }
        };
    }

    // unique
    public static QPrimitive createUnique()
    {
        return new QPrimitive(parseFormalList("x")) {
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject arg = getR(funcEnv, "x", intp);
                HashMap<Object, Boolean> map = new HashMap<Object, Boolean>();
                if(arg.getMode().equals("list"))
                    throw new QException("NYI: unique only support vector now");

                QObject ret = new QObject(arg.getMode());
                int retIdx = 0;
                for(int i = 0; i < arg.getLength(); i++) {
                    QObject obj = getIR(arg, i, intp);
                    if(map.containsKey(obj.getValue()))
                        continue;
                    map.put(obj.getValue(), true);
                    obj.share();
                    ret.set(retIdx++, obj);
                }
                return ret;
            }
        };
    }

    // sum
	public static QFunction createSum()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				double sum = 0;
				ForestIterater<QObjectForestAdapter> iter = createForestIterater(args, intp);
				while(iter.hasNext())
				{
					ForestNode<QObjectForestAdapter> node = iter.next();
					if(node.getEdge() != Edge.Trailing)
						continue;
					QObject obj = node.getElement()._self;
					if(obj.getLength() != 1 ||
							obj.getMode() == QList.LIST_TYPE)
						continue;
					sum += obj.getDouble();
				}
				return QObject.createNumeric(sum);
				
			}
		};
	}

    // which
    public static QPrimitive createWhich()
    {
        return new QPrimitive(parseFormalList("x, arr.ind=FALSE")) {
            @Override
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject x = getR(funcEnv, "x", intp);
                QObject ret = new QObject(QObject.NUMERIC_TYPE);
                int ridx = 0;
                for(int i = 0; i < x.getLength(); i++) {
                    QObject elm = getIR(x, i, intp);
                    if(elm.isTrue())
                        ret.set(ridx++, QObject.createNumeric(i+1));
                }
                return ret;
            }
        };
    }

    // which.min
    public static QPrimitive createWhichMin()
    {
        return new QPrimitive(parseFormalList("x")) {
            @Override
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject x = getR(funcEnv, "x", intp);
                QObject ret = new QObject(QObject.NUMERIC_TYPE);
                int ridx = 0;
                double min = getIR(x, 0, intp).getDouble();
                for(int i = 1; i < x.getLength(); i++) {
                    QObject elm = getIR(x, i, intp);
                    if(elm.getDouble() < min) {
                        ridx = i;
                        min = elm.getDouble();
                    }
                }
                return QObject.createNumeric(ridx+1);
            }
        };
    }

    // which.max
    public static QPrimitive createWhichMax()
    {
        return new QPrimitive(parseFormalList("x")) {
            @Override
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp) {
                QObject x = getR(funcEnv, "x", intp);
                QObject ret = new QObject(QObject.NUMERIC_TYPE);
                int ridx = 0;
                double max = getIR(x, 0, intp).getDouble();
                for(int i = 1; i < x.getLength(); i++) {
                    QObject elm = getIR(x, i, intp);
                    if(elm.getDouble() > max) {
                        ridx = i;
                        max = elm.getDouble();
                    }
                }
                return QObject.createNumeric(ridx+1);
            }
        };
    }

    // max
    public static QFunction createMax()
    {
        return new QFunction(null, null){
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject args = funcEnv.get(ARGNAME);
                double max = Double.NEGATIVE_INFINITY;
                ForestIterater<QObjectForestAdapter> iter = createForestIterater(args, intp);
                while(iter.hasNext())
                {
                    ForestNode<QObjectForestAdapter> node = iter.next();
                    if(node.getEdge() != Edge.Trailing)
                        continue;
                    QObject obj = node.getElement()._self;
                    if(obj.getLength() != 1 ||
                            obj.getMode() == QList.LIST_TYPE)
                        continue;
                    max = Math.max(obj.getDouble(), max);
                }
                return QObject.createNumeric(max);

            }
        };
    }

    // min
    public static QFunction createMin()
    {
        return new QFunction(null, null){
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject args = funcEnv.get(ARGNAME);
                double min = Double.POSITIVE_INFINITY;
                ForestIterater<QObjectForestAdapter> iter = createForestIterater(args, intp);
                while(iter.hasNext())
                {
                    ForestNode<QObjectForestAdapter> node = iter.next();
                    if(node.getEdge() != Edge.Trailing)
                        continue;
                    QObject obj = node.getElement()._self;
                    if(obj.getLength() != 1 ||
                            obj.getMode() == QList.LIST_TYPE)
                        continue;
                    min = Math.min(obj.getDouble(), min);
                }
                return QObject.createNumeric(min);

            }
        };
    }

    // resolve obj.get(index). but this function call too many times. so add short name.
    static QObject getIR(QObject obj, int index, QInterpreter intp) {
        return resolve(obj.get(index), intp);
    }

	// cumsum
	public static QFunction createCumulativeSum()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				if(args.getLength() != 1)
					throw new QException("Argument of cumsum should be 1");
				QObjectBuilder bldr = new QObjectBuilder();
				QObject arg = getIR(args, 0, intp);
				int len = arg.getLength();
				double cum = 0;
				for(int i = 0; i < len; i++)
				{
					QObject obj = getIR(arg, i, intp);
					cum += obj.getDouble();
					bldr.add(QObject.createNumeric(cum));
				}
				return bldr.result();				
			}
		};
	}
	
	
	public static QFunction createMean()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				if(args.getLength() != 1)
					throw new QException("Argument of mean should be 1");
				QObject arg = getIR(args, 0, intp);
				int len = arg.getLength();
				double mean = sumObj(arg, intp)/len;
				return QObject.createNumeric(mean);
				
			}
		};
	}


	public static QFunction createSqrt()
	{
		return new QFunction(parseFormalList("x"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = getR(funcEnv, "x", intp);
				int len = args.getLength();
				if(len == 1)
					return QObject.createNumeric(Math.sqrt(args.getDouble()));
				QObjectBuilder bldr = new QObjectBuilder();
				for(int i = 0; i < len; i++)
				{
					QObject x = QObject.createNumeric(Math.sqrt(getIR(args, i, intp).getDouble()));
					bldr.add(x);
				}
				return bldr.result();
			}
		};
	}
	
	public static QFunction createDataFrame()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = funcEnv.get(ARGNAME);
				return QList.createDataFrameFromVector(arg, intp);
			}
		};
	}

	public static QFunction createList()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = funcEnv.get(ARGNAME);
                QList ret = QList.createList();
                for(int i = 0; i < arg.getLength(); i++) {
                    QObject obj = getIR(arg, i, intp);
                    ret.set(i, obj);
                }
                return ret;
			}
		};
	}
	public static QFunction createLength()
	{
		return new QFunction(null, null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject args = funcEnv.get(ARGNAME);
				if(args.getLength() != 1)
					throw new QException("Argument of length should be 1");
				QObject arg = getIR(args, 0, intp);
				return QObject.createNumeric(arg.getLength());
			}
		};
	}
	
	// for temp debug.
	static QInterpreter _intp;
	
	public static CsvTableRetrievable _csvRetrievable;
	public static QFunction createReadCsv(CsvTableRetrievable csvRetrievable)
	{
		_csvRetrievable = csvRetrievable;
		return new QFunction(parseFormalList("url"), null) {
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				_intp = intp;
				QObject url = getR(funcEnv, "url", intp);
				CsvTable table = _csvRetrievable.retrieve(url.getValue().toString());
				return QList.createDataFrameFromCsvTable(table);
			}
		};
	}

    // Caution! Very tricky! This content is basically the same as
    // https://docs.google.com/spreadsheet/pub?key=0AnKwf3jHs-oIdEE4YnJ3dERMclRqazV0ZjJuN0k0UWc&single=true&gid=0&output=csv
    // But I want to skip one http round trip, so I put this file in asset folder and assume
    // facade will set this value.
    public static CsvTable tableOfContents;
    public static QFunction createQurl(CsvTable tableOfConts)
    {
        tableOfContents = tableOfConts;
        return new QFunction(parseFormalList("name"), null) {
            public boolean isPrimitive() {return true; }
            public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
            {
                QObject name = getR(funcEnv, "name", intp);
                String nameVal = (String)name.getValue();
                for(int row = 1; row < tableOfContents.getRowNum(); row++) {
                    String rowName = tableOfContents.getCell(row, 0);
                    if(rowName.equals(nameVal))
                        return QObject.createCharacter(tableOfContents.getCell(row, 1));
                }
                return QObject.Null;
            }
        };
    }


	// attributes
	public static QFunction createAttributes()
	{
		return new QFunction(parseFormalList("obj"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = getR(funcEnv, "obj", intp);
				if(arg.isNull())
					throw new QException("Argument of attributes should be one object");
				return arg.attributesAsList();
				
			}
		};
	}
	
	// is.null
	public static QFunction createIsNull()
	{
		return new QFunction(parseFormalList("obj"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = getR(funcEnv, "obj", intp);
				if(QObject.Null.equals(arg))
					return QObject.TRUE;
				return QObject.FALSE;
			}
		};
	}

	// as.numeric
	public static QFunction createAsNumeric()
	{
		return new QFunction(parseFormalList("obj"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = getR(funcEnv, "obj", intp);
				return asNumeric(arg);				
			}
		};
	}
	
	public static QObject asNumeric(QObject arg) {
		if(arg.isNull())
			throw new QException("Argument of as.numeric should be one object");
		if(QObject.CHARACTER_TYPE.equals(arg.getMode())) {
			QObjectBuilder bldr = new QObjectBuilder();
			for(int i = 0; i < arg.getLength(); i++) {
				bldr.add(QObject.createNumeric(Double.valueOf((String)arg.get(i).getValue())));
			}
			return bldr.result();
		}
		if(QList.DATAFRAME_CLASS.equals(arg.getQClass()))
		{
			QList dfArg = (QList)arg;
			QObjectBuilder bldr = new QObjectBuilder();
			for(int i = 0; i < dfArg.getLength(); i++)
			{
				QObject col = dfArg.getBBInt(i);
				if(col.getLength() != 1)
					throw new QException("as.numeric: unsupported data.frame dimension.");
				if(QObject.CHARACTER_TYPE.equals(col.getMode()))
					bldr.add(QObject.createNumeric(Double.valueOf((String)col.getValue())));
				else if(QObject.NUMERIC_TYPE.equals(col.getMode()))
					bldr.add(QObject.createNumeric((Double)col.getValue()));
				else
					throw new QException("as.numeric: unsupported df element type");
			}
			return bldr.result();
		}
		throw new QException("as.numeric: unsupported argument");
	}
	
	// match.arg
	public static QFunction createMatchArg()
	{
		return new QFunction(parseFormalList("arg, choices, several.ok = FALSE"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
                QPromise promise = (QPromise)funcEnv.get("arg");
				QObject arg = resolve(promise, intp);
				QObject choices = getR(funcEnv, "choices", intp);
				if(arg.getLength() > 1)
					throw new QException("first argument of match.arg is not scalar.");
				if(choices == null)
				{
					Tree orgVal = promise.getExpression();
					if(orgVal.getType() != QParser.SYMBOL)
						throw new QException("match.arg, arg's caller sexp is not symbol. what situation? :" + orgVal.toStringTree());
					choices = intp.resolveIfNecessary(funcEnv.getDefaultValue(orgVal.getText()));
				}
				String argStr = (String)arg.getValue();
				for(int i = 0; i < choices.getLength(); i++)
				{
					String target = (String)getIR(choices, i, intp).getValue();
					if(target.startsWith(argStr))
						return choices.get(i);
				}
				throw new QException("[arg] should match to one of the member of [choices]");
			}
		};
	}
	
	// substitute
	public static QFunction createSubstitute()
	{
		return new QFunction(parseFormalList("expr, env"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
                QPromise promise = (QPromise)funcEnv.get("expr");
                try {
                    QObject resolved = intp.resolveOne(promise);
                    while (resolved instanceof QPromise) {
                        promise = (QPromise) resolved;
                        resolved = intp.resolveOne(promise);
                    }
                }catch(QException e) {
                    // if symbol is not existed, eval fail. But that means this symbol is itself non-promise.
                    // so prev promise must be the last promise.
                }

                Tree sexp = promise.getExpression();
				if(sexp.getType() == QParser.SYMBOL)
				{
					sexp = handleSymbol(funcEnv, sexp, intp);
				}
				else
				{
					ForestIterater<Tree> iter = QInterpreter.createIterater(sexp);
					while(iter.hasNext())
					{
						ForestNode<Tree> node = iter.next();
						if(node.getEdge() == Edge.Trailing)
							continue;
						Tree t = node.getElement();
						if(t.getType() == QParser.SYMBOL)
						{
							Tree newSexp = handleSymbol(funcEnv, t, intp);
							if(newSexp != t)
							{
								t.getParent().replaceChildren(t.getChildIndex(), t.getChildIndex(), newSexp);
							}
							continue;
						}
					}
				}

				return QObject.createCall(funcEnv, sexp);
			}
			private Tree handleSymbol(Environment funcEnv, Tree sexp, QInterpreter intp) {
                QObject obj = funcEnv.get(sexp.getText());
                if(obj instanceof QPromise) {
                    return ((QPromise)obj).getSexp();
                }
                return sexp;
			}
		};
	}

	// deparse
	public static QFunction createDeParse()
	{
		return new QFunction(parseFormalList("obj"), null){
			public boolean isPrimitive() {return true; }
			public QObject callPrimitive(Environment funcEnv, QInterpreter intp)
			{
				QObject arg = getR(funcEnv, "obj", intp);
				if(arg.getMode() != "call")
					throw new QException("not supported deparse with non-expression arg");
				
				StringBuffer buf = new StringBuffer();
				Tree sexp = arg.getSexp();
				recursivePrint(sexp, buf);
				return QObject.createCharacter(buf.toString());
			}
			
			private void recursivePrint(Tree sexp, StringBuffer buf) {
				if(sexp.getType() == QParser.XXBINARY)
				{
					recursivePrint(sexp.getChild(1), buf);
					buf.append(sexp.getChild(0).getText());
					recursivePrint(sexp.getChild(2), buf);
					return;
				}
				if(sexp.getType() == QParser.SYMBOL)
				{
					buf.append(sexp.getText());
					return;
				}
				if(sexp.getType() == QParser.STR_CONST)
				{
					buf.append("\"");
					buf.append(sexp.getText());
					buf.append("\"");
					return;
				}
				if(sexp.getType() == QParser.DecimalLiteral)
				{
					buf.append(sexp.getText());
					return;
				}
			}
		};
	}

	public String toString()
	{
		return "function ...";
	}

}
