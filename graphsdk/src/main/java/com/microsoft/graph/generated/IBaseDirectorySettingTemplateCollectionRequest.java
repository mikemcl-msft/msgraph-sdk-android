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
 * The interface for the Base Directory Setting Template Collection Request.
 */
public interface IBaseDirectorySettingTemplateCollectionRequest {

    void get(final ICallback<IDirectorySettingTemplateCollectionPage> callback);

    IDirectorySettingTemplateCollectionPage get() throws ClientException;

    void post(final DirectorySettingTemplate newDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback);

    DirectorySettingTemplate post(final DirectorySettingTemplate newDirectorySettingTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IDirectorySettingTemplateCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    IDirectorySettingTemplateCollectionRequest top(final int value);

}