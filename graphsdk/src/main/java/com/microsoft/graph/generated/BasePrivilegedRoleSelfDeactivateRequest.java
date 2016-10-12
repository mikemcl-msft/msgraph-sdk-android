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
 * The class for the Base Privileged Role Self Deactivate Request.
 */
public class BasePrivilegedRoleSelfDeactivateRequest extends BaseRequest implements IBasePrivilegedRoleSelfDeactivateRequest {

    /**
     * The request for this PrivilegedRoleSelfDeactivate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePrivilegedRoleSelfDeactivateRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignment.class);
    }

    /**
     * Creates the PrivilegedRoleSelfDeactivate
     *
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ICallback<PrivilegedRoleAssignment> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the PrivilegedRoleSelfDeactivate
     *
     * @return The PrivilegedRoleAssignment
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public PrivilegedRoleAssignment post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IPrivilegedRoleSelfDeactivateRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (PrivilegedRoleSelfDeactivateRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IPrivilegedRoleSelfDeactivateRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (PrivilegedRoleSelfDeactivateRequest)this;
    }

}