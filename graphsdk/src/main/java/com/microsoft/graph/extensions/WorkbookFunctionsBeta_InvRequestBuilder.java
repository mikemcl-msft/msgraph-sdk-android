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
 * The class for the Workbook Functions Beta_Inv Request Builder.
 */
public class WorkbookFunctionsBeta_InvRequestBuilder extends BaseWorkbookFunctionsBeta_InvRequestBuilder implements IWorkbookFunctionsBeta_InvRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBeta_Inv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsBeta_InvRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta, final com.google.gson.JsonElement a, final com.google.gson.JsonElement b) {
        super(requestUrl, client, requestOptions, probability, alpha, beta, a, b);
    }
}
