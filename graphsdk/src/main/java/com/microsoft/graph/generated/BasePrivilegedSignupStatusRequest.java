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
 * The class for the Base Privileged Signup Status Request.
 */
public class BasePrivilegedSignupStatusRequest extends BaseRequest implements IBasePrivilegedSignupStatusRequest {

    /**
     * The request for the PrivilegedSignupStatus
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePrivilegedSignupStatusRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PrivilegedSignupStatus from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedSignupStatus from the service
     * @return The PrivilegedSignupStatus from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedSignupStatus get() throws ClientException {
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
     * Patches this PrivilegedSignupStatus with a source
     * @param sourcePrivilegedSignupStatus The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PrivilegedSignupStatus sourcePrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedSignupStatus);
    }

    /**
     * Patches this PrivilegedSignupStatus with a source
     * @param sourcePrivilegedSignupStatus The source object with updates
     * @return The updated PrivilegedSignupStatus
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedSignupStatus patch(final PrivilegedSignupStatus sourcePrivilegedSignupStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     * @param newPrivilegedSignupStatus The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PrivilegedSignupStatus newPrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        send(HttpMethod.POST, callback, newPrivilegedSignupStatus);
    }

    /**
     * Creates a PrivilegedSignupStatus with a new object
     * @param newPrivilegedSignupStatus The new object to create
     * @return The created PrivilegedSignupStatus
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedSignupStatus post(final PrivilegedSignupStatus newPrivilegedSignupStatus) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedSignupStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPrivilegedSignupStatusRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PrivilegedSignupStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPrivilegedSignupStatusRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PrivilegedSignupStatusRequest)this;
     }

}