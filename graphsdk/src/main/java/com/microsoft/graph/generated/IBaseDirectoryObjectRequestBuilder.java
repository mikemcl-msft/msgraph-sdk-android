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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Directory Object Request Builder.
 */
public interface IBaseDirectoryObjectRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IDirectoryObjectRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IDirectoryObjectRequest buildRequest(final List<Option> requestOptions);

    IExtensionPropertyRequestBuilder extensionProperty();

    IApplicationRequestBuilder application();

    IOrgContactRequestBuilder orgContact();

    IDeviceRequestBuilder device();

    IDirectoryRoleRequestBuilder directoryRole();

    IDirectoryRoleTemplateRequestBuilder directoryRoleTemplate();

    IDirectorySettingTemplateRequestBuilder directorySettingTemplate();

    IGroupRequestBuilder group();

    IPolicyRequestBuilder policy();

    IServicePrincipalRequestBuilder servicePrincipal();

    IOrganizationRequestBuilder organization();

    IUserRequestBuilder user();

    IAdministrativeUnitRequestBuilder administrativeUnit();

    IDirectoryObjectCheckMemberGroupsCollectionRequestBuilder getCheckMemberGroups(final List<String> groupIds);

    IDirectoryObjectGetMemberGroupsCollectionRequestBuilder getGetMemberGroups(final Boolean securityEnabledOnly);

    IDirectoryObjectGetMemberObjectsCollectionRequestBuilder getGetMemberObjects(final Boolean securityEnabledOnly);

}
