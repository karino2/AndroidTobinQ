package com.livejournal.karino2.tobinq.app;

import java.util.HashMap;

public class Environment {
	class Pair {
		Pair(QObject obj) {
			_obj = obj;
			_defaultVal = QObject.Null;
		}
		QObject _obj;
		QObject _defaultVal;
	}
	HashMap<String, Pair> _curEnv;
	Environment _parent;
	public Environment(Environment parent)
	{
		_parent = parent;
		_curEnv = new HashMap<String, Pair>();
	}
	
	public QObject get(String key)
	{
		Pair ent = getEntry(key);
		if(ent != null)
			return ent._obj;
		return null;
	}
	
	public Pair getEntry(String key)
	{
		if(_curEnv.containsKey(key))
			return _curEnv.get(key);
		if(_parent == null)
			return null;
		return _parent.getEntry(key);
		
	}
	

	public QObject getDefaultValue(String key)
	{
		Pair ent = getEntry(key);
		if(ent != null)
			return ent._defaultVal;
		return null;
	}


    public void remove(String key) {_curEnv.remove(key); }
	public void put(String key, QObject obj)
	{
		_curEnv.put(key, new Pair(obj));
	}
	public void putDefault(String key, QObject defVal)
	{
		Pair ent = getEntry(key);
		ent._defaultVal = defVal;
	}
}
