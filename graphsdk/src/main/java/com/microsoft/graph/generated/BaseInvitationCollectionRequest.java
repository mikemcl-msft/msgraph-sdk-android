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
 * The class for the Base Invitation Collection Request.
 */
public class BaseInvitationCollectionRequest extends BaseCollectionRequest<BaseInvitationCollectionResponse, IInvitationCollectionPage> implements IBaseInvitationCollectionRequest {

    /**
     * The request builder for this collection of Invitation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseInvitationCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseInvitationCollectionResponse.class, IInvitationCollectionPage.class);
    }

    public void get(final ICallback<IInvitationCollectionPage> callback) {
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

    public IInvitationCollectionPage get() throws ClientException {
        final BaseInvitationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Invitation newInvitation, final ICallback<Invitation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new InvitationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newInvitation, callback);
    }

    public Invitation post(final Invitation newInvitation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new InvitationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newInvitation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IInvitationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (InvitationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IInvitationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (InvitationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IInvitationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (InvitationCollectionRequest)this;
    }

    public IInvitationCollectionPage buildFromResponse(final BaseInvitationCollectionResponse response) {
        final IInvitationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InvitationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final InvitationCollectionPage page = new InvitationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
