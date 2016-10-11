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
 * The class for the Base Workbook Functions Ddb Request Builder.
 */
public class BaseWorkbookFunctionsDdbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDdb
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDdbRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement period, final com.google.gson.JsonElement factor) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("cost", cost);
        mBodyParams.put("salvage", salvage);
        mBodyParams.put("life", life);
        mBodyParams.put("period", period);
        mBodyParams.put("factor", factor);
    }

    /**
     * Creates the IWorkbookFunctionsDdbRequest
     *
     * @return The IWorkbookFunctionsDdbRequest instance
     */
    public IWorkbookFunctionsDdbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDdbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDdbRequest instance
     */
    public IWorkbookFunctionsDdbRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsDdbRequest request = new WorkbookFunctionsDdbRequest(
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

        if (hasParameter("period")) {
            request.mBody.period = getParameter("period");
        }

        if (hasParameter("factor")) {
            request.mBody.factor = getParameter("factor");
        }

        return request;
    }
}
