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
 * The class for the Base App Role Assignment Collection Reference Request.
 */
public class BaseAppRoleAssignmentCollectionReferenceRequest extends BaseCollectionRequest<BaseAppRoleAssignmentCollectionResponse, IAppRoleAssignmentCollectionPage> implements IBaseAppRoleAssignmentCollectionReferenceRequest {

    /**
     * The request builder for this collection of AppRoleAssignment
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseAppRoleAssignmentCollectionReferenceRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseAppRoleAssignmentCollectionResponse.class, IAppRoleAssignmentCollectionPage.class);
    }

    public void post(final AppRoleAssignment newAppRoleAssignment, final ICallback<AppRoleAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/appRoleAssignments/" + newAppRoleAssignment.id);
        new AppRoleAssignmentWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newAppRoleAssignment, body, callback);
    }

    public AppRoleAssignment post(final AppRoleAssignment newAppRoleAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/appRoleAssignments/" + newAppRoleAssignment.id);
        return new AppRoleAssignmentWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest()
                .post(newAppRoleAssignment, body);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IAppRoleAssignmentCollectionReferenceRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AppRoleAssignmentCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IAppRoleAssignmentCollectionReferenceRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AppRoleAssignmentCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IAppRoleAssignmentCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AppRoleAssignmentCollectionReferenceRequest)this;
    }
}