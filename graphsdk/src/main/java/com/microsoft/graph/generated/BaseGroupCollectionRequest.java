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
 * The class for the Base Group Collection Request.
 */
public class BaseGroupCollectionRequest extends BaseCollectionRequest<BaseGroupCollectionResponse, IGroupCollectionPage> implements IBaseGroupCollectionRequest {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseGroupCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseGroupCollectionResponse.class, IGroupCollectionPage.class);
    }

    public void get(final ICallback<IGroupCollectionPage> callback) {
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

    public IGroupCollectionPage get() throws ClientException {
        final BaseGroupCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Group newGroup, final ICallback<Group> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newGroup, callback);
    }

    public Group post(final Group newGroup) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IGroupCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (GroupCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IGroupCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (GroupCollectionRequest)this;
    }

    public IGroupCollectionPage buildFromResponse(final BaseGroupCollectionResponse response) {
        final IGroupCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupCollectionPage page = new GroupCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
