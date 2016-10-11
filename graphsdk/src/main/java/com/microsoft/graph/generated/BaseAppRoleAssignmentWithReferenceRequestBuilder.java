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
 * The class for the Base App Role Assignment With Reference Request Builder.
 */
public class BaseAppRoleAssignmentWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseAppRoleAssignmentWithReferenceRequestBuilder {

    /**
     * The request builder for the AppRoleAssignment
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseAppRoleAssignmentWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IAppRoleAssignmentWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IAppRoleAssignmentWithReferenceRequest buildRequest(final List<Option> requestOptions) {
        return new AppRoleAssignmentWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAppRoleAssignmentReferenceRequestBuilder reference(){
        return new AppRoleAssignmentReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
