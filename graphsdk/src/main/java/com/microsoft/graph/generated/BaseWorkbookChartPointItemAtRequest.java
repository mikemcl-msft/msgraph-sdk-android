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
 * The class for the Base Workbook Chart Point Item At Request.
 */
public class BaseWorkbookChartPointItemAtRequest extends BaseRequest implements IBaseWorkbookChartPointItemAtRequest {

    /**
     * The request for this WorkbookChartPointItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartPointItemAtRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartPoint.class);
    }

    /**
     * Patches the WorkbookChartPointItemAt
     * @param srcWorkbookChartPoint The WorkbookChartPoint with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookChartPoint srcWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookChartPoint);
    }

    /**
     * Patches the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint The WorkbookChartPoint with which to PATCH
     * @return The WorkbookChartPoint
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookChartPoint patch(WorkbookChartPoint srcWorkbookChartPoint) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookChartPoint);
    }

    /**
     * Puts the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint The WorkbookChartPoint to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookChartPoint srcWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChartPoint);
    }

    /**
     * Puts the WorkbookChartPointItemAt
     *
     * @param srcWorkbookChartPoint The WorkbookChartPoint to PUT
     * @return The WorkbookChartPoint
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookChartPoint put(WorkbookChartPoint srcWorkbookChartPoint) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookChartPoint);
    }
    /**
     * Gets the WorkbookChartPoint
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartPoint> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartPoint
     *
     * @return The WorkbookChartPoint
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookChartPoint get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookChartPointItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookChartPointItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookChartPointItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookChartPointItemAtRequest)this;
    }

}
