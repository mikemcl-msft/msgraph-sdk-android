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
 * The class for the Base Workbook Function Result Request.
 */
public class BaseWorkbookFunctionResultRequest extends BaseRequest implements IBaseWorkbookFunctionResultRequest {

    /**
     * The request for the WorkbookFunctionResult
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookFunctionResultRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFunctionResult from the service
     * @return The WorkbookFunctionResult from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFunctionResult get() throws ClientException {
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
     * Patches this WorkbookFunctionResult with a source
     * @param sourceWorkbookFunctionResult The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookFunctionResult sourceWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFunctionResult);
    }

    /**
     * Patches this WorkbookFunctionResult with a source
     * @param sourceWorkbookFunctionResult The source object with updates
     * @return The updated WorkbookFunctionResult
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFunctionResult patch(final WorkbookFunctionResult sourceWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     * @param newWorkbookFunctionResult The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookFunctionResult newWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, newWorkbookFunctionResult);
    }

    /**
     * Creates a WorkbookFunctionResult with a new object
     * @param newWorkbookFunctionResult The new object to create
     * @return The created WorkbookFunctionResult
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFunctionResult post(final WorkbookFunctionResult newWorkbookFunctionResult) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFunctionResult);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookFunctionResultRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookFunctionResultRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookFunctionResultRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookFunctionResultRequest)this;
     }

}
