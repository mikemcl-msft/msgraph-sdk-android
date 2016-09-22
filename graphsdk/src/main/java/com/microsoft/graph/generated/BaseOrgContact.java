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
 * The class for the Base Org Contact.
 */
public class BaseOrgContact extends DirectoryObject implements IJsonBackedObject {


    public BaseOrgContact() {
        oDataType = "microsoft.graph.orgContact";
    }

    /**
     * The Business Phones.
     */
    @SerializedName("businessPhones")
    public List<String> businessPhones;

    /**
     * The City.
     */
    @SerializedName("city")
    public String city;

    /**
     * The Company Name.
     */
    @SerializedName("companyName")
    public String companyName;

    /**
     * The Country.
     */
    @SerializedName("country")
    public String country;

    /**
     * The Department.
     */
    @SerializedName("department")
    public String department;

    /**
     * The Display Name.
     */
    @SerializedName("displayName")
    public String displayName;

    /**
     * The Given Name.
     */
    @SerializedName("givenName")
    public String givenName;

    /**
     * The Job Title.
     */
    @SerializedName("jobTitle")
    public String jobTitle;

    /**
     * The Mail.
     */
    @SerializedName("mail")
    public String mail;

    /**
     * The Mail Nickname.
     */
    @SerializedName("mailNickname")
    public String mailNickname;

    /**
     * The Mobile Phone.
     */
    @SerializedName("mobilePhone")
    public String mobilePhone;

    /**
     * The On Premises Sync Enabled.
     */
    @SerializedName("onPremisesSyncEnabled")
    public Boolean onPremisesSyncEnabled;

    /**
     * The On Premises Last Sync Date Time.
     */
    @SerializedName("onPremisesLastSyncDateTime")
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The Office Location.
     */
    @SerializedName("officeLocation")
    public String officeLocation;

    /**
     * The Postal Code.
     */
    @SerializedName("postalCode")
    public String postalCode;

    /**
     * The Proxy Addresses.
     */
    @SerializedName("proxyAddresses")
    public List<String> proxyAddresses;

    /**
     * The State.
     */
    @SerializedName("state")
    public String state;

    /**
     * The Street Address.
     */
    @SerializedName("streetAddress")
    public String streetAddress;

    /**
     * The Surname.
     */
    @SerializedName("surname")
    public String surname;

    /**
     * The Manager.
     */
    @SerializedName("manager")
    public DirectoryObject manager;

    /**
     * The Direct Reports.
     */
    public transient DirectoryObjectCollectionPage directReports;

    /**
     * The Member Of.
     */
    public transient DirectoryObjectCollectionPage memberOf;


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


        if (json.has("directReports")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("directReports@odata.nextLink")) {
                response.nextLink = json.get("directReports@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("directReports").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            directReports = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }
    }
}
