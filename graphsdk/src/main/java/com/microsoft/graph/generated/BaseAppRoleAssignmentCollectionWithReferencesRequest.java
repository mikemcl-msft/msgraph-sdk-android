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
 * The class for the Base App Role Assignment Collection With References Request.
 */
public class BaseAppRoleAssignmentCollectionWithReferencesRequest extends BaseCollectionRequest<BaseAppRoleAssignmentCollectionResponse, IAppRoleAssignmentCollectionPage> implements IBaseAppRoleAssignmentCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of AppRoleAssignment
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseAppRoleAssignmentCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseAppRoleAssignmentCollectionResponse.class, IAppRoleAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IAppRoleAssignmentCollectionWithReferencesPage> callback) {
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

    public IAppRoleAssignmentCollectionWithReferencesPage get() throws ClientException {
        final BaseAppRoleAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IAppRoleAssignmentCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AppRoleAssignmentCollectionWithReferencesRequest)this;
    }

    public IAppRoleAssignmentCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AppRoleAssignmentCollectionWithReferencesRequest)this;
    }

    public IAppRoleAssignmentCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AppRoleAssignmentCollectionWithReferencesRequest)this;
    }

    public IAppRoleAssignmentCollectionWithReferencesPage buildFromResponse(final BaseAppRoleAssignmentCollectionResponse response) {
        final IAppRoleAssignmentCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppRoleAssignmentCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppRoleAssignmentCollectionWithReferencesPage page = new AppRoleAssignmentCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
