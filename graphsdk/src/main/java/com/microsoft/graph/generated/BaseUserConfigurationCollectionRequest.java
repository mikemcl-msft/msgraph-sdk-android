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
 * The class for the Base User Configuration Collection Request.
 */
public class BaseUserConfigurationCollectionRequest extends BaseCollectionRequest<BaseUserConfigurationCollectionResponse, IUserConfigurationCollectionPage> implements IBaseUserConfigurationCollectionRequest {

    /**
     * The request builder for this collection of UserConfiguration
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseUserConfigurationCollectionResponse.class, IUserConfigurationCollectionPage.class);
    }

    public void get(final ICallback<IUserConfigurationCollectionPage> callback) {
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

    public IUserConfigurationCollectionPage get() throws ClientException {
        final BaseUserConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserConfiguration newUserConfiguration, final ICallback<UserConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newUserConfiguration, callback);
    }

    public UserConfiguration post(final UserConfiguration newUserConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newUserConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IUserConfigurationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (UserConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IUserConfigurationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (UserConfigurationCollectionRequest)this;
    }

    public IUserConfigurationCollectionPage buildFromResponse(final BaseUserConfigurationCollectionResponse response) {
        final IUserConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserConfigurationCollectionPage page = new UserConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
