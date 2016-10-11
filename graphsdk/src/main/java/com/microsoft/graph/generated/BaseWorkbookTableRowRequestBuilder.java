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
 * The class for the Base Workbook Table Row Request Builder.
 */
public class BaseWorkbookTableRowRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableRowRequestBuilder {

    /**
     * The request builder for the WorkbookTableRow
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableRowRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookTableRowRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookTableRowRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookTableRowRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWorkbookTableRowRangeRequestBuilder getRange() {
        return new WorkbookTableRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }
}
