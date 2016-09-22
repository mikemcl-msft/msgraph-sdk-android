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
 * The class for the Base Bucket Collection With References Request.
 */
public class BaseBucketCollectionWithReferencesRequest extends BaseCollectionRequest<BaseBucketCollectionResponse, IBucketCollectionPage> implements IBaseBucketCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of Bucket
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseBucketCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseBucketCollectionResponse.class, IBucketCollectionPage.class);
    }

    public void get(final ICallback<IBucketCollectionWithReferencesPage> callback) {
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

    public IBucketCollectionWithReferencesPage get() throws ClientException {
        final BaseBucketCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IBucketCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (BucketCollectionWithReferencesRequest)this;
    }

    public IBucketCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (BucketCollectionWithReferencesRequest)this;
    }

    public IBucketCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (BucketCollectionWithReferencesRequest)this;
    }

    public IBucketCollectionWithReferencesPage buildFromResponse(final BaseBucketCollectionResponse response) {
        final IBucketCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BucketCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BucketCollectionWithReferencesPage page = new BucketCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
