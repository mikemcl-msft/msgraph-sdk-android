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
 * The class for the Base Bucket Collection Request.
 */
public class BaseBucketCollectionRequest extends BaseCollectionRequest<BaseBucketCollectionResponse, IBucketCollectionPage> implements IBaseBucketCollectionRequest {

    /**
     * The request builder for this collection of Bucket
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseBucketCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseBucketCollectionResponse.class, IBucketCollectionPage.class);
    }

    public void get(final ICallback<IBucketCollectionPage> callback) {
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

    public IBucketCollectionPage get() throws ClientException {
        final BaseBucketCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Bucket newBucket, final ICallback<Bucket> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new BucketRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newBucket, callback);
    }

    public Bucket post(final Bucket newBucket) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BucketRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newBucket);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IBucketCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (BucketCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IBucketCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (BucketCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IBucketCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (BucketCollectionRequest)this;
    }

    public IBucketCollectionPage buildFromResponse(final BaseBucketCollectionResponse response) {
        final IBucketCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BucketCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BucketCollectionPage page = new BucketCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
