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
 * The class for the Base Workbook Functions Neg Binom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsNegBinom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNegBinom_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsNegBinom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement numberF, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("numberF", numberF);
        mBodyParams.put("numberS", numberS);
        mBodyParams.put("probabilityS", probabilityS);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest
     *
     * @return The IWorkbookFunctionsNegBinom_DistRequest instance
     */
    public IWorkbookFunctionsNegBinom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNegBinom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsNegBinom_DistRequest instance
     */
    public IWorkbookFunctionsNegBinom_DistRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsNegBinom_DistRequest request = new WorkbookFunctionsNegBinom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numberF")) {
            request.mBody.numberF = getParameter("numberF");
        }

        if (hasParameter("numberS")) {
            request.mBody.numberS = getParameter("numberS");
        }

        if (hasParameter("probabilityS")) {
            request.mBody.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
