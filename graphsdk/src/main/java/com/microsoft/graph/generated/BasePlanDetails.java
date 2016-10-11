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
 * The class for the Base Plan Details.
 */
public class BasePlanDetails extends Entity implements IJsonBackedObject {


    public BasePlanDetails() {
        oDataType = "microsoft.graph.planDetails";
    }

    /**
     * The Shared With.
     */
    @SerializedName("sharedWith")
    @Expose
    public Map<String, Boolean> sharedWith;

    /**
     * The Category0Description.
     */
    @SerializedName("category0Description")
    @Expose
    public String category0Description;

    /**
     * The Category1Description.
     */
    @SerializedName("category1Description")
    @Expose
    public String category1Description;

    /**
     * The Category2Description.
     */
    @SerializedName("category2Description")
    @Expose
    public String category2Description;

    /**
     * The Category3Description.
     */
    @SerializedName("category3Description")
    @Expose
    public String category3Description;

    /**
     * The Category4Description.
     */
    @SerializedName("category4Description")
    @Expose
    public String category4Description;

    /**
     * The Category5Description.
     */
    @SerializedName("category5Description")
    @Expose
    public String category5Description;


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
