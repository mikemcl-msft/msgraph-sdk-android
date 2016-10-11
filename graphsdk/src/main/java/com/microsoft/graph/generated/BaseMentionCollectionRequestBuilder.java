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
 * The class for the Base Mention Collection Request Builder.
 */
public class BaseMentionCollectionRequestBuilder extends BaseRequestBuilder implements IBaseMentionCollectionRequestBuilder {

    /**
     * The request builder for this collection of Post
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseMentionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMentionCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMentionCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new MentionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMentionRequestBuilder byId(final String id) {
        return new MentionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
