package com.livejournal.karino2.tobinq.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class QObject {
	// typename
	public static final String CHARACTER_TYPE = "character";
	public static final String NUMERIC_TYPE = "numeric";
	public static final String CALL_TYPE = "call"; // s expression.
	
	public static final QObject NA = new QObject("logical");
	public static final QObject Null = new QObject("NULL");
	public static QObject TRUE = new QObject("logical", 1);
	public static QObject FALSE = new QObject("logical", 0);

	
	Object _val;
	public String _mode;
	HashMap<String, QObject> _attributes;
	ArrayList<QObject> _vector = null;
    boolean _shared = false;
	
	public QObject(String mode, Object val, HashMap<String, QObject> attrs)
	{
		this(mode, val);
		copyAttributes(attrs);
	}

    public void share() {
        _shared = true;
    }

    public boolean isShared() {
        return _shared;
    }

	private void copyAttributes(HashMap<String, QObject> attrs) {
		if(attrs != null) {
			_attributes = new HashMap<String, QObject>();
			_attributes.putAll(attrs);
		}
	}
	
	public QObject(String mode, Object val)
	{
		this(mode);
		_val = val;
	}
	
	public QObject(String mode)
	{
		_mode = mode;
	}
	
	public static QObject createInt(int val)
	{
		return new QObject("integer", val);
	}
	
	public static QObject createNumeric(double val)
	{
		return new QObject("numeric", val);
	}

	public static QObject createCharacter(String val)
	{
		return new QObject(CHARACTER_TYPE, val);
	}
	
	public static QObject createCall(Environment env, Tree sexp)
	{
		return new QObject(CALL_TYPE, new Object[] {env, sexp});
	}



	public QObject QClone() {
        if(getMode().equals("promise"))
            throw new RuntimeException("clone Promise!");

		if(this == QObject.NA)
			return this;
		if(getLength() == 1){
			return new QObject(getMode(), _val, _attributes);
		}
		else
		{
			QObjectBuilder bldr = new QObjectBuilder();
			for(int j = 0; j < getLength(); j++)
			{
				bldr.add(get(j).QClone());
			}
			QObject ret2 =  bldr.result();
			ret2.copyAttributes(_attributes); //get(0).QClone() does not copy attributes.
			return ret2;
		}
	}

	public String getMode()
	{
		return _mode;
	}
	
	// getClass is used in Java Object!
	public String getQClass()
	{
		if(_attributes == null ||
				!_attributes.containsKey("class"))
			return "";
		return (String)_attributes.get("class")._val;
	}
	
	public void setAttribute(String name, QObject val)
	{
		if(_attributes == null)
			_attributes = new HashMap<String, QObject>();
		_attributes.put(name, val);
	}
	
	public QObject getAttribute(String name)
	{
		if(_attributes == null ||
				!_attributes.containsKey(name))
			return QObject.Null;
		return _attributes.get(name);
	}
	
	public Object getValue()
	{
		return _val;
	}

	public String toStringOne(QObject obj)
	{
		if(obj.getMode() == "logical")
		{
			if(obj == QObject.NA)
				return "NA";
			else if((Integer)obj._val == 1)
				return "TRUE";
			else
				return "FALSE";
		}
		else if(obj.getMode() == QObject.CHARACTER_TYPE)
		{
			return "\"" + obj._val.toString() + "\"";
		}
		else if(obj.getMode() == QObject.CALL_TYPE)
		{
			Object[] arr = (Object[])obj._val;
			// arr[0]: env
			// arr[1]: sexp
			// temp implementation.
			return ((Tree)arr[1]).toStringTree();
		}
		else
		{
			if(obj.getMode() == "NULL")
				return "NULL";
			return obj._val.toString();
		}
	}
	
	public String toString()
	{
		if(_vector == null)
			return toStringOne(this);
        QObject dim = getAttribute("dim");
        if(dim.isNull())
        {
            StringBuffer buf = new StringBuffer();
            for(QObject obj : _vector)
            {
                if(buf.length() != 0)
                    buf.append(" ");
                buf.append(toStringOne(obj));
            }
            return buf.toString();
        }
        else
        {
            ArrayList<String> rowNames = createRowNames(getRowNum());
            ArrayList<String> colNames = createColNames(getColNum());
            return toStringGrid(rowNames, colNames);
        }
    }

    private ArrayList<String> createColNames(int colNum) {
        ArrayList<String> ret = new ArrayList<String>();
        for(int i = 0; i < colNum; i++)
        {
            ret.add("[," + String.valueOf(i+1) + "]");
        }
        return ret;
    }

    private ArrayList<String> createRowNames(int rowNum) {
        ArrayList<String> ret = new ArrayList<String>();
        for(int i = 0; i < rowNum; i++)
        {
            ret.add("[" + String.valueOf(i+1) + ",]");
        }
        return ret;
    }

	public int getLength()
	{
		if(_vector == null)
			return 1;
		return _vector.size();
	}
	
	public QObject recycle(int upto)
	{
		if(upto < getLength())
			return this;
		ensureVector();
		QObject ret = shallowClone();
		int index = 0;
		for(int i = 0; i < upto; i++, index++)
		{
			if(index == getLength())
				index = 0;
			ret.set(i, get(index));
		}
		return ret;
	}
	
	public boolean isNumber()
	{
		return getMode() == "numeric" || getMode() == "integer";
	}
	
	public int getInt() {
		if(getMode() == "integer")
			return (Integer)getValue();
		if(getMode() == "numeric")
			return (int)(double)(Double)getValue();
		throw new RuntimeException("unsupported mode for getInt: " + getMode());
	}
	
	public double getDouble() {
		if(getMode() == "integer")
			return (Integer)getValue();
		if(getMode() == "numeric")
			return (Double)getValue();
		throw new RuntimeException("unsupported mode for getDouble: " + getMode());
	}

    public void setBB(QObject arg, QObject val)
    {
        if(arg.isNumber())
        {
            set(arg.getInt()-1, val);
            return;
        }
        throw new RuntimeException("index of [[]] out of bound.");
    }

	public QObject getBB(QObject arg)
	{
		if(arg.isNumber() && arg.getInt() == 0)
			return this;
		throw new RuntimeException("index of [[]] out of bound.");
	}
	
	public boolean isTrue()
	{
		return !equals(QObject.FALSE);
	}
	
	public boolean isNull()
	{
		return QObject.Null.equals(this);		
	}

    public boolean isNA()
    {
        return QObject.NA.equals(this);
    }

    public QObject get(int i)
	{
		// atom
		if(i == 0 && getLength() == 1)
			return this;
		if(_vector == null)
			return QObject.NA;
		return _vector.get(i);
	}


    int getRowNum()
    {
        return getDim().get(0).getInt();
    }
    int getColNum()
    {
        return getDim().get(1).getInt();
    }

    QObject getDim() {
        QObject dim = getAttribute("dim");
        if(dim.isNull())
            throw new RuntimeException("wrong dimension");
        return dim;
    }

    QObject rawGetByRowCol(int row, int col)
    {
        int rowNum = getRowNum();
        int newIndex = col*rowNum+row;
        return get(newIndex);
    }

    private void appendSpace(StringBuffer buf, int maxRowLength) {
        for(int i = 0; i < maxRowLength; i++)
            buf.append(" ");
    }



    public void set(int i, QObject qObject) {
		if(this == QObject.NA)
			return;
		ensureVector();		
		if(getLength() < i+1)
		{
			extendVectorAndFillNA(i+1);
		}
		if(i == 0) {
			// something strange.
			_val = qObject._val;
			_vector.set(i, qObject);
		}
		else
			_vector.set(i, qObject);		
	}

	public void extendVectorAndFillNA(int upto) {
		extendVectorAndFillValue(upto, NA);
	}
	
	// slow.
	public void extendVectorAndFillValue(int upto, QObject obj)
	{
		for(int i = _vector.size(); i < upto; i++)
		{
			_vector.add(i, obj);
		}		
	}

	void ensureVector() {
		if(_vector == null)
		{
			_vector = new ArrayList<QObject>();
			// Here, _vector.sie() == 0 but _val != 0 the case. QClone doesn't work.
			_vector.add(0, shallowClone()); 		
		}
	}
	
	public QObject shallowClone()
	{
		return new QObject(getMode(), _val, _attributes);
	}

	// R equals is binary operater who handles vector.
	// this is Java equals, it might be confusing. and almost only for test.
	public boolean equals(Object arg)
	{
		QObject robj = (QObject)arg;

		if(robj == null)
			return false;
		if(robj.getLength() != getLength())
			return false;
		if(getLength() == 1)
		{
			return equalOne(this, robj);
		}
		for(int i = 0; i < robj.getLength(); i++)
		{
			// treat NA as false.
			if(!equalOne(get(i), robj.get(i)))
				return false;
		}
		return true;
	}
	
	public int hashCode(){
		int hash = 0;
		if(getLength() == 1)
			hash = _val.hashCode();
		else
		{
			for(int i = 0; i < getLength(); i++)
				hash += get(i).hashCode();
		}
		return getMode().hashCode()+hash;
	}

	private boolean equalOne(QObject l, QObject r) {
		if(l.getMode() != r.getMode())
			return false;
		if(l.getValue() == r.getValue())
			return true; // include NULL.
		return (l.getValue().equals(r.getValue()));
	}

	public static QObject createLogical(boolean b) {
		if(b)
			return TRUE.QClone();
		return FALSE.QClone();
	}

	// current implementation is read only.
	public QObject attributesAsList() {
		if(_attributes == null)
			return QObject.Null;
		QList list = QList.createList(); 
		QObject names = QObject.createCharacter("");
		int i = 0;
		for(Map.Entry<String, QObject> entry : _attributes.entrySet())
		{
			names.set(i, QObject.createCharacter(entry.getKey()));
			list.set(i, entry.getValue());
			i++;
		}
		list.setAttribute("names", names);
		return list;
	}
	
	public Tree getSexp() {
		if(!getMode().equals(CALL_TYPE))
			return null;
		Object[] arr = (Object[])_val;
		return (Tree)arr[1];
	}

	boolean isDataFrame() {
		return isList() &&
			QList.DATAFRAME_CLASS.equals(getQClass());
	}

    boolean isList() {
        return QList.LIST_TYPE.equals(getMode());
    }

    QObject subscriptByOneArg(QObject range) {
		if(range.getMode() == "logical")
			return subscriptByLogical(range);
		return subscriptByNumber(range);
	}

	QObject subscriptByLogical(QObject range) {
		if(range.getLength() != getLength())
			throw new RuntimeException("subscriptByLogical: length of logical list and lexpr is different");
		QObjectBuilder bldr = new QObjectBuilder();
		for(int i = 0; i < range.getLength(); i++)
		{
			QObject bool = range.get(i);
			if(QObject.TRUE.equals(bool))
				bldr.add(get(i));
				
		}
		return bldr.result();
	}

	public QObject subscriptByNumber(QObject range) {
		if(range.getLength () == 1)
		{
			int  index = range.getInt();
			if(index > 0)
				return get(index-1);
			// negative index, remove.
			QObjectBuilder bldr = new QObjectBuilder();
			for(int i = 0; i < getLength(); i++)
			{
				if(i != (-index)-1)
				{
					bldr.add(get(i));
				}
			}
			return bldr.result();
		}
		QObjectBuilder bldr = new QObjectBuilder();
		for(int i = 0; i < range.getLength(); i++)
		{
			int index = range.get(i).getInt();
			QObject q = get(index-1);
			bldr.add(q);
		}
		return bldr.result();
	}

	String toRawString() {
		if(getMode() == QObject.CHARACTER_TYPE)
			return (String)getValue();
		else
			return toString();
	}


    ArrayList<String> QVectorToList(QObject obj)
    {
        ArrayList<String> ret = new ArrayList<String>();
        for(int i = 0; i < obj.getLength(); i++)
        {
            ret.add(obj.get(i).toRawString());
        }
        return ret;
    }

    protected String toStringGrid(ArrayList<String> rowNames, ArrayList<String> names) {
        ArrayList<Integer> colMaxLength = new ArrayList<Integer>();
        colMaxLength.add(0,maxRawStrLength(rowNames));
        StringBuffer buf = new StringBuffer();

        // print header
        appendSpace(buf, colMaxLength.get(0));
        for(int i = 0; i < names.size(); i++)
        {
            buf.append(" ");

            String nameRawStr = names.get(i);
            int nameLen = nameRawStr.length();
            colMaxLength.add(i+1, Math.max(nameLen, maxRawStrLength(QVectorToList(get(i).get(0)))));
            buf.append(nameRawStr);
            appendSpace(buf, colMaxLength.get(i+1) - nameLen);
        }
        buf.append("\n");

        for(int i = 0; i < getRowNum(); i++)
        {
            String rowName = rowNames.get(i);
            buf.append(rowName);
            appendSpace(buf, colMaxLength.get(0) - rowName.length());
            for(int j = 0; j < getColNum(); j++) {
                String val = rawGetByRowCol(i, j).toString();
                buf.append(" ");
                appendSpace(buf, colMaxLength.get(j+1) - val.length());
                buf.append(val);
            }
            buf.append("\n");
        }
        return buf.toString();
    }


    private int maxRawStrLength(ArrayList<String> rowNames) {
        int max = 0;
        for(int i = 0; i < rowNames.size(); i++)
        {
            int l = rowNames.get(i).length();
            if(max < l)
                max = l;
        }
        return max;
    }

}
