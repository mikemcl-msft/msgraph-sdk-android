// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Range Bounding Rect Request Builder.
 */
public class WorkbookRangeBoundingRectRequestBuilder extends BaseWorkbookRangeBoundingRectRequestBuilder implements IWorkbookRangeBoundingRectRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBoundingRect
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookRangeBoundingRectRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String anotherRange) {
        super(requestUrl, client, requestOptions, anotherRange);
    }
}
