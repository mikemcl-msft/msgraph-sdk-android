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
 * The class for the Base Workbook Functions Dollar De Request Builder.
 */
public class BaseWorkbookFunctionsDollarDeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDollarDe
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDollarDeRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement fractionalDollar, final com.google.gson.JsonElement fraction) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("fractionalDollar", fractionalDollar);
        mBodyParams.put("fraction", fraction);
    }

    /**
     * Creates the IWorkbookFunctionsDollarDeRequest
     *
     * @return The IWorkbookFunctionsDollarDeRequest instance
     */
    public IWorkbookFunctionsDollarDeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDollarDeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDollarDeRequest instance
     */
    public IWorkbookFunctionsDollarDeRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsDollarDeRequest request = new WorkbookFunctionsDollarDeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fractionalDollar")) {
            request.mBody.fractionalDollar = getParameter("fractionalDollar");
        }

        if (hasParameter("fraction")) {
            request.mBody.fraction = getParameter("fraction");
        }

        return request;
    }
}
