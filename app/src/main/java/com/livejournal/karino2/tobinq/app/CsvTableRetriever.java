package com.livejournal.karino2.tobinq.app;


public class CsvTableRetriever implements CsvTableRetrievable {
	public interface ResumeListener {
		void onResume();
		void onResumeFail(String message);
		void notifyStatus(String message);
	}

	ResumeListener _listener;
	public CsvTableRetriever(ResumeListener listener) {
		_prevUrl = "";
		_listener = listener;
	}
	
	CsvTable _table;		
	String _prevUrl;

	@Override
	public CsvTable retrieve(String url) throws BlockException {
		if(_prevUrl.equals(url) && _table != null)
			return _table;
		_prevUrl = url;

        // TODO: implement here
        /*
		CsvServiceAsync csvSvc = GWT.create(CsvService.class);
		AsyncCallback<CsvTable> callback = new AsyncCallback<CsvTable>() {

			@Override
			public void onFailure(Throwable caught) {
				_listener.notifyStatus("request failure.");				
				_listener.onResumeFail(caught.toString());
			}

			@Override
			public void onSuccess(CsvTable result) {
				 _listener.notifyStatus("request success.");
				_table = result;
				_listener.onResume();
			}
			
		};
		csvSvc.getRemoteCsv(url, callback);
		*/
		throw new BlockException();
	}

}
