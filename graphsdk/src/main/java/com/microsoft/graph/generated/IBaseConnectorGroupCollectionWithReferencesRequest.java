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
 * The interface for the Base Connector Group Collection With References Request.
 */
public interface IBaseConnectorGroupCollectionWithReferencesRequest {

    void get(final ICallback<IConnectorGroupCollectionWithReferencesPage> callback);

    IConnectorGroupCollectionWithReferencesPage get() throws ClientException;

    IConnectorGroupCollectionWithReferencesRequest expand(final String value);
    
    IConnectorGroupCollectionWithReferencesRequest select(final String value);

    IConnectorGroupCollectionWithReferencesRequest top(final int value);

}
