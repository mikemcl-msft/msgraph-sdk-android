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
 * The class for the Base Drive Item Invite Collection Page.
 */
public class BaseDriveItemInviteCollectionPage extends BaseCollectionPage<Permission, IDriveItemInviteCollectionRequestBuilder> implements IBaseDriveItemInviteCollectionPage {

    /**
     * A collection page for DriveItemInvite.
     *
     * @param response The serialized BaseDriveItemInviteCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseDriveItemInviteCollectionPage(final BaseDriveItemInviteCollectionResponse response, final IDriveItemInviteCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}