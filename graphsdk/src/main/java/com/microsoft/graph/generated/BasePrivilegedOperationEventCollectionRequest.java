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
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Privileged Operation Event Collection Request.
 */
public class BasePrivilegedOperationEventCollectionRequest extends BaseCollectionRequest<BasePrivilegedOperationEventCollectionResponse, IPrivilegedOperationEventCollectionPage> implements IBasePrivilegedOperationEventCollectionRequest {

    /**
     * The request builder for this collection of PrivilegedOperationEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePrivilegedOperationEventCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePrivilegedOperationEventCollectionResponse.class, IPrivilegedOperationEventCollectionPage.class);
    }

    public void get(final ICallback<IPrivilegedOperationEventCollectionPage> callback) {
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

    public IPrivilegedOperationEventCollectionPage get() throws ClientException {
        final BasePrivilegedOperationEventCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrivilegedOperationEvent newPrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrivilegedOperationEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newPrivilegedOperationEvent, callback);
    }

    public PrivilegedOperationEvent post(final PrivilegedOperationEvent newPrivilegedOperationEvent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrivilegedOperationEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newPrivilegedOperationEvent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IPrivilegedOperationEventCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PrivilegedOperationEventCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IPrivilegedOperationEventCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PrivilegedOperationEventCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IPrivilegedOperationEventCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PrivilegedOperationEventCollectionRequest)this;
    }

    public IPrivilegedOperationEventCollectionPage buildFromResponse(final BasePrivilegedOperationEventCollectionResponse response) {
        final IPrivilegedOperationEventCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedOperationEventCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrivilegedOperationEventCollectionPage page = new PrivilegedOperationEventCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}