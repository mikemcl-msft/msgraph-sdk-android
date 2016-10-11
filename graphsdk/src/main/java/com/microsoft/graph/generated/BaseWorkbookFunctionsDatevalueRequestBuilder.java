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
 * The class for the Base Workbook Functions Datevalue Request Builder.
 */
public class BaseWorkbookFunctionsDatevalueRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDatevalue
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDatevalueRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement dateText) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("dateText", dateText);
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest
     *
     * @return The IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDatevalueRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDatevalueRequest instance
     */
    public IWorkbookFunctionsDatevalueRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsDatevalueRequest request = new WorkbookFunctionsDatevalueRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("dateText")) {
            request.mBody.dateText = getParameter("dateText");
        }

        return request;
    }
}
