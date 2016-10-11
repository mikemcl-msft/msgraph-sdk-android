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
 * The class for the Base Plan Collection With References Request Builder.
 */
public class BasePlanCollectionWithReferencesRequestBuilder extends BaseRequestBuilder implements IBasePlanCollectionWithReferencesRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlanCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPlanCollectionWithReferencesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPlanCollectionWithReferencesRequest buildRequest(final List<Option> requestOptions) {
        return new PlanCollectionWithReferencesRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlanWithReferenceRequestBuilder byId(final String id) {
        return new PlanWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IPlanCollectionReferenceRequestBuilder references(){
        return new PlanCollectionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }
}
