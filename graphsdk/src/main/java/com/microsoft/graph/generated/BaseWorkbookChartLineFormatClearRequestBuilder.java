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
 * The class for the Base Workbook Chart Line Format Clear Request Builder.
 */
public class BaseWorkbookChartLineFormatClearRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartLineFormatClear
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartLineFormatClearRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest
     *
     * @return The IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest(final List<Option> requestOptions) {
        WorkbookChartLineFormatClearRequest request = new WorkbookChartLineFormatClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
