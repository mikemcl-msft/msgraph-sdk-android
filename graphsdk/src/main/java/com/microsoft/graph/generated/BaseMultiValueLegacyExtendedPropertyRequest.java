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
 * The class for the Base Multi Value Legacy Extended Property Request.
 */
public class BaseMultiValueLegacyExtendedPropertyRequest extends BaseRequest implements IBaseMultiValueLegacyExtendedPropertyRequest {

    /**
     * The request for the MultiValueLegacyExtendedProperty
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseMultiValueLegacyExtendedPropertyRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     * @return The MultiValueLegacyExtendedProperty from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MultiValueLegacyExtendedProperty get() throws ClientException {
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
     * Patches this MultiValueLegacyExtendedProperty with a source
     * @param sourceMultiValueLegacyExtendedProperty The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty, final ICallback<MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.PATCH, callback, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     * @param sourceMultiValueLegacyExtendedProperty The source object with updates
     * @return The updated MultiValueLegacyExtendedProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MultiValueLegacyExtendedProperty patch(final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PATCH, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     * @param newMultiValueLegacyExtendedProperty The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, final ICallback<MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.POST, callback, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     * @param newMultiValueLegacyExtendedProperty The new object to create
     * @return The created MultiValueLegacyExtendedProperty
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public MultiValueLegacyExtendedProperty post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.POST, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IMultiValueLegacyExtendedPropertyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MultiValueLegacyExtendedPropertyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IMultiValueLegacyExtendedPropertyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MultiValueLegacyExtendedPropertyRequest)this;
     }

}
