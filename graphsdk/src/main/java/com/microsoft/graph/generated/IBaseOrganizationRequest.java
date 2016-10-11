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
 * The interface for the Base Organization Request.
 */
public interface IBaseOrganizationRequest extends IHttpRequest {

    /**
     * Gets the Organization from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Organization> callback);

    /**
     * Gets the Organization from the service
     * @return The Organization from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Organization get() throws ClientException;

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
     * Patches this Organization with a source
     * @param sourceOrganization The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Organization sourceOrganization, final ICallback<Organization> callback);

    /**
     * Patches this Organization with a source
     * @param sourceOrganization The source object with updates
     * @return The updated Organization
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Organization patch(final Organization sourceOrganization) throws ClientException;

    /**
     * Posts a Organization with a new object
     * @param newOrganization The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Organization newOrganization, final ICallback<Organization> callback);

    /**
     * Posts a Organization with a new object
     * @param newOrganization The new object to create
     * @return The created Organization
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Organization post(final Organization newOrganization) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOrganizationRequest select(final String value);

}
