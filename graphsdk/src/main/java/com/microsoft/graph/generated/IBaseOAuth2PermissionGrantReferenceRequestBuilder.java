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
 * The interface for the Base OAuth2Permission Grant Reference Request Builder.
 */
public interface IBaseOAuth2PermissionGrantReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     */
    IOAuth2PermissionGrantReferenceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IOAuth2PermissionGrantReferenceRequest buildRequest(final List<Option> requestOptions);
}
