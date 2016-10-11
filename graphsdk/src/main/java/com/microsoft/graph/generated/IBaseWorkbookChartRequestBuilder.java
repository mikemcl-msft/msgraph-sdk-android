// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Request Builder.
 */
public interface IBaseWorkbookChartRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IWorkbookChartRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IWorkbookChartRequest buildRequest(final List<Option> requestOptions);

    /**
     * Gets the request builder for WorkbookChartAxes.
     */
    IWorkbookChartAxesRequestBuilder getAxes();

    /**
     * Gets the request builder for WorkbookChartDataLabels.
     */
    IWorkbookChartDataLabelsRequestBuilder getDataLabels();

    /**
     * Gets the request builder for WorkbookChartAreaFormat.
     */
    IWorkbookChartAreaFormatRequestBuilder getFormat();

    /**
     * Gets the request builder for WorkbookChartLegend.
     */
    IWorkbookChartLegendRequestBuilder getLegend();

    IWorkbookChartSeriesCollectionRequestBuilder getSeries();

    IWorkbookChartSeriesRequestBuilder getSeries(final String id);

    /**
     * Gets the request builder for WorkbookChartTitle.
     */
    IWorkbookChartTitleRequestBuilder getTitle();

    /**
     * Gets the request builder for WorkbookWorksheet.
     */
    IWorkbookWorksheetRequestBuilder getWorksheet();
    IWorkbookChartSetDataRequestBuilder getSetData(final com.google.gson.JsonElement sourceData, final String seriesBy);
    IWorkbookChartSetPositionRequestBuilder getSetPosition(final com.google.gson.JsonElement startCell, final com.google.gson.JsonElement endCell);
    IWorkbookChartImageRequestBuilder getImage();
    IWorkbookChartImageRequestBuilder getImage(final Integer width);
    IWorkbookChartImageRequestBuilder getImage(final Integer width, final Integer height);
    IWorkbookChartImageRequestBuilder getImage(final Integer width, final Integer height, final String fittingMode);

}
