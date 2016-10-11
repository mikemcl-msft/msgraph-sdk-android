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
 * The class for the Base Message Move Request Builder.
 */
public class BaseMessageMoveRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this MessageMove
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseMessageMoveRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String destinationId) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the IMessageMoveRequest
     *
     * @return The IMessageMoveRequest instance
     */
    public IMessageMoveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageMoveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IMessageMoveRequest instance
     */
    public IMessageMoveRequest buildRequest(final List<Option> requestOptions) {
        MessageMoveRequest request = new MessageMoveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationId")) {
            request.mBody.destinationId = getParameter("destinationId");
        }

        return request;
    }
}
