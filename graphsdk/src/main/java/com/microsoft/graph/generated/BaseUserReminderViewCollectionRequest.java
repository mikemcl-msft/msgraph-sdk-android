// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base User Reminder View Collection Request.
 */
public class BaseUserReminderViewCollectionRequest extends BaseCollectionRequest<BaseUserReminderViewCollectionResponse, IUserReminderViewCollectionPage> implements IBaseUserReminderViewCollectionRequest {


    /**
     * The request for this UserReminderView
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserReminderViewCollectionRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseUserReminderViewCollectionResponse.class, IUserReminderViewCollectionPage.class);
    }


    public void get(final ICallback<IUserReminderViewCollectionPage> callback) {
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

    public IUserReminderViewCollectionPage get() throws ClientException {
        final BaseUserReminderViewCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IUserReminderViewCollectionPage buildFromResponse(final BaseUserReminderViewCollectionResponse response) {
        final IUserReminderViewCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserReminderViewCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* startDateTime */ null, /* endDateTime */ null);
        } else {
            builder = null;
        }
        final IUserReminderViewCollectionPage page = new UserReminderViewCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IUserReminderViewCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IUserReminderViewCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IUserReminderViewCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IUserReminderViewCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IUserReminderViewCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IUserReminderViewCollectionRequest)this;
    }

}
