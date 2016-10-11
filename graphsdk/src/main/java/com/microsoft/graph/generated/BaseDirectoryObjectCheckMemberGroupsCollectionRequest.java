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
 * The class for the Base Directory Object Check Member Groups Collection Request.
 */
public class BaseDirectoryObjectCheckMemberGroupsCollectionRequest extends BaseCollectionRequest<BaseDirectoryObjectCheckMemberGroupsCollectionResponse, IDirectoryObjectCheckMemberGroupsCollectionPage> implements IBaseDirectoryObjectCheckMemberGroupsCollectionRequest {


    protected final DirectoryObjectCheckMemberGroupsBody mBody;


    /**
     * The request for this DirectoryObjectCheckMemberGroups
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDirectoryObjectCheckMemberGroupsCollectionRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDirectoryObjectCheckMemberGroupsCollectionResponse.class, IDirectoryObjectCheckMemberGroupsCollectionPage.class);
        mBody = new DirectoryObjectCheckMemberGroupsBody();
    }


    public void post(final ICallback<IDirectoryObjectCheckMemberGroupsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDirectoryObjectCheckMemberGroupsCollectionPage post() throws ClientException {
        final BaseDirectoryObjectCheckMemberGroupsCollectionResponse response = post(mBody);
        return buildFromResponse(response);
    }


    public IDirectoryObjectCheckMemberGroupsCollectionPage buildFromResponse(final BaseDirectoryObjectCheckMemberGroupsCollectionResponse response) {
        final IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* groupIds */ null);
        } else {
            builder = null;
        }
        final IDirectoryObjectCheckMemberGroupsCollectionPage page = new DirectoryObjectCheckMemberGroupsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDirectoryObjectCheckMemberGroupsCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IDirectoryObjectCheckMemberGroupsCollectionRequest)this;
    }

}
