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
 * The class for the Section Copy To Section Group Request Builder.
 */
public class SectionCopyToSectionGroupRequestBuilder extends BaseSectionCopyToSectionGroupRequestBuilder implements ISectionCopyToSectionGroupRequestBuilder {

    /**
     * The request builder for this SectionCopyToSectionGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public SectionCopyToSectionGroupRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String id, final String groupId, final String renameAs) {
        super(requestUrl, client, requestOptions, id, groupId, renameAs);
    }
}
