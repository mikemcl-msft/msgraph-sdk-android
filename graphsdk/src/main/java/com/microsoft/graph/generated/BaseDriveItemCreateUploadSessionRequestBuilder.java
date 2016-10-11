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
 * The class for the Base Drive Item Create Upload Session Request Builder.
 */
public class BaseDriveItemCreateUploadSessionRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DriveItemCreateUploadSession
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemCreateUploadSessionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final DriveItemUploadableProperties item) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("item", item);
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest
     *
     * @return The IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDriveItemCreateUploadSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IDriveItemCreateUploadSessionRequest instance
     */
    public IDriveItemCreateUploadSessionRequest buildRequest(final List<Option> requestOptions) {
        DriveItemCreateUploadSessionRequest request = new DriveItemCreateUploadSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("item")) {
            request.mBody.item = getParameter("item");
        }

        return request;
    }
}
