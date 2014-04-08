package com.livejournal.karino2.tobinq.app;

public interface CsvTableRetrievable {
	CsvTable retrieve(String url)  throws BlockException;
}
