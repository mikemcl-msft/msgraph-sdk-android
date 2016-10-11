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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Notebook Import Notebook Request.
 */
public interface IBaseNotebookImportNotebookRequest {

    /**
     * Creates the NotebookImportNotebook
     *
     * @param callback The callback to be called after success or failure.
     */
    void post(final ICallback<ImportStatusModel> callback);

    /**
     * Creates the NotebookImportNotebook
     *
     * @return The ImportStatusModel
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    ImportStatusModel post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    INotebookImportNotebookRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    INotebookImportNotebookRequest expand(final String value);

}
