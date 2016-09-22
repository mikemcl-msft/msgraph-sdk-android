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
 * The interface for the Base Anonymous Ip Risk Event Request.
 */
public interface IBaseAnonymousIpRiskEventRequest extends IHttpRequest {

    /**
     * Gets the AnonymousIpRiskEvent from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<AnonymousIpRiskEvent> callback);

    /**
     * Gets the AnonymousIpRiskEvent from the service
     * @return The AnonymousIpRiskEvent from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    AnonymousIpRiskEvent get() throws ClientException;

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
     * Patches this AnonymousIpRiskEvent with a source
     * @param sourceAnonymousIpRiskEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final AnonymousIpRiskEvent sourceAnonymousIpRiskEvent, final ICallback<AnonymousIpRiskEvent> callback);

    /**
     * Patches this AnonymousIpRiskEvent with a source
     * @param sourceAnonymousIpRiskEvent The source object with updates
     * @return The updated AnonymousIpRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    AnonymousIpRiskEvent patch(final AnonymousIpRiskEvent sourceAnonymousIpRiskEvent) throws ClientException;

    /**
     * Posts a AnonymousIpRiskEvent with a new object
     * @param newAnonymousIpRiskEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final AnonymousIpRiskEvent newAnonymousIpRiskEvent, final ICallback<AnonymousIpRiskEvent> callback);

    /**
     * Posts a AnonymousIpRiskEvent with a new object
     * @param newAnonymousIpRiskEvent The new object to create
     * @return The created AnonymousIpRiskEvent
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    AnonymousIpRiskEvent post(final AnonymousIpRiskEvent newAnonymousIpRiskEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseAnonymousIpRiskEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseAnonymousIpRiskEventRequest expand(final String value);

}
