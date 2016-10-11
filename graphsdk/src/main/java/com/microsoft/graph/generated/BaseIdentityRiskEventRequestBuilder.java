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
 * The class for the Base Identity Risk Event Request Builder.
 */
public class BaseIdentityRiskEventRequestBuilder extends BaseRequestBuilder implements IBaseIdentityRiskEventRequestBuilder {

    /**
     * The request builder for the IdentityRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseIdentityRiskEventRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IIdentityRiskEventRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IIdentityRiskEventRequest buildRequest(final List<Option> requestOptions) {
        return new IdentityRiskEventRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ILocatedRiskEventRequestBuilder locatedRiskEvent() {
        return new LocatedRiskEventRequestBuilder(getRequestUrlWithAdditionalSegment("locatedRiskEvent"), getClient(), null);
    }

    public ILeakedCredentialsRiskEventRequestBuilder leakedCredentialsRiskEvent() {
        return new LeakedCredentialsRiskEventRequestBuilder(getRequestUrlWithAdditionalSegment("leakedCredentialsRiskEvent"), getClient(), null);
    }

    /**
     * Gets the request builder for User.
     */
    public IUserWithReferenceRequestBuilder getImpactedUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("impactedUser"), getClient(), null);
    }
}
