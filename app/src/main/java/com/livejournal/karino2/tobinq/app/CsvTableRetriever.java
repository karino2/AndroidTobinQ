package com.livejournal.karino2.tobinq.app;


import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import au.com.bytecode.opencsv.CSVReader;

public class CsvTableRetriever implements CsvTableRetrievable {
	public interface ResumeListener {
		void onResume();
		void onResumeFail(String message);
		void notifyStatus(String message);
	}

	ResumeListener _listener;
    Retriever retriever;
	public CsvTableRetriever(ResumeListener listener, Retriever retriever) {
		_prevUrl = "";
		_listener = listener;
        this.retriever = retriever;
	}
	
	CsvTable _table;		
	String _prevUrl;

    public CsvTable textToTable(String responseText) {
        CSVReader reader = new CSVReader(new StringReader(responseText));
        try {
            ArrayList<String[]> lines = new ArrayList<String[]>();
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                lines.add(nextLine);
            }
            return new CsvTable(lines.toArray(new String[][]{{}}));

        } catch (IOException e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }
		/*
		String[][] ret = new String[3][2];
		ret[0][0] = "00";
		ret[0][1] = "01";
		ret[1][0] = "10";
		ret[1][1] = "11";
		ret[2][0] = "20";
		ret[2][1] = "21";
		return ret;
		*/
        return new CsvTable(new String[][] {{}});
    }

	@Override
	public CsvTable retrieve(String url) throws BlockException {
        /*
        if(!_prevUrl.equals(url)) {
            retriever.retrieveFromRemote(url, new Retriever.OnContentReadyListener() {
                @Override
                public void onReady(String responseText) {
                    _listener.notifyStatus("request success.");
                    _table = textToTable(responseText);
                    _listener.onResume();
                }

                @Override
                public void onFail(String message) {
                    _listener.notifyStatus("request failure.");
                    _listener.onResumeFail(message);
                }
            });

            _prevUrl = url;
            throw new BlockException();
        }
        */
        /*
		if(_prevUrl.equals(url) && _table != null)
			return _table;
			*/

        // currently, only cache after second request.
        // this is for debug.
        boolean useCache = _prevUrl.equals(url);
        if(useCache) {

            String content = retriever.retrieveFromCache(url);
            if (content != null) {
                return textToTable(content);
            }
        }
        _prevUrl = url;


        retriever.retrieveFromRemote(url, new Retriever.OnContentReadyListener() {
            @Override
            public void onReady(String responseText) {
                _listener.notifyStatus("request success.");
                _listener.onResume();
            }

            @Override
            public void onFail(String message) {
                _listener.notifyStatus("request failure.");
                _listener.onResumeFail(message);
            }
        });

        // never ending!
        /*
        retriever.retrieveFromRemote(url, new Retriever.OnContentReadyListener() {
            @Override
            public void onReady(String responseText) {
                _listener.notifyStatus("request success.");
                _table = textToTable(responseText);
                _listener.onResume();
            }

            @Override
            public void onFail(String message) {
                _listener.notifyStatus("request failure.");
                _listener.onResumeFail(message);
            }
        });
        */
		throw new BlockException();
	}

}
