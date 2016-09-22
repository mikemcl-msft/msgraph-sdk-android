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
 * The class for the Base Anonymous Ip Risk Event Collection Request.
 */
public class BaseAnonymousIpRiskEventCollectionRequest extends BaseCollectionRequest<BaseAnonymousIpRiskEventCollectionResponse, IAnonymousIpRiskEventCollectionPage> implements IBaseAnonymousIpRiskEventCollectionRequest {

    /**
     * The request builder for this collection of AnonymousIpRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseAnonymousIpRiskEventCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseAnonymousIpRiskEventCollectionResponse.class, IAnonymousIpRiskEventCollectionPage.class);
    }

    public void get(final ICallback<IAnonymousIpRiskEventCollectionPage> callback) {
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

    public IAnonymousIpRiskEventCollectionPage get() throws ClientException {
        final BaseAnonymousIpRiskEventCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AnonymousIpRiskEvent newAnonymousIpRiskEvent, final ICallback<AnonymousIpRiskEvent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AnonymousIpRiskEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newAnonymousIpRiskEvent, callback);
    }

    public AnonymousIpRiskEvent post(final AnonymousIpRiskEvent newAnonymousIpRiskEvent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AnonymousIpRiskEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newAnonymousIpRiskEvent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IAnonymousIpRiskEventCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AnonymousIpRiskEventCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IAnonymousIpRiskEventCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AnonymousIpRiskEventCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IAnonymousIpRiskEventCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AnonymousIpRiskEventCollectionRequest)this;
    }

    public IAnonymousIpRiskEventCollectionPage buildFromResponse(final BaseAnonymousIpRiskEventCollectionResponse response) {
        final IAnonymousIpRiskEventCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AnonymousIpRiskEventCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AnonymousIpRiskEventCollectionPage page = new AnonymousIpRiskEventCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
