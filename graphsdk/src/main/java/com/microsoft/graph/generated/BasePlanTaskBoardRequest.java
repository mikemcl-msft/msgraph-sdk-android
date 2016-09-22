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
 * The class for the Base Plan Task Board Request.
 */
public class BasePlanTaskBoardRequest extends BaseRequest implements IBasePlanTaskBoardRequest {

    /**
     * The request for the PlanTaskBoard
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePlanTaskBoardRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the PlanTaskBoard from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PlanTaskBoard> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlanTaskBoard from the service
     * @return The PlanTaskBoard from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlanTaskBoard get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlanTaskBoard with a source
     * @param sourcePlanTaskBoard The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PlanTaskBoard sourcePlanTaskBoard, final ICallback<PlanTaskBoard> callback) {
        send(HttpMethod.PATCH, callback, sourcePlanTaskBoard);
    }

    /**
     * Patches this PlanTaskBoard with a source
     * @param sourcePlanTaskBoard The source object with updates
     * @return The updated PlanTaskBoard
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlanTaskBoard patch(final PlanTaskBoard sourcePlanTaskBoard) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlanTaskBoard);
    }

    /**
     * Creates a PlanTaskBoard with a new object
     * @param newPlanTaskBoard The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PlanTaskBoard newPlanTaskBoard, final ICallback<PlanTaskBoard> callback) {
        send(HttpMethod.POST, callback, newPlanTaskBoard);
    }

    /**
     * Creates a PlanTaskBoard with a new object
     * @param newPlanTaskBoard The new object to create
     * @return The created PlanTaskBoard
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlanTaskBoard post(final PlanTaskBoard newPlanTaskBoard) throws ClientException {
        return send(HttpMethod.POST, newPlanTaskBoard);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPlanTaskBoardRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlanTaskBoardRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPlanTaskBoardRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlanTaskBoardRequest)this;
     }

}
