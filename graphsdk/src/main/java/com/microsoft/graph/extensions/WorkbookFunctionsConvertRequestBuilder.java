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
 * The class for the Workbook Functions Convert Request Builder.
 */
public class WorkbookFunctionsConvertRequestBuilder extends BaseWorkbookFunctionsConvertRequestBuilder implements IWorkbookFunctionsConvertRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsConvert
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsConvertRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement fromUnit, final com.google.gson.JsonElement toUnit) {
        super(requestUrl, client, requestOptions, number, fromUnit, toUnit);
    }
}
