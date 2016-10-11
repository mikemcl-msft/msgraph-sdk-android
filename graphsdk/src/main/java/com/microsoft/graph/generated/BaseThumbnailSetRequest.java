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
 * The class for the Base Thumbnail Set Request.
 */
public class BaseThumbnailSetRequest extends BaseRequest implements IBaseThumbnailSetRequest {

    /**
     * The request for the ThumbnailSet
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseThumbnailSetRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ThumbnailSet from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ThumbnailSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ThumbnailSet from the service
     * @return The ThumbnailSet from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ThumbnailSet get() throws ClientException {
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
     * Patches this ThumbnailSet with a source
     * @param sourceThumbnailSet The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ThumbnailSet sourceThumbnailSet, final ICallback<ThumbnailSet> callback) {
        send(HttpMethod.PATCH, callback, sourceThumbnailSet);
    }

    /**
     * Patches this ThumbnailSet with a source
     * @param sourceThumbnailSet The source object with updates
     * @return The updated ThumbnailSet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ThumbnailSet patch(final ThumbnailSet sourceThumbnailSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     * @param newThumbnailSet The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ThumbnailSet newThumbnailSet, final ICallback<ThumbnailSet> callback) {
        send(HttpMethod.POST, callback, newThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     * @param newThumbnailSet The new object to create
     * @return The created ThumbnailSet
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ThumbnailSet post(final ThumbnailSet newThumbnailSet) throws ClientException {
        return send(HttpMethod.POST, newThumbnailSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IThumbnailSetRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ThumbnailSetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IThumbnailSetRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ThumbnailSetRequest)this;
     }

}
