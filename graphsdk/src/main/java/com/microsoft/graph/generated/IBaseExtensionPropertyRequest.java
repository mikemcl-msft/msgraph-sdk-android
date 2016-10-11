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
 * The interface for the Base Extension Property Request.
 */
public interface IBaseExtensionPropertyRequest extends IHttpRequest {

    /**
     * Gets the ExtensionProperty from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ExtensionProperty> callback);

    /**
     * Gets the ExtensionProperty from the service
     * @return The ExtensionProperty from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ExtensionProperty get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExtensionProperty with a source
     * @param sourceExtensionProperty The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ExtensionProperty sourceExtensionProperty, final ICallback<ExtensionProperty> callback);

    /**
     * Patches this ExtensionProperty with a source
     * @param sourceExtensionProperty The source object with updates
     * @return The updated ExtensionProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ExtensionProperty patch(final ExtensionProperty sourceExtensionProperty) throws ClientException;

    /**
     * Posts a ExtensionProperty with a new object
     * @param newExtensionProperty The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ExtensionProperty newExtensionProperty, final ICallback<ExtensionProperty> callback);

    /**
     * Posts a ExtensionProperty with a new object
     * @param newExtensionProperty The new object to create
     * @return The created ExtensionProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ExtensionProperty post(final ExtensionProperty newExtensionProperty) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseExtensionPropertyRequest select(final String value);

}
