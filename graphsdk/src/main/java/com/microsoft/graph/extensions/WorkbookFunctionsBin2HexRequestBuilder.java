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
 * The class for the Workbook Functions Bin2Hex Request Builder.
 */
public class WorkbookFunctionsBin2HexRequestBuilder extends BaseWorkbookFunctionsBin2HexRequestBuilder implements IWorkbookFunctionsBin2HexRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBin2Hex
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsBin2HexRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions, number, places);
    }
}
