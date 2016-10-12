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
 * The class for the Base Connector Group With Reference Request.
 */
public class BaseConnectorGroupWithReferenceRequest extends BaseRequest implements IBaseConnectorGroupWithReferenceRequest {

    /**
     * The request for the ConnectorGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseConnectorGroupWithReferenceRequest(String requestUrl, IBaseClient client, List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConnectorGroup.class);
    }

    public void post(final ConnectorGroup newConnectorGroup, final IJsonBackedObject payload, final ICallback<ConnectorGroup> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ConnectorGroup post(final ConnectorGroup newConnectorGroup, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newConnectorGroup;
        }
        return null;
    }

    public void get(final ICallback<ConnectorGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ConnectorGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IConnectorGroupWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IConnectorGroupWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IConnectorGroupWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ConnectorGroupWithReferenceRequest)this;
    }
}