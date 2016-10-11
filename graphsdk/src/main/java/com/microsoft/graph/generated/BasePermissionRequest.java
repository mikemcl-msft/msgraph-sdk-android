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
 * The class for the Base Permission Request.
 */
public class BasePermissionRequest extends BaseRequest implements IBasePermissionRequest {

    /**
     * The request for the Permission
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePermissionRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Permission from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Permission> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Permission from the service
     * @return The Permission from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Permission get() throws ClientException {
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
     * Patches this Permission with a source
     * @param sourcePermission The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Permission sourcePermission, final ICallback<Permission> callback) {
        send(HttpMethod.PATCH, callback, sourcePermission);
    }

    /**
     * Patches this Permission with a source
     * @param sourcePermission The source object with updates
     * @return The updated Permission
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Permission patch(final Permission sourcePermission) throws ClientException {
        return send(HttpMethod.PATCH, sourcePermission);
    }

    /**
     * Creates a Permission with a new object
     * @param newPermission The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Permission newPermission, final ICallback<Permission> callback) {
        send(HttpMethod.POST, callback, newPermission);
    }

    /**
     * Creates a Permission with a new object
     * @param newPermission The new object to create
     * @return The created Permission
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Permission post(final Permission newPermission) throws ClientException {
        return send(HttpMethod.POST, newPermission);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPermissionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PermissionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPermissionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PermissionRequest)this;
     }

}
