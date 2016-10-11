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
 * The interface for the Base Profile Photo Request.
 */
public interface IBaseProfilePhotoRequest extends IHttpRequest {

    /**
     * Gets the ProfilePhoto from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ProfilePhoto> callback);

    /**
     * Gets the ProfilePhoto from the service
     * @return The ProfilePhoto from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ProfilePhoto get() throws ClientException;

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
     * Patches this ProfilePhoto with a source
     * @param sourceProfilePhoto The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ProfilePhoto sourceProfilePhoto, final ICallback<ProfilePhoto> callback);

    /**
     * Patches this ProfilePhoto with a source
     * @param sourceProfilePhoto The source object with updates
     * @return The updated ProfilePhoto
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ProfilePhoto patch(final ProfilePhoto sourceProfilePhoto) throws ClientException;

    /**
     * Posts a ProfilePhoto with a new object
     * @param newProfilePhoto The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ProfilePhoto newProfilePhoto, final ICallback<ProfilePhoto> callback);

    /**
     * Posts a ProfilePhoto with a new object
     * @param newProfilePhoto The new object to create
     * @return The created ProfilePhoto
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ProfilePhoto post(final ProfilePhoto newProfilePhoto) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseProfilePhotoRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseProfilePhotoRequest expand(final String value);

}
