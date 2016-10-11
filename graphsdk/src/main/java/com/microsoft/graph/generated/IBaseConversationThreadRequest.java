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
 * The interface for the Base Conversation Thread Request.
 */
public interface IBaseConversationThreadRequest extends IHttpRequest {

    /**
     * Gets the ConversationThread from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<ConversationThread> callback);

    /**
     * Gets the ConversationThread from the service
     * @return The ConversationThread from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ConversationThread get() throws ClientException;

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
     * Patches this ConversationThread with a source
     * @param sourceConversationThread The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final ConversationThread sourceConversationThread, final ICallback<ConversationThread> callback);

    /**
     * Patches this ConversationThread with a source
     * @param sourceConversationThread The source object with updates
     * @return The updated ConversationThread
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ConversationThread patch(final ConversationThread sourceConversationThread) throws ClientException;

    /**
     * Posts a ConversationThread with a new object
     * @param newConversationThread The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final ConversationThread newConversationThread, final ICallback<ConversationThread> callback);

    /**
     * Posts a ConversationThread with a new object
     * @param newConversationThread The new object to create
     * @return The created ConversationThread
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    ConversationThread post(final ConversationThread newConversationThread) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseConversationThreadRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseConversationThreadRequest expand(final String value);

}
