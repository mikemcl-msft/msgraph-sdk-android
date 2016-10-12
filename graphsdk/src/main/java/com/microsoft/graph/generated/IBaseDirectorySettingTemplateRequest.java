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
 * The interface for the Base Directory Setting Template Request.
 */
public interface IBaseDirectorySettingTemplateRequest extends IHttpRequest {

    /**
     * Gets the DirectorySettingTemplate from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DirectorySettingTemplate> callback);

    /**
     * Gets the DirectorySettingTemplate from the service
     * @return The DirectorySettingTemplate from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectorySettingTemplate get() throws ClientException;

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
     * Patches this DirectorySettingTemplate with a source
     * @param sourceDirectorySettingTemplate The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DirectorySettingTemplate sourceDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback);

    /**
     * Patches this DirectorySettingTemplate with a source
     * @param sourceDirectorySettingTemplate The source object with updates
     * @return The updated DirectorySettingTemplate
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectorySettingTemplate patch(final DirectorySettingTemplate sourceDirectorySettingTemplate) throws ClientException;

    /**
     * Posts a DirectorySettingTemplate with a new object
     * @param newDirectorySettingTemplate The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DirectorySettingTemplate newDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback);

    /**
     * Posts a DirectorySettingTemplate with a new object
     * @param newDirectorySettingTemplate The new object to create
     * @return The created DirectorySettingTemplate
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DirectorySettingTemplate post(final DirectorySettingTemplate newDirectorySettingTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDirectorySettingTemplateRequest select(final String value);

}