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
 * The interface for the Base Unfamiliar Location Risk Event Request.
 */
public interface IBaseUnfamiliarLocationRiskEventRequest extends IHttpRequest {

    /**
     * Gets the UnfamiliarLocationRiskEvent from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<UnfamiliarLocationRiskEvent> callback);

    /**
     * Gets the UnfamiliarLocationRiskEvent from the service
     * @return The UnfamiliarLocationRiskEvent from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    UnfamiliarLocationRiskEvent get() throws ClientException;

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
     * Patches this UnfamiliarLocationRiskEvent with a source
     * @param sourceUnfamiliarLocationRiskEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final UnfamiliarLocationRiskEvent sourceUnfamiliarLocationRiskEvent, final ICallback<UnfamiliarLocationRiskEvent> callback);

    /**
     * Patches this UnfamiliarLocationRiskEvent with a source
     * @param sourceUnfamiliarLocationRiskEvent The source object with updates
     * @return The updated UnfamiliarLocationRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    UnfamiliarLocationRiskEvent patch(final UnfamiliarLocationRiskEvent sourceUnfamiliarLocationRiskEvent) throws ClientException;

    /**
     * Posts a UnfamiliarLocationRiskEvent with a new object
     * @param newUnfamiliarLocationRiskEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final UnfamiliarLocationRiskEvent newUnfamiliarLocationRiskEvent, final ICallback<UnfamiliarLocationRiskEvent> callback);

    /**
     * Posts a UnfamiliarLocationRiskEvent with a new object
     * @param newUnfamiliarLocationRiskEvent The new object to create
     * @return The created UnfamiliarLocationRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    UnfamiliarLocationRiskEvent post(final UnfamiliarLocationRiskEvent newUnfamiliarLocationRiskEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseUnfamiliarLocationRiskEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseUnfamiliarLocationRiskEventRequest expand(final String value);

}
