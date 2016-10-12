// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Extension Property Collection Page.
 */
public class BaseExtensionPropertyCollectionPage extends BaseCollectionPage<ExtensionProperty, IExtensionPropertyCollectionRequestBuilder> implements IBaseExtensionPropertyCollectionPage {

    /**
     * A collection page for ExtensionProperty.
     *
     * @param response The serialized BaseExtensionPropertyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseExtensionPropertyCollectionPage(final BaseExtensionPropertyCollectionResponse response, final IExtensionPropertyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}