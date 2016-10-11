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
 * The class for the Base Workbook Chart Axes Request.
 */
public class BaseWorkbookChartAxesRequest extends BaseRequest implements IBaseWorkbookChartAxesRequest {

    /**
     * The request for the WorkbookChartAxes
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartAxesRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartAxes from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartAxes> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxes from the service
     * @return The WorkbookChartAxes from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAxes get() throws ClientException {
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
     * Patches this WorkbookChartAxes with a source
     * @param sourceWorkbookChartAxes The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartAxes sourceWorkbookChartAxes, final ICallback<WorkbookChartAxes> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxes);
    }

    /**
     * Patches this WorkbookChartAxes with a source
     * @param sourceWorkbookChartAxes The source object with updates
     * @return The updated WorkbookChartAxes
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAxes patch(final WorkbookChartAxes sourceWorkbookChartAxes) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     * @param newWorkbookChartAxes The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartAxes newWorkbookChartAxes, final ICallback<WorkbookChartAxes> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxes);
    }

    /**
     * Creates a WorkbookChartAxes with a new object
     * @param newWorkbookChartAxes The new object to create
     * @return The created WorkbookChartAxes
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartAxes post(final WorkbookChartAxes newWorkbookChartAxes) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxes);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartAxesRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartAxesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartAxesRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartAxesRequest)this;
     }

}
