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
 * The class for the Base Workbook Functions Im Log2Request Builder.
 */
public class BaseWorkbookFunctionsImLog2RequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsImLog2
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsImLog2RequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement inumber) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("inumber", inumber);
    }

    /**
     * Creates the IWorkbookFunctionsImLog2Request
     *
     * @return The IWorkbookFunctionsImLog2Request instance
     */
    public IWorkbookFunctionsImLog2Request buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsImLog2Request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsImLog2Request instance
     */
    public IWorkbookFunctionsImLog2Request buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsImLog2Request request = new WorkbookFunctionsImLog2Request(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("inumber")) {
            request.mBody.inumber = getParameter("inumber");
        }

        return request;
    }
}
