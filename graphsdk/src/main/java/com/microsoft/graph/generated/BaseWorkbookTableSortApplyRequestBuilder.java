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
 * The class for the Base Workbook Table Sort Apply Request Builder.
 */
public class BaseWorkbookTableSortApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookTableSortApply
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableSortApplyRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final List<WorkbookSortField> fields, final Boolean matchCase, final String method) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("fields", fields);
        mBodyParams.put("matchCase", matchCase);
        mBodyParams.put("method", method);
    }

    /**
     * Creates the IWorkbookTableSortApplyRequest
     *
     * @return The IWorkbookTableSortApplyRequest instance
     */
    public IWorkbookTableSortApplyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableSortApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookTableSortApplyRequest instance
     */
    public IWorkbookTableSortApplyRequest buildRequest(final List<Option> requestOptions) {
        WorkbookTableSortApplyRequest request = new WorkbookTableSortApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("fields")) {
            request.mBody.fields = getParameter("fields");
        }

        if (hasParameter("matchCase")) {
            request.mBody.matchCase = getParameter("matchCase");
        }

        if (hasParameter("method")) {
            request.mBody.method = getParameter("method");
        }

        return request;
    }
}
