package com.fr.plugin.chart.data;

import com.fr.chart.chartdata.MoreNameCDDefinition;
import com.fr.chart.chartdata.NormalChartData;

/**
 * Created by Mitisky on 16/1/19.
 */
public class VanChartMoreNameCDDefinition extends MoreNameCDDefinition {

    private static final long serialVersionUID = -2555257182076448042L;

    protected NormalChartData getNormalChartData(Object[] series_name_array, Object[][] series_v_2D) {
        NormalChartData normal = new VanChartNormalChartData(categoryLabels, series_name_array, series_v_2D);
        normal.setSecondCates(secondLabels);
        normal.setThirdCates(thirdLabels);
        return normal;
    }
}
