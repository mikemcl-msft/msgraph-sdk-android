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
 * The class for the Base Drive Item Create Link Request.
 */
public class BaseDriveItemCreateLinkRequest extends BaseRequest implements IBaseDriveItemCreateLinkRequest {
    protected final DriveItemCreateLinkBody mBody;

    /**
     * The request for this DriveItemCreateLink
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemCreateLinkRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Permission.class);
        mBody = new DriveItemCreateLinkBody();
    }

    public void post(final ICallback<Permission> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public Permission post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveItemCreateLinkRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (DriveItemCreateLinkRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveItemCreateLinkRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (DriveItemCreateLinkRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveItemCreateLinkRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DriveItemCreateLinkRequest)this;
    }

}
