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
 * The class for the Workbook Functions Vlookup Request Builder.
 */
public class WorkbookFunctionsVlookupRequestBuilder extends BaseWorkbookFunctionsVlookupRequestBuilder implements IWorkbookFunctionsVlookupRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVlookup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsVlookupRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement colIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions, lookupValue, tableArray, colIndexNum, rangeLookup);
    }
}
