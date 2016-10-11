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
 * The class for the Base Org Contact Collection Request.
 */
public class BaseOrgContactCollectionRequest extends BaseCollectionRequest<BaseOrgContactCollectionResponse, IOrgContactCollectionPage> implements IBaseOrgContactCollectionRequest {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOrgContactCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseOrgContactCollectionResponse.class, IOrgContactCollectionPage.class);
    }

    public void get(final ICallback<IOrgContactCollectionPage> callback) {
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

    public IOrgContactCollectionPage get() throws ClientException {
        final BaseOrgContactCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OrgContact newOrgContact, final ICallback<OrgContact> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OrgContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newOrgContact, callback);
    }

    public OrgContact post(final OrgContact newOrgContact) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OrgContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newOrgContact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IOrgContactCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (OrgContactCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IOrgContactCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (OrgContactCollectionRequest)this;
    }

    public IOrgContactCollectionPage buildFromResponse(final BaseOrgContactCollectionResponse response) {
        final IOrgContactCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OrgContactCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OrgContactCollectionPage page = new OrgContactCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
