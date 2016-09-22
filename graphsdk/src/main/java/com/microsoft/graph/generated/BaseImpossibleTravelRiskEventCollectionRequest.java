// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Impossible Travel Risk Event Collection Request.
 */
public class BaseImpossibleTravelRiskEventCollectionRequest extends BaseCollectionRequest<BaseImpossibleTravelRiskEventCollectionResponse, IImpossibleTravelRiskEventCollectionPage> implements IBaseImpossibleTravelRiskEventCollectionRequest {

    /**
     * The request builder for this collection of ImpossibleTravelRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseImpossibleTravelRiskEventCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseImpossibleTravelRiskEventCollectionResponse.class, IImpossibleTravelRiskEventCollectionPage.class);
    }

    public void get(final ICallback<IImpossibleTravelRiskEventCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IImpossibleTravelRiskEventCollectionPage get() throws ClientException {
        final BaseImpossibleTravelRiskEventCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ImpossibleTravelRiskEvent newImpossibleTravelRiskEvent, final ICallback<ImpossibleTravelRiskEvent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ImpossibleTravelRiskEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newImpossibleTravelRiskEvent, callback);
    }

    public ImpossibleTravelRiskEvent post(final ImpossibleTravelRiskEvent newImpossibleTravelRiskEvent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ImpossibleTravelRiskEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newImpossibleTravelRiskEvent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IImpossibleTravelRiskEventCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ImpossibleTravelRiskEventCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IImpossibleTravelRiskEventCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ImpossibleTravelRiskEventCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IImpossibleTravelRiskEventCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ImpossibleTravelRiskEventCollectionRequest)this;
    }

    public IImpossibleTravelRiskEventCollectionPage buildFromResponse(final BaseImpossibleTravelRiskEventCollectionResponse response) {
        final IImpossibleTravelRiskEventCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ImpossibleTravelRiskEventCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ImpossibleTravelRiskEventCollectionPage page = new ImpossibleTravelRiskEventCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
