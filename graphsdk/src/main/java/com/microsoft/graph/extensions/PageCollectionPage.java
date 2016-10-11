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
 * The class for the Page Collection Page.
 */
public class PageCollectionPage extends BasePageCollectionPage implements IPageCollectionPage {

    /**
     * A collection page for Section.
     *
     * @param response The serialized BasePageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PageCollectionPage(final BasePageCollectionResponse response, final IPageCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
