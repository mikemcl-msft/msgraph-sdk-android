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
 * The class for the Base OAuth2Permission Grant With Reference Request Builder.
 */
public class BaseOAuth2PermissionGrantWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseOAuth2PermissionGrantWithReferenceRequestBuilder {

    /**
     * The request builder for the OAuth2PermissionGrant
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseOAuth2PermissionGrantWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IOAuth2PermissionGrantWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IOAuth2PermissionGrantWithReferenceRequest buildRequest(final List<Option> options) {
        return new OAuth2PermissionGrantWithReferenceRequest(getRequestUrl(), getClient(), options);
    }

    public IOAuth2PermissionGrantReferenceRequestBuilder reference(){
        return new OAuth2PermissionGrantReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
