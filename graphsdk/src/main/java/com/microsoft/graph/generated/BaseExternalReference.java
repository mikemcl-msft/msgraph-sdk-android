// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base External Reference.
 */
public class BaseExternalReference implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = true)
    public String oDataType;

    public BaseExternalReference() {
        oDataType = "microsoft.graph.externalReference";
    }

    /**
     * The Alias.
     */
    @SerializedName("alias")
    @Expose
    public String alias;

    /**
     * The Type.
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The Preview Priority.
     */
    @SerializedName("previewPriority")
    @Expose
    public String previewPriority;

    /**
     * The Last Modified By.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public String lastModifiedBy;

    /**
     * The Last Modified Date Time.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;


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
