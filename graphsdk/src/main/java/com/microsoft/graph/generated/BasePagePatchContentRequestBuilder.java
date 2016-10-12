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
 * The class for the Base Page Patch Content Request Builder.
 */
public class BasePagePatchContentRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this PagePatchContent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePagePatchContentRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final List<PatchContentCommand> commands) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("commands", commands);
    }

    /**
     * Creates the IPagePatchContentRequest
     *
     * @return The IPagePatchContentRequest instance
     */
    public IPagePatchContentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPagePatchContentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IPagePatchContentRequest instance
     */
    public IPagePatchContentRequest buildRequest(final List<Option> requestOptions) {
        PagePatchContentRequest request = new PagePatchContentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("commands")) {
            request.mBody.commands = getParameter("commands");
        }

        return request;
    }
}