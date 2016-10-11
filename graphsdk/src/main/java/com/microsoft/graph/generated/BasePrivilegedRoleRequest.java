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
 * The class for the Base Privileged Role Request.
 */
public class BasePrivilegedRoleRequest extends BaseRequest implements IBasePrivilegedRoleRequest {

    /**
     * The request for the PrivilegedRole
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePrivilegedRoleRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PrivilegedRole from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PrivilegedRole> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedRole from the service
     * @return The PrivilegedRole from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PrivilegedRole with a source
     * @param sourcePrivilegedRole The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PrivilegedRole sourcePrivilegedRole, final ICallback<PrivilegedRole> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedRole);
    }

    /**
     * Patches this PrivilegedRole with a source
     * @param sourcePrivilegedRole The source object with updates
     * @return The updated PrivilegedRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedRole patch(final PrivilegedRole sourcePrivilegedRole) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedRole);
    }

    /**
     * Creates a PrivilegedRole with a new object
     * @param newPrivilegedRole The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PrivilegedRole newPrivilegedRole, final ICallback<PrivilegedRole> callback) {
        send(HttpMethod.POST, callback, newPrivilegedRole);
    }

    /**
     * Creates a PrivilegedRole with a new object
     * @param newPrivilegedRole The new object to create
     * @return The created PrivilegedRole
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedRole post(final PrivilegedRole newPrivilegedRole) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPrivilegedRoleRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PrivilegedRoleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPrivilegedRoleRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PrivilegedRoleRequest)this;
     }

}
