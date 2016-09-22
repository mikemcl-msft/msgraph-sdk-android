// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Anonymous Ip Risk Event Collection Request Builder.
 */
public class AnonymousIpRiskEventCollectionRequestBuilder extends BaseAnonymousIpRiskEventCollectionRequestBuilder implements IAnonymousIpRiskEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of AnonymousIpRiskEvent
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public AnonymousIpRiskEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }
}
