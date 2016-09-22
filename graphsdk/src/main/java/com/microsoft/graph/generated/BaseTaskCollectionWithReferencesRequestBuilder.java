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
 * The class for the Base Task Collection With References Request Builder.
 */
public class BaseTaskCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IBaseTaskCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of Bucket
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseTaskCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public ITaskCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITaskCollectionWithReferencesRequest buildRequest(final List<Option> options) {
        return new TaskCollectionWithReferencesRequest(getRequestUrl(), getClient(), options);
    }

    public ITaskWithReferenceRequestBuilder byId(final String id) {
        return new TaskWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public ITaskCollectionReferenceRequestBuilder references(){
        return new TaskCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
