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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Mail Tips.
 */
public class BaseMailTips implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    public BaseMailTips() {
        oDataType = "microsoft.graph.mailTips";
    }

    /**
     * The Email Address.
     */
    @SerializedName("emailAddress")
    @Expose
    public EmailAddress emailAddress;

    /**
     * The Automatic Replies.
     */
    @SerializedName("automaticReplies")
    @Expose
    public AutomaticRepliesMailTips automaticReplies;

    /**
     * The Mailbox Full.
     */
    @SerializedName("mailboxFull")
    @Expose
    public Boolean mailboxFull;

    /**
     * The Custom Mail Tip.
     */
    @SerializedName("customMailTip")
    @Expose
    public String customMailTip;

    /**
     * The External Member Count.
     */
    @SerializedName("externalMemberCount")
    @Expose
    public Integer externalMemberCount;

    /**
     * The Total Member Count.
     */
    @SerializedName("totalMemberCount")
    @Expose
    public Integer totalMemberCount;

    /**
     * The Delivery Restricted.
     */
    @SerializedName("deliveryRestricted")
    @Expose
    public Boolean deliveryRestricted;

    /**
     * The Is Moderated.
     */
    @SerializedName("isModerated")
    @Expose
    public Boolean isModerated;

    /**
     * The Recipient Scope.
     */
    @SerializedName("recipientScope")
    @Expose
    public RecipientScopeType recipientScope;

    /**
     * The Recipient Suggestions.
     */
    @SerializedName("recipientSuggestions")
    @Expose
    public List<Recipient> recipientSuggestions;

    /**
     * The Max Message Size.
     */
    @SerializedName("maxMessageSize")
    @Expose
    public Integer maxMessageSize;

    /**
     * The Error.
     */
    @SerializedName("error")
    @Expose
    public MailTipsError error;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
