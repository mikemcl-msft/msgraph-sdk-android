// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Workbook Chart Point Collection Request.
 */
public class BaseWorkbookChartPointCollectionRequest extends BaseCollectionRequest<BaseWorkbookChartPointCollectionResponse, IWorkbookChartPointCollectionPage> implements IBaseWorkbookChartPointCollectionRequest {

    /**
     * The request builder for this collection of WorkbookChartPoint
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartPointCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookChartPointCollectionResponse.class, IWorkbookChartPointCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookChartPointCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookChartPointCollectionPage get() throws ClientException {
        final BaseWorkbookChartPointCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookChartPointRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookChartPoint, callback);
    }

    public WorkbookChartPoint post(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookChartPointRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookChartPoint);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookChartPointCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookChartPointCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookChartPointCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookChartPointCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookChartPointCollectionRequest)this;
    }

    public IWorkbookChartPointCollectionPage buildFromResponse(final BaseWorkbookChartPointCollectionResponse response) {
        final IWorkbookChartPointCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookChartPointCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookChartPointCollectionPage page = new WorkbookChartPointCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
