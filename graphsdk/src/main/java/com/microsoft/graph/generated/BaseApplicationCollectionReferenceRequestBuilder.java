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
 * The class for the Base Application Collection Reference Request Builder.
 */
public class BaseApplicationCollectionReferenceRequestBuilder extends BaseRequestBuilder implements IBaseApplicationCollectionReferenceRequestBuilder {

    /**
     * The request builder for this collection of ConnectorGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseApplicationCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IApplicationCollectionReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IApplicationCollectionReferenceRequest buildRequest(final List<Option> requestOptions) {
        return new ApplicationCollectionReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
