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
 * The class for the Base Entity Reference Request.
 */
public class BaseEntityReferenceRequest extends BaseRequest implements IBaseEntityReferenceRequest {

    /**
     * The request for the Entity
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseEntityReferenceRequest(String requestUrl, IBaseClient client, List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, Entity.class);
    }

    public void delete(final ICallback<Entity> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public Entity delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IEntityReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (EntityReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IEntityReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (EntityReferenceRequest)this;
    }
}