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
 * The class for the Base User Invalidate All Refresh Tokens Request.
 */
public class BaseUserInvalidateAllRefreshTokensRequest extends BaseRequest implements IBaseUserInvalidateAllRefreshTokensRequest {

    /**
     * The request for this UserInvalidateAllRefreshTokens
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserInvalidateAllRefreshTokensRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Boolean.class);
    }

    /**
     * Creates the UserInvalidateAllRefreshTokens
     *
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ICallback<Boolean> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the UserInvalidateAllRefreshTokens
     *
     * @return The Boolean
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public Boolean post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IUserInvalidateAllRefreshTokensRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (UserInvalidateAllRefreshTokensRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IUserInvalidateAllRefreshTokensRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (UserInvalidateAllRefreshTokensRequest)this;
    }

}