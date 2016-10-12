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
 * The interface for the Base Connector Request.
 */
public interface IBaseConnectorRequest extends IHttpRequest {

    /**
     * Gets the Connector from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Connector> callback);

    /**
     * Gets the Connector from the service
     * @return The Connector from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Connector get() throws ClientException;

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
     * Patches this Connector with a source
     * @param sourceConnector The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Connector sourceConnector, final ICallback<Connector> callback);

    /**
     * Patches this Connector with a source
     * @param sourceConnector The source object with updates
     * @return The updated Connector
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Connector patch(final Connector sourceConnector) throws ClientException;

    /**
     * Posts a Connector with a new object
     * @param newConnector The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Connector newConnector, final ICallback<Connector> callback);

    /**
     * Posts a Connector with a new object
     * @param newConnector The new object to create
     * @return The created Connector
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Connector post(final Connector newConnector) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseConnectorRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseConnectorRequest expand(final String value);

}