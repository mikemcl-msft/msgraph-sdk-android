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
 * The class for the Base Event Message Request Entity Request Builder.
 */
public class BaseEventMessageRequestEntityRequestBuilder extends BaseRequestBuilder implements IBaseEventMessageRequestEntityRequestBuilder {

    /**
     * The request builder for the EventMessageRequestEntity
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventMessageRequestEntityRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IEventMessageRequestEntityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IEventMessageRequestEntityRequest buildRequest(final List<Option> options) {
        return new EventMessageRequestEntityRequest(getRequestUrl(), getClient(), options);
    }

}
