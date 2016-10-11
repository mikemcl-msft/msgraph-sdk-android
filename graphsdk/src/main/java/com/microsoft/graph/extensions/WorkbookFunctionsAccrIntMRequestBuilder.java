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
 * The class for the Workbook Functions Accr Int MRequest Builder.
 */
public class WorkbookFunctionsAccrIntMRequestBuilder extends BaseWorkbookFunctionsAccrIntMRequestBuilder implements IWorkbookFunctionsAccrIntMRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAccrIntM
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsAccrIntMRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement issue, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement par, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions, issue, settlement, rate, par, basis);
    }
}
