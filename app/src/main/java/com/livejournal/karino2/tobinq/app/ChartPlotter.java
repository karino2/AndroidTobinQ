package com.livejournal.karino2.tobinq.app;

import android.content.Context;

import org.achartengine.ChartFactory;
import org.achartengine.GraphicalView;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/**
 * Created by karino on 4/12/14.
 */
public abstract class ChartPlotter implements Plotable {
    XYMultipleSeriesDataset dataset;
    XYMultipleSeriesRenderer renderer;


    @Override
    public void setDatasetRenderer(XYMultipleSeriesDataset dataset, XYMultipleSeriesRenderer renderer) {
        this.dataset = dataset;
        this.renderer = renderer;
    }

    protected GraphicalView createChart(Context context) {
        return ChartFactory.getLineChartView(context, dataset, renderer);
    }


}
