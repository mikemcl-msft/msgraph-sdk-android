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
 * The class for the Base Impossible Travel Risk Event Collection Request Builder.
 */
public class BaseImpossibleTravelRiskEventCollectionRequestBuilder extends BaseRequestBuilder implements IBaseImpossibleTravelRiskEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of ImpossibleTravelRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseImpossibleTravelRiskEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IImpossibleTravelRiskEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IImpossibleTravelRiskEventCollectionRequest buildRequest(final List<Option> options) {
        return new ImpossibleTravelRiskEventCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IImpossibleTravelRiskEventRequestBuilder byId(final String id) {
        return new ImpossibleTravelRiskEventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
