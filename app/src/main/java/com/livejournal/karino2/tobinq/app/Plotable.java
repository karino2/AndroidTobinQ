package com.livejournal.karino2.tobinq.app;

import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

public interface Plotable {

    // TODO: implement here
    public abstract void setDatasetRenderer(XYMultipleSeriesDataset dataset, XYMultipleSeriesRenderer renderer);
	public abstract void resetChart();

	public abstract void showChart();

}
