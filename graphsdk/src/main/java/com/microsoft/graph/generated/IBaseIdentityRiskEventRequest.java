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
 * The interface for the Base Identity Risk Event Request.
 */
public interface IBaseIdentityRiskEventRequest extends IHttpRequest {

    /**
     * Gets the IdentityRiskEvent from the service
     * @param callback The callback to be called after success or failure.
     */
    void getIdentityRiskEvent(final ICallback<IdentityRiskEvent> callback);

    /**
     * Gets the IdentityRiskEvent from the service
     * @return The IdentityRiskEvent from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    IdentityRiskEvent getIdentityRiskEvent() throws ClientException;

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
     * Patches this IdentityRiskEvent with a source
     * @param sourceIdentityRiskEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final IdentityRiskEvent sourceIdentityRiskEvent, final ICallback<IdentityRiskEvent> callback);

    /**
     * Patches this IdentityRiskEvent with a source
     * @param sourceIdentityRiskEvent The source object with updates
     * @return The updated IdentityRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    IdentityRiskEvent patch(final IdentityRiskEvent sourceIdentityRiskEvent) throws ClientException;

    /**
     * Posts a IdentityRiskEvent with a new object
     * @param newIdentityRiskEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final IdentityRiskEvent newIdentityRiskEvent, final ICallback<IdentityRiskEvent> callback);

    /**
     * Posts a IdentityRiskEvent with a new object
     * @param newIdentityRiskEvent The new object to create
     * @return The created IdentityRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    IdentityRiskEvent post(final IdentityRiskEvent newIdentityRiskEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseIdentityRiskEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseIdentityRiskEventRequest expand(final String value);

}
