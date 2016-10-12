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
 * The interface for the Base Privileged Role Assignment Request.
 */
public interface IBasePrivilegedRoleAssignmentRequest extends IHttpRequest {

    /**
     * Gets the PrivilegedRoleAssignment from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<PrivilegedRoleAssignment> callback);

    /**
     * Gets the PrivilegedRoleAssignment from the service
     * @return The PrivilegedRoleAssignment from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PrivilegedRoleAssignment get() throws ClientException;

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
     * Patches this PrivilegedRoleAssignment with a source
     * @param sourcePrivilegedRoleAssignment The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment, final ICallback<PrivilegedRoleAssignment> callback);

    /**
     * Patches this PrivilegedRoleAssignment with a source
     * @param sourcePrivilegedRoleAssignment The source object with updates
     * @return The updated PrivilegedRoleAssignment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PrivilegedRoleAssignment patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment) throws ClientException;

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     * @param newPrivilegedRoleAssignment The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final ICallback<PrivilegedRoleAssignment> callback);

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     * @param newPrivilegedRoleAssignment The new object to create
     * @return The created PrivilegedRoleAssignment
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PrivilegedRoleAssignment post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBasePrivilegedRoleAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBasePrivilegedRoleAssignmentRequest expand(final String value);

}