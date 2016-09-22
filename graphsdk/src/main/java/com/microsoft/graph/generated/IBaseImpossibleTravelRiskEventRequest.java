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
 * The interface for the Base Impossible Travel Risk Event Request.
 */
public interface IBaseImpossibleTravelRiskEventRequest extends IHttpRequest {

    /**
     * Gets the ImpossibleTravelRiskEvent from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ImpossibleTravelRiskEvent> callback);

    /**
     * Gets the ImpossibleTravelRiskEvent from the service
     * @return The ImpossibleTravelRiskEvent from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ImpossibleTravelRiskEvent get() throws ClientException;

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
     * Patches this ImpossibleTravelRiskEvent with a source
     * @param sourceImpossibleTravelRiskEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ImpossibleTravelRiskEvent sourceImpossibleTravelRiskEvent, final ICallback<ImpossibleTravelRiskEvent> callback);

    /**
     * Patches this ImpossibleTravelRiskEvent with a source
     * @param sourceImpossibleTravelRiskEvent The source object with updates
     * @return The updated ImpossibleTravelRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ImpossibleTravelRiskEvent patch(final ImpossibleTravelRiskEvent sourceImpossibleTravelRiskEvent) throws ClientException;

    /**
     * Posts a ImpossibleTravelRiskEvent with a new object
     * @param newImpossibleTravelRiskEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ImpossibleTravelRiskEvent newImpossibleTravelRiskEvent, final ICallback<ImpossibleTravelRiskEvent> callback);

    /**
     * Posts a ImpossibleTravelRiskEvent with a new object
     * @param newImpossibleTravelRiskEvent The new object to create
     * @return The created ImpossibleTravelRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ImpossibleTravelRiskEvent post(final ImpossibleTravelRiskEvent newImpossibleTravelRiskEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseImpossibleTravelRiskEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseImpossibleTravelRiskEventRequest expand(final String value);

}
