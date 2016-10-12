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
 * The class for the Base Task Collection Reference Request Builder.
 */
public class BaseTaskCollectionReferenceRequestBuilder extends BaseRequestBuilder implements IBaseTaskCollectionReferenceRequestBuilder {

    /**
     * The request builder for this collection of Bucket
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseTaskCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITaskCollectionReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITaskCollectionReferenceRequest buildRequest(final List<Option> requestOptions) {
        return new TaskCollectionReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}