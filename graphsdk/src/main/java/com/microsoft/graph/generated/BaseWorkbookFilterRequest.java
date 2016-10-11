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
 * The class for the Base Workbook Filter Request.
 */
public class BaseWorkbookFilterRequest extends BaseRequest implements IBaseWorkbookFilterRequest {

    /**
     * The request for the WorkbookFilter
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookFilterRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookFilter from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookFilter> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookFilter from the service
     * @return The WorkbookFilter from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFilter get() throws ClientException {
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
     * Patches this WorkbookFilter with a source
     * @param sourceWorkbookFilter The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookFilter sourceWorkbookFilter, final ICallback<WorkbookFilter> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookFilter);
    }

    /**
     * Patches this WorkbookFilter with a source
     * @param sourceWorkbookFilter The source object with updates
     * @return The updated WorkbookFilter
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFilter patch(final WorkbookFilter sourceWorkbookFilter) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookFilter);
    }

    /**
     * Creates a WorkbookFilter with a new object
     * @param newWorkbookFilter The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookFilter newWorkbookFilter, final ICallback<WorkbookFilter> callback) {
        send(HttpMethod.POST, callback, newWorkbookFilter);
    }

    /**
     * Creates a WorkbookFilter with a new object
     * @param newWorkbookFilter The new object to create
     * @return The created WorkbookFilter
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookFilter post(final WorkbookFilter newWorkbookFilter) throws ClientException {
        return send(HttpMethod.POST, newWorkbookFilter);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookFilterRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookFilterRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookFilterRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookFilterRequest)this;
     }

}
