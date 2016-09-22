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

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Unfamiliar Location Risk Event Collection Page.
 */
public class UnfamiliarLocationRiskEventCollectionPage extends BaseUnfamiliarLocationRiskEventCollectionPage implements IUnfamiliarLocationRiskEventCollectionPage {

    /**
     * A collection page for UnfamiliarLocationRiskEvent.
     *
     * @param response The serialized BaseUnfamiliarLocationRiskEventCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UnfamiliarLocationRiskEventCollectionPage(final BaseUnfamiliarLocationRiskEventCollectionResponse response, final IUnfamiliarLocationRiskEventCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
