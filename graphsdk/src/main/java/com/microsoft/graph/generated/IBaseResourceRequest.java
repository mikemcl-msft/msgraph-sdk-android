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
 * The interface for the Base Resource Request.
 */
public interface IBaseResourceRequest extends IHttpRequest {

    /**
     * Gets the Resource from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Resource> callback);

    /**
     * Gets the Resource from the service
     * @return The Resource from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Resource get() throws ClientException;

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
     * Patches this Resource with a source
     * @param sourceResource The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Resource sourceResource, final ICallback<Resource> callback);

    /**
     * Patches this Resource with a source
     * @param sourceResource The source object with updates
     * @return The updated Resource
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Resource patch(final Resource sourceResource) throws ClientException;

    /**
     * Posts a Resource with a new object
     * @param newResource The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Resource newResource, final ICallback<Resource> callback);

    /**
     * Posts a Resource with a new object
     * @param newResource The new object to create
     * @return The created Resource
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Resource post(final Resource newResource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseResourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseResourceRequest expand(final String value);

}
