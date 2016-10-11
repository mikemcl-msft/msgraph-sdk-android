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
 * The class for the Base Workbook Table Column Request Builder.
 */
public class BaseWorkbookTableColumnRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableColumnRequestBuilder {

    /**
     * The request builder for the WorkbookTableColumn
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableColumnRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookTableColumnRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookTableColumnRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookTableColumnRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookFilter.
     */
    public IWorkbookFilterRequestBuilder getFilter() {
        return new WorkbookFilterRequestBuilder(getRequestUrlWithAdditionalSegment("filter"), getClient(), null);
    }

    public IWorkbookTableColumnDataBodyRangeRequestBuilder getDataBodyRange() {
        return new WorkbookTableColumnDataBodyRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dataBodyRange"), getClient(), null);
    }

    public IWorkbookTableColumnHeaderRowRangeRequestBuilder getHeaderRowRange() {
        return new WorkbookTableColumnHeaderRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.headerRowRange"), getClient(), null);
    }

    public IWorkbookTableColumnRangeRequestBuilder getRange() {
        return new WorkbookTableColumnRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookTableColumnTotalRowRangeRequestBuilder getTotalRowRange() {
        return new WorkbookTableColumnTotalRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.totalRowRange"), getClient(), null);
    }
}
