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
 * The interface for the Base Workbook Chart Font Request.
 */
public interface IBaseWorkbookChartFontRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartFont from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartFont> callback);

    /**
     * Gets the WorkbookChartFont from the service
     * @return The WorkbookChartFont from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFont get() throws ClientException;

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
     * Patches this WorkbookChartFont with a source
     * @param sourceWorkbookChartFont The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartFont sourceWorkbookChartFont, final ICallback<WorkbookChartFont> callback);

    /**
     * Patches this WorkbookChartFont with a source
     * @param sourceWorkbookChartFont The source object with updates
     * @return The updated WorkbookChartFont
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFont patch(final WorkbookChartFont sourceWorkbookChartFont) throws ClientException;

    /**
     * Posts a WorkbookChartFont with a new object
     * @param newWorkbookChartFont The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartFont newWorkbookChartFont, final ICallback<WorkbookChartFont> callback);

    /**
     * Posts a WorkbookChartFont with a new object
     * @param newWorkbookChartFont The new object to create
     * @return The created WorkbookChartFont
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartFont post(final WorkbookChartFont newWorkbookChartFont) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartFontRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartFontRequest expand(final String value);

}
