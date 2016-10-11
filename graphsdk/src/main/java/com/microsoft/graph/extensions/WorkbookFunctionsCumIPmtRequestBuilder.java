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
 * The class for the Workbook Functions Cum IPmt Request Builder.
 */
public class WorkbookFunctionsCumIPmtRequestBuilder extends BaseWorkbookFunctionsCumIPmtRequestBuilder implements IWorkbookFunctionsCumIPmtRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCumIPmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsCumIPmtRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement startPeriod, final com.google.gson.JsonElement endPeriod, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions, rate, nper, pv, startPeriod, endPeriod, type);
    }
}
