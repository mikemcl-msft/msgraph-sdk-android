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
 * The class for the Base Privileged Role Self Activate Request Builder.
 */
public class BasePrivilegedRoleSelfActivateRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this PrivilegedRoleSelfActivate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePrivilegedRoleSelfActivateRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String reason, final String duration, final String ticketNumber, final String ticketSystem) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("reason", reason);
        mBodyParams.put("duration", duration);
        mBodyParams.put("ticketNumber", ticketNumber);
        mBodyParams.put("ticketSystem", ticketSystem);
    }

    /**
     * Creates the IPrivilegedRoleSelfActivateRequest
     *
     * @return The IPrivilegedRoleSelfActivateRequest instance
     */
    public IPrivilegedRoleSelfActivateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPrivilegedRoleSelfActivateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IPrivilegedRoleSelfActivateRequest instance
     */
    public IPrivilegedRoleSelfActivateRequest buildRequest(final List<Option> requestOptions) {
        PrivilegedRoleSelfActivateRequest request = new PrivilegedRoleSelfActivateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("reason")) {
            request.mBody.reason = getParameter("reason");
        }

        if (hasParameter("duration")) {
            request.mBody.duration = getParameter("duration");
        }

        if (hasParameter("ticketNumber")) {
            request.mBody.ticketNumber = getParameter("ticketNumber");
        }

        if (hasParameter("ticketSystem")) {
            request.mBody.ticketSystem = getParameter("ticketSystem");
        }

        return request;
    }
}