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
 * The class for the Base Page.
 */
public class BasePage extends Entity implements IJsonBackedObject {


    public BasePage() {
        oDataType = "microsoft.graph.page";
    }

    /**
     * The Title.
     */
    @SerializedName("title")
    public String title;

    /**
     * The Created By App Id.
     */
    @SerializedName("createdByAppId")
    public String createdByAppId;

    /**
     * The Links.
     */
    @SerializedName("links")
    public PageLinks links;

    /**
     * The Content Url.
     */
    @SerializedName("contentUrl")
    public String contentUrl;

    /**
     * The Last Modified Time.
     */
    @SerializedName("lastModifiedTime")
    public java.util.Calendar lastModifiedTime;

    /**
     * The Level.
     */
    @SerializedName("level")
    public Integer level;

    /**
     * The Order.
     */
    @SerializedName("order")
    public Integer order;

    /**
     * The Self.
     */
    @SerializedName("self")
    public String self;

    /**
     * The Created Time.
     */
    @SerializedName("createdTime")
    public java.util.Calendar createdTime;

    /**
     * The Parent Section.
     */
    @SerializedName("parentSection")
    public Section parentSection;

    /**
     * The Parent Notebook.
     */
    @SerializedName("parentNotebook")
    public Notebook parentNotebook;


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
