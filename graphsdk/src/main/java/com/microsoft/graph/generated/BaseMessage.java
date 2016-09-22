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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Message.
 */
public class BaseMessage extends OutlookItem implements IJsonBackedObject {


    public BaseMessage() {
        oDataType = "microsoft.graph.message";
    }

    /**
     * The Received Date Time.
     */
    @SerializedName("receivedDateTime")
    public java.util.Calendar receivedDateTime;

    /**
     * The Sent Date Time.
     */
    @SerializedName("sentDateTime")
    public java.util.Calendar sentDateTime;

    /**
     * The Has Attachments.
     */
    @SerializedName("hasAttachments")
    public Boolean hasAttachments;

    /**
     * The Internet Message Id.
     */
    @SerializedName("internetMessageId")
    public String internetMessageId;

    /**
     * The Subject.
     */
    @SerializedName("subject")
    public String subject;

    /**
     * The Body.
     */
    @SerializedName("body")
    public ItemBody body;

    /**
     * The Body Preview.
     */
    @SerializedName("bodyPreview")
    public String bodyPreview;

    /**
     * The Importance.
     */
    @SerializedName("importance")
    public Importance importance;

    /**
     * The Parent Folder Id.
     */
    @SerializedName("parentFolderId")
    public String parentFolderId;

    /**
     * The Sender.
     */
    @SerializedName("sender")
    public Recipient sender;

    /**
     * The From.
     */
    @SerializedName("from")
    public Recipient from;

    /**
     * The To Recipients.
     */
    @SerializedName("toRecipients")
    public List<Recipient> toRecipients;

    /**
     * The Cc Recipients.
     */
    @SerializedName("ccRecipients")
    public List<Recipient> ccRecipients;

    /**
     * The Bcc Recipients.
     */
    @SerializedName("bccRecipients")
    public List<Recipient> bccRecipients;

    /**
     * The Reply To.
     */
    @SerializedName("replyTo")
    public List<Recipient> replyTo;

    /**
     * The Conversation Id.
     */
    @SerializedName("conversationId")
    public String conversationId;

    /**
     * The Conversation Index.
     */
    @SerializedName("conversationIndex")
    public byte[] conversationIndex;

    /**
     * The Unique Body.
     */
    @SerializedName("uniqueBody")
    public ItemBody uniqueBody;

    /**
     * The Is Delivery Receipt Requested.
     */
    @SerializedName("isDeliveryReceiptRequested")
    public Boolean isDeliveryReceiptRequested;

    /**
     * The Is Read Receipt Requested.
     */
    @SerializedName("isReadReceiptRequested")
    public Boolean isReadReceiptRequested;

    /**
     * The Is Read.
     */
    @SerializedName("isRead")
    public Boolean isRead;

    /**
     * The Is Draft.
     */
    @SerializedName("isDraft")
    public Boolean isDraft;

    /**
     * The Web Link.
     */
    @SerializedName("webLink")
    public String webLink;

    /**
     * The Inference Classification.
     */
    @SerializedName("inferenceClassification")
    public InferenceClassificationType inferenceClassification;

    /**
     * The Unsubscribe Data.
     */
    @SerializedName("unsubscribeData")
    public List<String> unsubscribeData;

    /**
     * The Unsubscribe Enabled.
     */
    @SerializedName("unsubscribeEnabled")
    public Boolean unsubscribeEnabled;

    /**
     * The Flag.
     */
    @SerializedName("flag")
    public FollowupFlag flag;

    /**
     * The Extensions.
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Attachments.
     */
    public transient AttachmentCollectionPage attachments;

    /**
     * The Single Value Extended Properties.
     */
    public transient SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Multi Value Extended Properties.
     */
    public transient MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;


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


        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("attachments")) {
            final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
            if (json.has("attachments@odata.nextLink")) {
                response.nextLink = json.get("attachments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("attachments").toString(), JsonObject[].class);
            final Attachment[] array = new Attachment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            attachments = new AttachmentCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final BaseSingleValueLegacyExtendedPropertyCollectionResponse response = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final BaseMultiValueLegacyExtendedPropertyCollectionResponse response = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }
    }
}
