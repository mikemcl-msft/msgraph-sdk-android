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
 * The class for the Base Workbook Range Offset Range Request Builder.
 */
public class BaseWorkbookRangeOffsetRangeRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeOffsetRange
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeOffsetRangeRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Integer rowOffset, final Integer columnOffset) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("rowOffset", rowOffset));
        mFunctionOptions.add(new FunctionOption("columnOffset", columnOffset));
    }

    /**
     * Creates the IWorkbookRangeOffsetRangeRequest
     *
     * @return The IWorkbookRangeOffsetRangeRequest instance
     */
    public IWorkbookRangeOffsetRangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeOffsetRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeOffsetRangeRequest instance
     */
    public IWorkbookRangeOffsetRangeRequest buildRequest(final List<Option> requestOptions) {
        WorkbookRangeOffsetRangeRequest request = new WorkbookRangeOffsetRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
