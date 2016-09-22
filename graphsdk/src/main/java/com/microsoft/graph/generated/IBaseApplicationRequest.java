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
 * The interface for the Base Application Request.
 */
public interface IBaseApplicationRequest extends IHttpRequest {

    /**
     * Gets the Application from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Application> callback);

    /**
     * Gets the Application from the service
     * @return The Application from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Application get() throws ClientException;

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
     * Patches this Application with a source
     * @param sourceApplication The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Application sourceApplication, final ICallback<Application> callback);

    /**
     * Patches this Application with a source
     * @param sourceApplication The source object with updates
     * @return The updated Application
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Application patch(final Application sourceApplication) throws ClientException;

    /**
     * Posts a Application with a new object
     * @param newApplication The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Application newApplication, final ICallback<Application> callback);

    /**
     * Posts a Application with a new object
     * @param newApplication The new object to create
     * @return The created Application
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Application post(final Application newApplication) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseApplicationRequest select(final String value);

}
