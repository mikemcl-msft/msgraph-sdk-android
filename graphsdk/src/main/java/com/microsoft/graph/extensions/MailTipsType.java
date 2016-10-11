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
 * The Enum Mail Tips Type.
*/
public enum MailTipsType
{
    /**
    * automatic Replies
    */
    automaticReplies,
    /**
    * mailbox Full Status
    */
    mailboxFullStatus,
    /**
    * custom Mail Tip
    */
    customMailTip,
    /**
    * external Member Count
    */
    externalMemberCount,
    /**
    * total Member Count
    */
    totalMemberCount,
    /**
    * max Message Size
    */
    maxMessageSize,
    /**
    * delivery Restriction
    */
    deliveryRestriction,
    /**
    * moderation Status
    */
    moderationStatus,
    /**
    * recipient Scope
    */
    recipientScope,
    /**
    * recipient Suggestions
    */
    recipientSuggestions,
    /**
    * For MailTipsType values that were not expected from the service
    */
    unexpectedValue
}
