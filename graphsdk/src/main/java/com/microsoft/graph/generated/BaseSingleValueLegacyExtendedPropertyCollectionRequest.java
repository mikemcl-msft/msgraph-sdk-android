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
 * The class for the Base Single Value Legacy Extended Property Collection Request.
 */
public class BaseSingleValueLegacyExtendedPropertyCollectionRequest extends BaseCollectionRequest<BaseSingleValueLegacyExtendedPropertyCollectionResponse, ISingleValueLegacyExtendedPropertyCollectionPage> implements IBaseSingleValueLegacyExtendedPropertyCollectionRequest {

    /**
     * The request builder for this collection of SingleValueLegacyExtendedProperty
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseSingleValueLegacyExtendedPropertyCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseSingleValueLegacyExtendedPropertyCollectionResponse.class, ISingleValueLegacyExtendedPropertyCollectionPage.class);
    }

    public void get(final ICallback<ISingleValueLegacyExtendedPropertyCollectionPage> callback) {
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

    public ISingleValueLegacyExtendedPropertyCollectionPage get() throws ClientException {
        final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty, final ICallback<SingleValueLegacyExtendedProperty> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SingleValueLegacyExtendedPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSingleValueLegacyExtendedProperty, callback);
    }

    public SingleValueLegacyExtendedProperty post(final SingleValueLegacyExtendedProperty newSingleValueLegacyExtendedProperty) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SingleValueLegacyExtendedPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newSingleValueLegacyExtendedProperty);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public ISingleValueLegacyExtendedPropertyCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (SingleValueLegacyExtendedPropertyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public ISingleValueLegacyExtendedPropertyCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (SingleValueLegacyExtendedPropertyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public ISingleValueLegacyExtendedPropertyCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (SingleValueLegacyExtendedPropertyCollectionRequest)this;
    }

    public ISingleValueLegacyExtendedPropertyCollectionPage buildFromResponse(final BaseSingleValueLegacyExtendedPropertyCollectionResponse response) {
        final ISingleValueLegacyExtendedPropertyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SingleValueLegacyExtendedPropertyCollectionPage page = new SingleValueLegacyExtendedPropertyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
