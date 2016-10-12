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
 * The class for the Base Section.
 */
public class BaseSection extends Entity implements IJsonBackedObject {


    public BaseSection() {
        oDataType = "microsoft.graph.section";
    }

    /**
     * The Is Default.
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Pages Url.
     */
    @SerializedName("pagesUrl")
    @Expose
    public String pagesUrl;

    /**
     * The Name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Created By.
     */
    @SerializedName("createdBy")
    @Expose
    public String createdBy;

    /**
     * The Created By Identity.
     */
    @SerializedName("createdByIdentity")
    @Expose
    public OneNoteIdentitySet createdByIdentity;

    /**
     * The Last Modified By.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public String lastModifiedBy;

    /**
     * The Last Modified By Identity.
     */
    @SerializedName("lastModifiedByIdentity")
    @Expose
    public OneNoteIdentitySet lastModifiedByIdentity;

    /**
     * The Last Modified Time.
     */
    @SerializedName("lastModifiedTime")
    @Expose
    public java.util.Calendar lastModifiedTime;

    /**
     * The Self.
     */
    @SerializedName("self")
    @Expose
    public String self;

    /**
     * The Created Time.
     */
    @SerializedName("createdTime")
    @Expose
    public java.util.Calendar createdTime;

    /**
     * The Parent Notebook.
     */
    @SerializedName("parentNotebook")
    @Expose
    public Notebook parentNotebook;

    /**
     * The Parent Section Group.
     */
    @SerializedName("parentSectionGroup")
    @Expose
    public SectionGroup parentSectionGroup;

    /**
     * The Pages.
     */
    public transient PageCollectionPage pages;


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


        if (json.has("pages")) {
            final BasePageCollectionResponse response = new BasePageCollectionResponse();
            if (json.has("pages@odata.nextLink")) {
                response.nextLink = json.get("pages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pages").toString(), JsonObject[].class);
            final Page[] array = new Page[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Page.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pages = new PageCollectionPage(response, null);
        }
    }
}