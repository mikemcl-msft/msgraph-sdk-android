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
 * The class for the Base Contact Request.
 */
public class BaseContactRequest extends BaseRequest implements IBaseContactRequest {

    /**
     * The request for the Contact
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseContactRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the Contact from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Contact> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Contact from the service
     * @return The Contact from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contact get() throws ClientException {
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
     * Patches this Contact with a source
     * @param sourceContact The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Contact sourceContact, final ICallback<Contact> callback) {
        send(HttpMethod.PATCH, callback, sourceContact);
    }

    /**
     * Patches this Contact with a source
     * @param sourceContact The source object with updates
     * @return The updated Contact
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contact patch(final Contact sourceContact) throws ClientException {
        return send(HttpMethod.PATCH, sourceContact);
    }

    /**
     * Creates a Contact with a new object
     * @param newContact The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Contact newContact, final ICallback<Contact> callback) {
        send(HttpMethod.POST, callback, newContact);
    }

    /**
     * Creates a Contact with a new object
     * @param newContact The new object to create
     * @return The created Contact
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Contact post(final Contact newContact) throws ClientException {
        return send(HttpMethod.POST, newContact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IContactRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ContactRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IContactRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ContactRequest)this;
     }

}
