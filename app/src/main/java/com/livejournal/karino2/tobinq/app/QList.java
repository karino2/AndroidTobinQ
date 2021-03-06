package com.livejournal.karino2.tobinq.app;

import org.antlr.runtime.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class QList extends QObject {
	public static final String LIST_TYPE = "list";
	public static final String DATAFRAME_CLASS = "data.frame";

	public QList() {
		this(null);
	}
	public QList(HashMap<String, QObject> attrs) {
		super(LIST_TYPE, null, attrs);
		_vector = new ArrayList<QObject>();
	}
	
	public void set(int i, QObject qObject) {
		if(getLength() < i+1)
			extendVectorAndFillValue(i+1, QObject.Null);
		_vector.set(i, qObject);
	}
	
	public QObject getBBInt(int i)
	{
		if(isDataFrame())
		{
			return get(i).get(0);
		}
		return get(i); // currently, get of list return contents.
	}
	
	// getBB return the contents of row list. not row list itself.
	public QObject getBB(QObject arg)
	{
		if(arg.isNumber())
			return getBBInt(arg.getInt()-1);
		if(arg.getMode() != CHARACTER_TYPE)
			throw new QException("Arg of [[]] neither number nor string: " + arg.getMode());
		String colName = (String)arg.getValue();
		int i = getIndex(colName);
		return getBBInt(i);
	}

    // do not share here.
    public void setBB(QObject arg, QObject val)
    {
        if(arg.isNumber()) {
            set(arg.getInt() - 1, val);
            return;
        }
        if(arg.getMode() != CHARACTER_TYPE)
            throw new QException("Arg of [[]] neither number nor string: " + arg.getMode());
        String colName = (String)arg.getValue();
        try {
            int i = getIndex(colName);
            set(i, val);
        }catch(QException e) {
            int i = getLength();
            set(i+1, val);
            QObject names = getNamesAttr();
            names.set(i+1, arg);
        }
    }
	
	private int getIndex(String colName) {
		QObject names = getNamesAttr();
		for(int i = 0; i < names.getLength(); i++)
		{
			QObject name = names.get(i);
			if(name.getValue().equals(colName))
				return i;
		}
		throw new QException("Arg of [[]] does not match to names: " + colName);
	}
	
	private QObject getName(int colIndex) {
		return getNamesAttr().get(colIndex);
	}
	
	QObject getNamesAttr() {
		return getAttribute("names");
	}
	public void setNamesAttr(QObject namesObj)
	{
		setAttribute("names", namesObj);		
	}
    public void setNamesAttr(String[] names) {
        QObject qnames = toQVector(names);
        setNamesAttr(qnames);
    }
    private QObject toQVector(String[] names) {
        QObjectBuilder bldr = new QObjectBuilder();
        for(String name : names)
        {
            bldr.add(QObject.createCharacter(name));
        }
        return bldr.result();
    }
	QObject getRowNamesAttr() {
		QObject rowNames = getAttribute("row.names");
		return rowNames;
	}
	public void setRowNamesAttr(QObject rowNames) {
		setAttribute("row.names", rowNames);
	}

	
	public QObject get(int i)
	{
		if(_vector.size() > i)
			return _vector.get(i);
		return QObject.NA.QClone();
	}
	
	public QObject QClone() {
		QObject ret = new QList(_attributes);
		for(int i = 0; i < getLength(); i++)
		{
			ret.set(i, get(i).QClone());
		}
		return ret;
	}
	
	public static QList createList() {
		return new QList();
	}

	public String toString()
	{
		if(isDataFrame())
			return toStringDataFrame();
		
		return toStringList();
	}
	
	public String getNameOfIndex(int i)
	{
		QObject names = getNamesAttr();
		if(names.isNull())
			return "[[" + String.valueOf(i+1) + "]]";
		return "$" + (String)names.get(i).getValue();
	}
	
	private String toStringList() {
		// nest of list does not handle properly.
		StringBuffer buf = new StringBuffer();
		for(int i = 0; i < getLength(); i++)
		{
			buf.append(getNameOfIndex(i));
			buf.append("\n");
            if(get(i).getQClass() != "matrix")
                buf.append("[1] ");
			buf.append(get(i).toString());
			buf.append("\n\n");
		}
		return buf.toString();
	}
	
	// -- begin data frame dependent.
	public static QList createDataFrame()
	{
		QList df = new QList();
		df.setAttribute("class", QObject.createCharacter(DATAFRAME_CLASS));
		return df;
	}
	
	public boolean isDataFrame()
	{
		return getQClass() == "data.frame";
	}

    private String toStringDataFrame() {
        ArrayList<String> rowNames = QVectorToList(getRowNamesAttr());
        ArrayList<String> names = QVectorToList(getNamesAttr());

        return toStringGrid(rowNames, names);
    }

    int getRowNum()
    {
        QObject firstList = get(0);
        QObject firstVector = firstList.get(0);

        return firstVector.getLength();
    }

    ArrayList<String> getColumnList(int i) {
        return QVectorToList(getColumnVector(i));
    }

    QObject getColumnVector(int i) {
        return get(i).get(0);
    }


    int getColNum() {
        return getLength();
    }

	public static QList createDataFrameFromCsvTable(CsvTable table) {
        CsvTableConverter converter = new CsvTableConverter(table);
        return converter.doConvert();
	}
	
	

	static QObject defaultRowNames(int rowNum) {
		QObjectBuilder rowBuilder = new QObjectBuilder();
		for(int j = 0; j < rowNum; j++)
		{
			rowBuilder.add(QObject.createCharacter(String.valueOf(j+1)));
		}
		QObject rowNames = rowBuilder.result();
		return rowNames;
	}

    public static QObject resolve(QObject obj, QInterpreter intp) {
        return intp.resolveIfNecessary(obj);
    }



	public QList dupBaseDataFrame() {
		QList df = QList.createDataFrame();
		df.setNamesAttr(getNamesAttr().QClone());
		for(int col = 0; col < getLength(); col++) {
			df.addDataFrameColumn(col);
		}
		return df;
	}
	
	// get is too generic and hard to understand code.
	public QList getColumn(int colIndex) {
		return (QList)get(colIndex);
	}
	
	public void setRowName(int rowIndex, QObject name)
	{
		getRowNamesAttr().set(rowIndex, name);
	}
	
	public QObject getRowName(int rowIndex)
	{
		return getRowNamesAttr().get(rowIndex);
	}
	
	public QObject subscriptByRowIndex(int rowIndex) {
		QList df = dupBaseDataFrame();
        QObject name = getRowName(rowIndex);
        name.share();
		df.setRowName(0, name);
		
		for(int col = 0; col < getLength(); col++) {
			QObject colVector = getBBInt(col);
			df.getColumn(col).set(0, colVector.get(rowIndex));
		}
		return df;
	}

	private QList addDataFrameColumn(int colIndex) {
		QList col = QList.createDataFrame();
		col.setNamesAttr(getName(colIndex));
		set(colIndex, col);
		return col;
	}
	public QObject subscriptByCol(int i) {
		return getBBInt(i);
	}
	
	QObject rawGetByRowCol(int row, int col)
	{
		return get(col).get(0).get(row);
	}
	boolean isPartialDataFrame()
	{
		return (getLength() == 0 ||
				getLength() == 1);
	}
	void rawSetByRowCol(int row, int col, QObject obj)
	{
		// column of data.frame is also data.frame.
		// So subscription never reached to contents.
		// But as a implementation point of view, some kind of bootstrap is necessary.
		// I use partial data.frame for column, that is, contents of first element is vector.
		// So here is one those kind of special handling.
		if(isPartialDataFrame() && col== 0)
		{
			if(row == 0)
				set(0, obj);
			else
				get(0).set(row, obj);
		}
		else
			get(col).get(0).set(row, obj);		
	}
	
}
