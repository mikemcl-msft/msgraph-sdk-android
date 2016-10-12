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
 * The class for the Base Extension Property Collection Request Builder.
 */
public class BaseExtensionPropertyCollectionRequestBuilder extends BaseRequestBuilder implements IBaseExtensionPropertyCollectionRequestBuilder {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseExtensionPropertyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IExtensionPropertyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IExtensionPropertyCollectionRequest buildRequest(final List<Option> requestOptions) {
        return new ExtensionPropertyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IExtensionPropertyRequestBuilder byId(final String id) {
        return new ExtensionPropertyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}