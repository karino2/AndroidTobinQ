package com.livejournal.karino2.tobinq.app;

public interface CsvServiceAsync
{

    void getRemoteCsv(String dummy); // dummy entry
    // void getRemoteCsv( java.lang.String url, AsyncCallback<com.appspot.WebTobinQ.client.CsvTable> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    /*
    public static final class Util 
    { 
        private static CsvServiceAsync instance;

        public static final CsvServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (CsvServiceAsync) GWT.create( CsvService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "csv" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
    */
}
