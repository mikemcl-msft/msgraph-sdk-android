// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.extensions.Bucket;
import com.microsoft.graph.extensions.BucketCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlanDetails;
import com.microsoft.graph.extensions.PlanTaskBoard;
import com.microsoft.graph.extensions.Task;
import com.microsoft.graph.extensions.TaskCollectionPage;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.ISerializer;

import java.util.Arrays;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Plan.
 */
public class BasePlan extends Entity implements IJsonBackedObject {


    public BasePlan() {
        oDataType = "microsoft.graph.plan";
    }

    /**
     * The Created By.
     */
    @SerializedName("createdBy")
    @Expose
    public String createdBy;

    /**
     * The Owner.
     */
    @SerializedName("owner")
    @Expose
    public String owner;

    /**
     * The Title.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Tasks.
     */
    public transient TaskCollectionPage tasks;

    /**
     * The Buckets.
     */
    public transient BucketCollectionPage buckets;

    /**
     * The Details.
     */
    @SerializedName("details")
    @Expose
    public PlanDetails details;

    /**
     * The Assigned To Task Board.
     */
    @SerializedName("assignedToTaskBoard")
    @Expose
    public PlanTaskBoard assignedToTaskBoard;

    /**
     * The Progress Task Board.
     */
    @SerializedName("progressTaskBoard")
    @Expose
    public PlanTaskBoard progressTaskBoard;

    /**
     * The Bucket Task Board.
     */
    @SerializedName("bucketTaskBoard")
    @Expose
    public PlanTaskBoard bucketTaskBoard;


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


        if (json.has("tasks")) {
            final BaseTaskCollectionResponse response = new BaseTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final Task[] array = new Task[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Task.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new TaskCollectionPage(response, null);
        }

        if (json.has("buckets")) {
            final BaseBucketCollectionResponse response = new BaseBucketCollectionResponse();
            if (json.has("buckets@odata.nextLink")) {
                response.nextLink = json.get("buckets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("buckets").toString(), JsonObject[].class);
            final Bucket[] array = new Bucket[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Bucket.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            buckets = new BucketCollectionPage(response, null);
        }
    }
}
