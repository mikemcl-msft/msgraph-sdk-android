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
 * The interface for the Base Section Copy To Section Group Request Builder.
 */
public interface IBaseSectionCopyToSectionGroupRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISectionCopyToSectionGroupRequest
     *
     * @return The ISectionCopyToSectionGroupRequest instance
     */
    ISectionCopyToSectionGroupRequest buildRequest();

    /**
     * Creates the ISectionCopyToSectionGroupRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The ISectionCopyToSectionGroupRequest instance
     */
    ISectionCopyToSectionGroupRequest buildRequest(final List<Option> requestOptions);
}