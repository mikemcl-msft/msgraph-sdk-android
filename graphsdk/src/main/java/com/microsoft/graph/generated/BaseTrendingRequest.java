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
 * The class for the Base Trending Request.
 */
public class BaseTrendingRequest extends BaseRequest implements IBaseTrendingRequest {

    /**
     * The request for the Trending
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseTrendingRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the Trending from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Trending> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Trending from the service
     * @return The Trending from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Trending get() throws ClientException {
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
     * Patches this Trending with a source
     * @param sourceTrending The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Trending sourceTrending, final ICallback<Trending> callback) {
        send(HttpMethod.PATCH, callback, sourceTrending);
    }

    /**
     * Patches this Trending with a source
     * @param sourceTrending The source object with updates
     * @return The updated Trending
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Trending patch(final Trending sourceTrending) throws ClientException {
        return send(HttpMethod.PATCH, sourceTrending);
    }

    /**
     * Creates a Trending with a new object
     * @param newTrending The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Trending newTrending, final ICallback<Trending> callback) {
        send(HttpMethod.POST, callback, newTrending);
    }

    /**
     * Creates a Trending with a new object
     * @param newTrending The new object to create
     * @return The created Trending
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Trending post(final Trending newTrending) throws ClientException {
        return send(HttpMethod.POST, newTrending);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public ITrendingRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (TrendingRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public ITrendingRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (TrendingRequest)this;
     }

}
