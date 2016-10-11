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
 * The class for the Base Workbook Functions St Dev_SRequest Builder.
 */
public class BaseWorkbookFunctionsStDev_SRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsStDev_S
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsStDev_SRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsStDev_SRequest
     *
     * @return The IWorkbookFunctionsStDev_SRequest instance
     */
    public IWorkbookFunctionsStDev_SRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsStDev_SRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsStDev_SRequest instance
     */
    public IWorkbookFunctionsStDev_SRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsStDev_SRequest request = new WorkbookFunctionsStDev_SRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.mBody.values = getParameter("values");
        }

        return request;
    }
}
