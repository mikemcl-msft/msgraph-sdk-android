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
 * The interface for the Base Contact Folder Request.
 */
public interface IBaseContactFolderRequest extends IHttpRequest {

    /**
     * Gets the ContactFolder from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ContactFolder> callback);

    /**
     * Gets the ContactFolder from the service
     * @return The ContactFolder from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ContactFolder get() throws ClientException;

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
     * Patches this ContactFolder with a source
     * @param sourceContactFolder The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ContactFolder sourceContactFolder, final ICallback<ContactFolder> callback);

    /**
     * Patches this ContactFolder with a source
     * @param sourceContactFolder The source object with updates
     * @return The updated ContactFolder
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ContactFolder patch(final ContactFolder sourceContactFolder) throws ClientException;

    /**
     * Posts a ContactFolder with a new object
     * @param newContactFolder The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ContactFolder newContactFolder, final ICallback<ContactFolder> callback);

    /**
     * Posts a ContactFolder with a new object
     * @param newContactFolder The new object to create
     * @return The created ContactFolder
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ContactFolder post(final ContactFolder newContactFolder) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseContactFolderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseContactFolderRequest expand(final String value);

}
