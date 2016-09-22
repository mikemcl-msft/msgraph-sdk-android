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
 * The class for the Base User Configuration Request.
 */
public class BaseUserConfigurationRequest extends BaseRequest implements IBaseUserConfigurationRequest {

    /**
     * The request for the UserConfiguration
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseUserConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the UserConfiguration from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<UserConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserConfiguration from the service
     * @return The UserConfiguration from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public UserConfiguration get() throws ClientException {
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
     * Patches this UserConfiguration with a source
     * @param sourceUserConfiguration The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final UserConfiguration sourceUserConfiguration, final ICallback<UserConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceUserConfiguration);
    }

    /**
     * Patches this UserConfiguration with a source
     * @param sourceUserConfiguration The source object with updates
     * @return The updated UserConfiguration
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public UserConfiguration patch(final UserConfiguration sourceUserConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserConfiguration);
    }

    /**
     * Creates a UserConfiguration with a new object
     * @param newUserConfiguration The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final UserConfiguration newUserConfiguration, final ICallback<UserConfiguration> callback) {
        send(HttpMethod.POST, callback, newUserConfiguration);
    }

    /**
     * Creates a UserConfiguration with a new object
     * @param newUserConfiguration The new object to create
     * @return The created UserConfiguration
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public UserConfiguration post(final UserConfiguration newUserConfiguration) throws ClientException {
        return send(HttpMethod.POST, newUserConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IUserConfigurationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (UserConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IUserConfigurationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (UserConfigurationRequest)this;
     }

}
