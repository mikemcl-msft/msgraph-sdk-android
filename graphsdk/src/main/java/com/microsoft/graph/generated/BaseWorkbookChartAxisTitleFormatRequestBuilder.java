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
 * The class for the Base Workbook Chart Axis Title Format Request Builder.
 */
public class BaseWorkbookChartAxisTitleFormatRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartAxisTitleFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartAxisTitleFormat
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartAxisTitleFormatRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookChartAxisTitleFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookChartAxisTitleFormatRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookChartAxisTitleFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartFont.
     */
    public IWorkbookChartFontRequestBuilder getFont() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }
}
