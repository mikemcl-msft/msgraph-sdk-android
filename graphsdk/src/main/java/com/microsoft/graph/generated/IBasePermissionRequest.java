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
 * The interface for the Base Permission Request.
 */
public interface IBasePermissionRequest extends IHttpRequest {

    /**
     * Gets the Permission from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Permission> callback);

    /**
     * Gets the Permission from the service
     * @return The Permission from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Permission get() throws ClientException;

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
     * Patches this Permission with a source
     * @param sourcePermission The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Permission sourcePermission, final ICallback<Permission> callback);

    /**
     * Patches this Permission with a source
     * @param sourcePermission The source object with updates
     * @return The updated Permission
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Permission patch(final Permission sourcePermission) throws ClientException;

    /**
     * Posts a Permission with a new object
     * @param newPermission The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Permission newPermission, final ICallback<Permission> callback);

    /**
     * Posts a Permission with a new object
     * @param newPermission The new object to create
     * @return The created Permission
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Permission post(final Permission newPermission) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBasePermissionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBasePermissionRequest expand(final String value);

}
