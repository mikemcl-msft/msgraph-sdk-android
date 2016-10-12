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
 * The class for the Base Task Details Request.
 */
public class BaseTaskDetailsRequest extends BaseRequest implements IBaseTaskDetailsRequest {

    /**
     * The request for the TaskDetails
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseTaskDetailsRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the TaskDetails from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<TaskDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TaskDetails from the service
     * @return The TaskDetails from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public TaskDetails get() throws ClientException {
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
     * Patches this TaskDetails with a source
     * @param sourceTaskDetails The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final TaskDetails sourceTaskDetails, final ICallback<TaskDetails> callback) {
        send(HttpMethod.PATCH, callback, sourceTaskDetails);
    }

    /**
     * Patches this TaskDetails with a source
     * @param sourceTaskDetails The source object with updates
     * @return The updated TaskDetails
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public TaskDetails patch(final TaskDetails sourceTaskDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourceTaskDetails);
    }

    /**
     * Creates a TaskDetails with a new object
     * @param newTaskDetails The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final TaskDetails newTaskDetails, final ICallback<TaskDetails> callback) {
        send(HttpMethod.POST, callback, newTaskDetails);
    }

    /**
     * Creates a TaskDetails with a new object
     * @param newTaskDetails The new object to create
     * @return The created TaskDetails
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public TaskDetails post(final TaskDetails newTaskDetails) throws ClientException {
        return send(HttpMethod.POST, newTaskDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public ITaskDetailsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (TaskDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public ITaskDetailsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (TaskDetailsRequest)this;
     }

}