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
 * The class for the Workbook Functions Floor_Precise Request Builder.
 */
public class WorkbookFunctionsFloor_PreciseRequestBuilder extends BaseWorkbookFunctionsFloor_PreciseRequestBuilder implements IWorkbookFunctionsFloor_PreciseRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFloor_Precise
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsFloor_PreciseRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions, number, significance);
    }
}
