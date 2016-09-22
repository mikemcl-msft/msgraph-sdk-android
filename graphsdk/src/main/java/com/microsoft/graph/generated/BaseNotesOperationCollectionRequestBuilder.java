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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notes Operation Collection Request Builder.
 */
public class BaseNotesOperationCollectionRequestBuilder extends BaseRequestBuilder implements IBaseNotesOperationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Notes
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseNotesOperationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public INotesOperationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public INotesOperationCollectionRequest buildRequest(final List<Option> options) {
        return new NotesOperationCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public INotesOperationRequestBuilder byId(final String id) {
        return new NotesOperationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
