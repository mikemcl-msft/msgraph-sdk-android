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
 * The interface for the Base Workbook Table Row Item At Request.
 */
public interface IBaseWorkbookTableRowItemAtRequest {

    /**
     * Patches the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(WorkbookTableRow srcWorkbookTableRow, final ICallback<WorkbookTableRow> callback);

    /**
     * Patches the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow with which to PATCH
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookTableRow patch(WorkbookTableRow srcWorkbookTableRow) throws ClientException;

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(WorkbookTableRow srcWorkbookTableRow, final ICallback<WorkbookTableRow> callback);

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow to PUT
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookTableRow put(WorkbookTableRow srcWorkbookTableRow) throws ClientException;
    /**
     * Gets the WorkbookTableRow
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookTableRow> callback);

    /**
     * Gets the WorkbookTableRow
     *
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookTableRow get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookTableRowItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookTableRowItemAtRequest expand(final String value);

}
