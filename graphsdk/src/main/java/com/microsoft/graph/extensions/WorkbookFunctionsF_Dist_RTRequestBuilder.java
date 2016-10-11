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
 * The class for the Workbook Functions F_Dist_RTRequest Builder.
 */
public class WorkbookFunctionsF_Dist_RTRequestBuilder extends BaseWorkbookFunctionsF_Dist_RTRequestBuilder implements IWorkbookFunctionsF_Dist_RTRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Dist_RT
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsF_Dist_RTRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2) {
        super(requestUrl, client, requestOptions, x, degFreedom1, degFreedom2);
    }
}
