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
 * The class for the Base Resource Collection Request Builder.
 */
public class BaseResourceCollectionRequestBuilder extends BaseRequestBuilder implements IBaseResourceCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notes
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseResourceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IResourceCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IResourceCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new ResourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IResourceRequestBuilder byId(final String id) {
        return new ResourceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
