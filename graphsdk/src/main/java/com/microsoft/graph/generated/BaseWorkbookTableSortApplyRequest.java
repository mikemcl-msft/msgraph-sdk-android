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
 * The class for the Base Workbook Table Sort Apply Request.
 */
public class BaseWorkbookTableSortApplyRequest extends BaseRequest implements IBaseWorkbookTableSortApplyRequest {
    protected final WorkbookTableSortApplyBody mBody;

    /**
     * The request for this WorkbookTableSortApply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableSortApplyRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        mBody = new WorkbookTableSortApplyBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookTableSortApplyRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookTableSortApplyRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookTableSortApplyRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (WorkbookTableSortApplyRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookTableSortApplyRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookTableSortApplyRequest)this;
    }

}
