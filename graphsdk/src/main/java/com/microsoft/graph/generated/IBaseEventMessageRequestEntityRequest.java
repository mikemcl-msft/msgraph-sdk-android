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
 * The interface for the Base Event Message Request Entity Request.
 */
public interface IBaseEventMessageRequestEntityRequest extends IHttpRequest {

    /**
     * Gets the EventMessageRequestEntity from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<EventMessageRequestEntity> callback);

    /**
     * Gets the EventMessageRequestEntity from the service
     * @return The EventMessageRequestEntity from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessageRequestEntity get() throws ClientException;

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
     * Patches this EventMessageRequestEntity with a source
     * @param sourceEventMessageRequestEntity The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final EventMessageRequestEntity sourceEventMessageRequestEntity, final ICallback<EventMessageRequestEntity> callback);

    /**
     * Patches this EventMessageRequestEntity with a source
     * @param sourceEventMessageRequestEntity The source object with updates
     * @return The updated EventMessageRequestEntity
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessageRequestEntity patch(final EventMessageRequestEntity sourceEventMessageRequestEntity) throws ClientException;

    /**
     * Posts a EventMessageRequestEntity with a new object
     * @param newEventMessageRequestEntity The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final EventMessageRequestEntity newEventMessageRequestEntity, final ICallback<EventMessageRequestEntity> callback);

    /**
     * Posts a EventMessageRequestEntity with a new object
     * @param newEventMessageRequestEntity The new object to create
     * @return The created EventMessageRequestEntity
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    EventMessageRequestEntity post(final EventMessageRequestEntity newEventMessageRequestEntity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseEventMessageRequestEntityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseEventMessageRequestEntityRequest expand(final String value);

}
