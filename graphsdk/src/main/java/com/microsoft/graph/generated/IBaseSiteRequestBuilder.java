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
 * The interface for the Base Site Request Builder.
 */
public interface IBaseSiteRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    ISiteRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    ISiteRequest buildRequest(final List<Option> requestOptions);

    /**
     * Gets the request builder for Drive.
     */
    IDriveRequestBuilder getDrive();

    IDriveCollectionRequestBuilder getDrives();

    IDriveRequestBuilder getDrives(final String id);

    IBaseItemCollectionRequestBuilder getItems();

    IBaseItemRequestBuilder getItems(final String id);

    ISiteCollectionRequestBuilder getSites();

    ISiteRequestBuilder getSites(final String id);

}
