// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Policy Collection Page.
 */
public class PolicyCollectionPage extends BasePolicyCollectionPage implements IPolicyCollectionPage {

    /**
     * A collection page for Policy.
     *
     * @param response The serialized BasePolicyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PolicyCollectionPage(final BasePolicyCollectionResponse response, final IPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
