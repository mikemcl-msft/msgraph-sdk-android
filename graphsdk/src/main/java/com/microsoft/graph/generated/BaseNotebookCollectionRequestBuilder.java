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
 * The class for the Base Notebook Collection Request Builder.
 */
public class BaseNotebookCollectionRequestBuilder extends BaseRequestBuilder implements IBaseNotebookCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notes
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseNotebookCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public INotebookCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public INotebookCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new NotebookCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public INotebookRequestBuilder byId(final String id) {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public INotebookImportNotebookRequestBuilder getImportNotebook() {
        return new NotebookImportNotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ImportNotebook"), getClient(), null);
    }
}