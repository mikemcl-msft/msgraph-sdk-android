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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Anonymous Ip Risk Event Collection Request Builder.
 */
public class BaseAnonymousIpRiskEventCollectionRequestBuilder extends BaseRequestBuilder implements IBaseAnonymousIpRiskEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of AnonymousIpRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseAnonymousIpRiskEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IAnonymousIpRiskEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAnonymousIpRiskEventCollectionRequest buildRequest(final List<Option> options) {
        return new AnonymousIpRiskEventCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IAnonymousIpRiskEventRequestBuilder byId(final String id) {
        return new AnonymousIpRiskEventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
