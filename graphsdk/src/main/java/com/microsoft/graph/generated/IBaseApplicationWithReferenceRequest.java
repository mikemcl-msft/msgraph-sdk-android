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
 * The interface for the Base Application With Reference Request.
 */
public interface IBaseApplicationWithReferenceRequest extends IHttpRequest {

    void post(final Application newApplication, final IJsonBackedObject payload, final ICallback<Application> callback);

    Application post(final Application newApplication, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<Application> callback);

    Application get() throws ClientException;

    IBaseApplicationWithReferenceRequest select(final String value);

}
