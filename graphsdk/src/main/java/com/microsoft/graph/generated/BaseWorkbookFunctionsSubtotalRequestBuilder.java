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
 * The class for the Base Workbook Functions Subtotal Request Builder.
 */
public class BaseWorkbookFunctionsSubtotalRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSubtotal
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsSubtotalRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement functionNum, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("functionNum", functionNum);
        mBodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSubtotalRequest
     *
     * @return The IWorkbookFunctionsSubtotalRequest instance
     */
    public IWorkbookFunctionsSubtotalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSubtotalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsSubtotalRequest instance
     */
    public IWorkbookFunctionsSubtotalRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsSubtotalRequest request = new WorkbookFunctionsSubtotalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("functionNum")) {
            request.mBody.functionNum = getParameter("functionNum");
        }

        if (hasParameter("values")) {
            request.mBody.values = getParameter("values");
        }

        return request;
    }
}
