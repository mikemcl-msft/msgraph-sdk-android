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
 * The class for the Base Workbook Functions Sln Request Builder.
 */
public class BaseWorkbookFunctionsSlnRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSln
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsSlnRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("cost", cost);
        mBodyParams.put("salvage", salvage);
        mBodyParams.put("life", life);
    }

    /**
     * Creates the IWorkbookFunctionsSlnRequest
     *
     * @return The IWorkbookFunctionsSlnRequest instance
     */
    public IWorkbookFunctionsSlnRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSlnRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsSlnRequest instance
     */
    public IWorkbookFunctionsSlnRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsSlnRequest request = new WorkbookFunctionsSlnRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.mBody.cost = getParameter("cost");
        }

        if (hasParameter("salvage")) {
            request.mBody.salvage = getParameter("salvage");
        }

        if (hasParameter("life")) {
            request.mBody.life = getParameter("life");
        }

        return request;
    }
}
