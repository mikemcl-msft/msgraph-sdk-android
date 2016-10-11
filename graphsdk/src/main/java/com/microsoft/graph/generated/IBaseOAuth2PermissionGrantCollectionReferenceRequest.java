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
 * The interface for the Base OAuth2Permission Grant Collection Reference Request.
 */
public interface IBaseOAuth2PermissionGrantCollectionReferenceRequest {

    void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<OAuth2PermissionGrant> callback);

    OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException;

    IOAuth2PermissionGrantCollectionReferenceRequest select(final String value);

    IOAuth2PermissionGrantCollectionReferenceRequest top(final int value);

}
