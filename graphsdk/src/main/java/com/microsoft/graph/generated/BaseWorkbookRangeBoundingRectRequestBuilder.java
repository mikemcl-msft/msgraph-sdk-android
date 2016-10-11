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
 * The class for the Base Workbook Range Bounding Rect Request Builder.
 */
public class BaseWorkbookRangeBoundingRectRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBoundingRect
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeBoundingRectRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("anotherRange", anotherRange));
    }

    /**
     * Creates the IWorkbookRangeBoundingRectRequest
     *
     * @return The IWorkbookRangeBoundingRectRequest instance
     */
    public IWorkbookRangeBoundingRectRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeBoundingRectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeBoundingRectRequest instance
     */
    public IWorkbookRangeBoundingRectRequest buildRequest(final List<Option> requestOptions) {
        WorkbookRangeBoundingRectRequest request = new WorkbookRangeBoundingRectRequest(
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
