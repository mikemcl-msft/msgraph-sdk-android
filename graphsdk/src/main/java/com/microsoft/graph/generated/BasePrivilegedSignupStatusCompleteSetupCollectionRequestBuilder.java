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
 * The class for the Base Privileged Signup Status Complete Setup Collection Request Builder.
 */
public class BasePrivilegedSignupStatusCompleteSetupCollectionRequestBuilder extends BaseActionRequestBuilder implements IBasePrivilegedSignupStatusCompleteSetupCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrivilegedSignupStatus
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePrivilegedSignupStatusCompleteSetupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final TenantSetupInfo tenantSetupInfo) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("tenantSetupInfo", tenantSetupInfo);
      }

    public IPrivilegedSignupStatusCompleteSetupCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrivilegedSignupStatusCompleteSetupCollectionRequest buildRequest(final List<Option> requestOptions) {
        PrivilegedSignupStatusCompleteSetupCollectionRequest request = new PrivilegedSignupStatusCompleteSetupCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("tenantSetupInfo")) {
            request.mBody.tenantSetupInfo = getParameter("tenantSetupInfo");
        }
  
        return request;
    }
}
