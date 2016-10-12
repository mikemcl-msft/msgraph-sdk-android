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
 * The class for the Base Connector Group.
 */
public class BaseConnectorGroup extends Entity implements IJsonBackedObject {


    public BaseConnectorGroup() {
        oDataType = "microsoft.graph.connectorGroup";
    }

    /**
     * The Name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Connector Group Type.
     */
    @SerializedName("connectorGroupType")
    @Expose
    public ConnectorGroupType connectorGroupType;

    /**
     * The Is Default.
     */
    @SerializedName("isDefault")
    @Expose
    public Boolean isDefault;

    /**
     * The Members.
     */
    public transient ConnectorCollectionPage members;

    /**
     * The Applications.
     */
    public transient ApplicationCollectionPage applications;


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


        if (json.has("members")) {
            final BaseConnectorCollectionResponse response = new BaseConnectorCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final Connector[] array = new Connector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Connector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new ConnectorCollectionPage(response, null);
        }

        if (json.has("applications")) {
            final BaseApplicationCollectionResponse response = new BaseApplicationCollectionResponse();
            if (json.has("applications@odata.nextLink")) {
                response.nextLink = json.get("applications@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("applications").toString(), JsonObject[].class);
            final Application[] array = new Application[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Application.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            applications = new ApplicationCollectionPage(response, null);
        }
    }
}