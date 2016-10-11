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
 * The Enum Risk Event Status.
*/
public enum RiskEventStatus
{
    /**
    * active
    */
    active,
    /**
    * remediated
    */
    remediated,
    /**
    * dismissed As Fixed
    */
    dismissedAsFixed,
    /**
    * dismissed As False Positive
    */
    dismissedAsFalsePositive,
    /**
    * dismissed As Ignore
    */
    dismissedAsIgnore,
    /**
    * login Blocked
    */
    loginBlocked,
    /**
    * closed Mfa Auto
    */
    closedMfaAuto,
    /**
    * closed Multiple Reasons
    */
    closedMultipleReasons,
    /**
    * For RiskEventStatus values that were not expected from the service
    */
    unexpectedValue
}
