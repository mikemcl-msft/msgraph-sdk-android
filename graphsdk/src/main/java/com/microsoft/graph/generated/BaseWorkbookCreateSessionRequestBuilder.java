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
 * The class for the Base Workbook Create Session Request Builder.
 */
public class BaseWorkbookCreateSessionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookCreateSession
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookCreateSessionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Boolean persistChanges) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("persistChanges", persistChanges);
    }

    /**
     * Creates the IWorkbookCreateSessionRequest
     *
     * @return The IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookCreateSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookCreateSessionRequest instance
     */
    public IWorkbookCreateSessionRequest buildRequest(final List<Option> requestOptions) {
        WorkbookCreateSessionRequest request = new WorkbookCreateSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("persistChanges")) {
            request.mBody.persistChanges = getParameter("persistChanges");
        }

        return request;
    }
}
