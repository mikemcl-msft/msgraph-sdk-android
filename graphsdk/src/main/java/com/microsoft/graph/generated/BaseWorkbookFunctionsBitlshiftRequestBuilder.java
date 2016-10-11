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
 * The class for the Base Workbook Functions Bitlshift Request Builder.
 */
public class BaseWorkbookFunctionsBitlshiftRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBitlshift
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBitlshiftRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement shiftAmount) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("shiftAmount", shiftAmount);
    }

    /**
     * Creates the IWorkbookFunctionsBitlshiftRequest
     *
     * @return The IWorkbookFunctionsBitlshiftRequest instance
     */
    public IWorkbookFunctionsBitlshiftRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBitlshiftRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBitlshiftRequest instance
     */
    public IWorkbookFunctionsBitlshiftRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsBitlshiftRequest request = new WorkbookFunctionsBitlshiftRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("shiftAmount")) {
            request.mBody.shiftAmount = getParameter("shiftAmount");
        }

        return request;
    }
}
