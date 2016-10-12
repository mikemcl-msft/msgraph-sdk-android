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
 * The class for the Base Plan Collection With References Request.
 */
public class BasePlanCollectionWithReferencesRequest extends BaseCollectionRequest<BasePlanCollectionResponse, IPlanCollectionPage> implements IBasePlanCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of Plan
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlanCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePlanCollectionResponse.class, IPlanCollectionPage.class);
    }

    public void get(final ICallback<IPlanCollectionWithReferencesPage> callback) {
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

    public IPlanCollectionWithReferencesPage get() throws ClientException {
        final BasePlanCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IPlanCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlanCollectionWithReferencesRequest)this;
    }

    public IPlanCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlanCollectionWithReferencesRequest)this;
    }

    public IPlanCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlanCollectionWithReferencesRequest)this;
    }

    public IPlanCollectionWithReferencesPage buildFromResponse(final BasePlanCollectionResponse response) {
        final IPlanCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlanCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlanCollectionWithReferencesPage page = new PlanCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}