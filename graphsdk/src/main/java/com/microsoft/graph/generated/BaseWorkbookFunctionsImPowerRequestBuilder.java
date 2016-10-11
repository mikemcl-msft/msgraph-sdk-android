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
 * The class for the Base Workbook Functions Im Power Request Builder.
 */
public class BaseWorkbookFunctionsImPowerRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImPower
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsImPowerRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement inumber, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("inumber", inumber);
        mBodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsImPowerRequest
     *
     * @return The IWorkbookFunctionsImPowerRequest instance
     */
    public IWorkbookFunctionsImPowerRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImPowerRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsImPowerRequest instance
     */
    public IWorkbookFunctionsImPowerRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsImPowerRequest request = new WorkbookFunctionsImPowerRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.mBody.inumber = getParameter("inumber");
        }

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        return request;
    }
}
