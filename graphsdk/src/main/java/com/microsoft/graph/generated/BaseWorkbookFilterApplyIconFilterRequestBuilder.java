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
 * The class for the Base Workbook Filter Apply Icon Filter Request Builder.
 */
public class BaseWorkbookFilterApplyIconFilterRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyIconFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFilterApplyIconFilterRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final WorkbookIcon icon) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("icon", icon);
    }

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest
     *
     * @return The IWorkbookFilterApplyIconFilterRequest instance
     */
    public IWorkbookFilterApplyIconFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyIconFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFilterApplyIconFilterRequest instance
     */
    public IWorkbookFilterApplyIconFilterRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFilterApplyIconFilterRequest request = new WorkbookFilterApplyIconFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("icon")) {
            request.mBody.icon = getParameter("icon");
        }

        return request;
    }
}
