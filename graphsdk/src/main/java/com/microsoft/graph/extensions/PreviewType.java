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

/**
 * The Enum Preview Type.
*/
public enum PreviewType
{
    /**
    * automatic
    */
    automatic,
    /**
    * no Preview
    */
    noPreview,
    /**
    * checklist
    */
    checklist,
    /**
    * description
    */
    description,
    /**
    * reference
    */
    reference,
    /**
    * For PreviewType values that were not expected from the service
    */
    unexpectedValue
}