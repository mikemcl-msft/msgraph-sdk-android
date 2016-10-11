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
 * The interface for the Base Subscription Request.
 */
public interface IBaseSubscriptionRequest extends IHttpRequest {

    /**
     * Gets the Subscription from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Subscription> callback);

    /**
     * Gets the Subscription from the service
     * @return The Subscription from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Subscription get() throws ClientException;

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
     * Patches this Subscription with a source
     * @param sourceSubscription The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Subscription sourceSubscription, final ICallback<Subscription> callback);

    /**
     * Patches this Subscription with a source
     * @param sourceSubscription The source object with updates
     * @return The updated Subscription
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Subscription patch(final Subscription sourceSubscription) throws ClientException;

    /**
     * Posts a Subscription with a new object
     * @param newSubscription The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Subscription newSubscription, final ICallback<Subscription> callback);

    /**
     * Posts a Subscription with a new object
     * @param newSubscription The new object to create
     * @return The created Subscription
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Subscription post(final Subscription newSubscription) throws ClientException;

}
