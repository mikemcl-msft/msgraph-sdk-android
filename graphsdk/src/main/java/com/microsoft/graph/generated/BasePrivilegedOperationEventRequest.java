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
 * The class for the Base Privileged Operation Event Request.
 */
public class BasePrivilegedOperationEventRequest extends BaseRequest implements IBasePrivilegedOperationEventRequest {

    /**
     * The request for the PrivilegedOperationEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePrivilegedOperationEventRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PrivilegedOperationEvent from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedOperationEvent from the service
     * @return The PrivilegedOperationEvent from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedOperationEvent get() throws ClientException {
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
     * Patches this PrivilegedOperationEvent with a source
     * @param sourcePrivilegedOperationEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PrivilegedOperationEvent sourcePrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedOperationEvent);
    }

    /**
     * Patches this PrivilegedOperationEvent with a source
     * @param sourcePrivilegedOperationEvent The source object with updates
     * @return The updated PrivilegedOperationEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedOperationEvent patch(final PrivilegedOperationEvent sourcePrivilegedOperationEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     * @param newPrivilegedOperationEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PrivilegedOperationEvent newPrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.POST, callback, newPrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     * @param newPrivilegedOperationEvent The new object to create
     * @return The created PrivilegedOperationEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PrivilegedOperationEvent post(final PrivilegedOperationEvent newPrivilegedOperationEvent) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedOperationEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPrivilegedOperationEventRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PrivilegedOperationEventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPrivilegedOperationEventRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PrivilegedOperationEventRequest)this;
     }

}