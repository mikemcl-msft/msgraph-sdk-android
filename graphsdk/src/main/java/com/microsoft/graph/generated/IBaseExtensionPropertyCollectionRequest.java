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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Extension Property Collection Request.
 */
public interface IBaseExtensionPropertyCollectionRequest {

    void get(final ICallback<IExtensionPropertyCollectionPage> callback);

    IExtensionPropertyCollectionPage get() throws ClientException;

    void post(final ExtensionProperty newExtensionProperty, final ICallback<ExtensionProperty> callback);

    ExtensionProperty post(final ExtensionProperty newExtensionProperty) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IExtensionPropertyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    IExtensionPropertyCollectionRequest top(final int value);

}
