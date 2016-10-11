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
 * The class for the Base Directory Role Template Collection Request.
 */
public class BaseDirectoryRoleTemplateCollectionRequest extends BaseCollectionRequest<BaseDirectoryRoleTemplateCollectionResponse, IDirectoryRoleTemplateCollectionPage> implements IBaseDirectoryRoleTemplateCollectionRequest {

    /**
     * The request builder for this collection of DirectoryRoleTemplate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDirectoryRoleTemplateCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDirectoryRoleTemplateCollectionResponse.class, IDirectoryRoleTemplateCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryRoleTemplateCollectionPage> callback) {
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

    public IDirectoryRoleTemplateCollectionPage get() throws ClientException {
        final BaseDirectoryRoleTemplateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectoryRoleTemplate newDirectoryRoleTemplate, final ICallback<DirectoryRoleTemplate> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectoryRoleTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDirectoryRoleTemplate, callback);
    }

    public DirectoryRoleTemplate post(final DirectoryRoleTemplate newDirectoryRoleTemplate) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectoryRoleTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newDirectoryRoleTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDirectoryRoleTemplateCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DirectoryRoleTemplateCollectionRequest)this;
    }

    public IDirectoryRoleTemplateCollectionPage buildFromResponse(final BaseDirectoryRoleTemplateCollectionResponse response) {
        final IDirectoryRoleTemplateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryRoleTemplateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryRoleTemplateCollectionPage page = new DirectoryRoleTemplateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
