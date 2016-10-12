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
 * The class for the Base Plan With Reference Request.
 */
public class BasePlanWithReferenceRequest extends BaseRequest implements IBasePlanWithReferenceRequest {

    /**
     * The request for the Plan
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlanWithReferenceRequest(String requestUrl, IBaseClient client, List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Plan.class);
    }

    public void post(final Plan newPlan, final IJsonBackedObject payload, final ICallback<Plan> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Plan post(final Plan newPlan, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newPlan;
        }
        return null;
    }

    public void get(final ICallback<Plan> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Plan get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IPlanWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IPlanWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IPlanWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (PlanWithReferenceRequest)this;
    }
}