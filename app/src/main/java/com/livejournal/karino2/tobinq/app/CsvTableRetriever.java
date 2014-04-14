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
		_listener = listener;
        this.retriever = retriever;
	}

    public static CsvTable textToTableStatic(String responseText) throws IOException {
        CSVReader reader = new CSVReader(new StringReader(responseText));
        ArrayList<String[]> lines = new ArrayList<String[]>();
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            lines.add(nextLine);
        }
        return new CsvTable(lines.toArray(new String[][]{{}}));

    }

    public CsvTable textToTable(String responseText) {
        try {
            return textToTableStatic(responseText);
        } catch (IOException e) {
            _listener.notifyStatus("IOException while csv read: " + e.getMessage());
        }
        return new CsvTable(new String[][] {{}});
    }

	@Override
	public CsvTable retrieve(String url) throws BlockException {
        String content = retriever.retrieveFromCache(url);
        if (content != null) {
            return textToTable(content);
        }

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

		throw new BlockException();
	}

}
