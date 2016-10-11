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
 * The class for the Base Workbook Table Clear Filters Request Builder.
 */
public class BaseWorkbookTableClearFiltersRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableClearFilters
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableClearFiltersRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookTableClearFiltersRequest
     *
     * @return The IWorkbookTableClearFiltersRequest instance
     */
    public IWorkbookTableClearFiltersRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableClearFiltersRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookTableClearFiltersRequest instance
     */
    public IWorkbookTableClearFiltersRequest buildRequest(final List<Option> requestOptions) {
        WorkbookTableClearFiltersRequest request = new WorkbookTableClearFiltersRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
