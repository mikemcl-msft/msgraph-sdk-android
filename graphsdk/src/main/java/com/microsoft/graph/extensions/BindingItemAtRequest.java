// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.generated.BaseBindingItemAtRequest;
import com.microsoft.graph.options.Option;

import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Binding Item At Request.
 */
public class BindingItemAtRequest extends BaseBindingItemAtRequest implements IBindingItemAtRequest {

    /**
     * The request for this BindingItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BindingItemAtRequest(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, 0);
    }
}
