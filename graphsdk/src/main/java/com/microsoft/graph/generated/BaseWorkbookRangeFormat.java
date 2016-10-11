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
 * The class for the Base Workbook Range Format.
 */
public class BaseWorkbookRangeFormat extends Entity implements IJsonBackedObject {


    public BaseWorkbookRangeFormat() {
        oDataType = "microsoft.graph.workbookRangeFormat";
    }

    /**
     * The Column Width.
     */
    @SerializedName("columnWidth")
    @Expose
    public Double columnWidth;

    /**
     * The Horizontal Alignment.
     */
    @SerializedName("horizontalAlignment")
    @Expose
    public String horizontalAlignment;

    /**
     * The Row Height.
     */
    @SerializedName("rowHeight")
    @Expose
    public Double rowHeight;

    /**
     * The Vertical Alignment.
     */
    @SerializedName("verticalAlignment")
    @Expose
    public String verticalAlignment;

    /**
     * The Wrap Text.
     */
    @SerializedName("wrapText")
    @Expose
    public Boolean wrapText;

    /**
     * The Borders.
     */
    public transient WorkbookRangeBorderCollectionPage borders;

    /**
     * The Fill.
     */
    @SerializedName("fill")
    @Expose
    public WorkbookRangeFill fill;

    /**
     * The Font.
     */
    @SerializedName("font")
    @Expose
    public WorkbookRangeFont font;

    /**
     * The Protection.
     */
    @SerializedName("protection")
    @Expose
    public WorkbookFormatProtection protection;


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


        if (json.has("borders")) {
            final BaseWorkbookRangeBorderCollectionResponse response = new BaseWorkbookRangeBorderCollectionResponse();
            if (json.has("borders@odata.nextLink")) {
                response.nextLink = json.get("borders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("borders").toString(), JsonObject[].class);
            final WorkbookRangeBorder[] array = new WorkbookRangeBorder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookRangeBorder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            borders = new WorkbookRangeBorderCollectionPage(response, null);
        }
    }
}
