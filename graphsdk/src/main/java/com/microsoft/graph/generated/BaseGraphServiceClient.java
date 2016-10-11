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
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";

    /**
     * The current endpoint
     */
    private String mEndpoint;

    @Override
    public String getServiceRoot() {
        if (mEndpoint == null) {
            mEndpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return mEndpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        mEndpoint = value;
    }

    /**
     * Gets the collection of DirectoryObjects objects.
     *
     * @return The request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder getDirectoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryObjects.
     *
     * @param id The id of the DirectoryObjects to retrieve.
     * @return The request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder getDirectoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Applications objects.
     *
     * @return The request builder for the collection of Applications objects
     */
    public IApplicationCollectionRequestBuilder getApplications() {
        return new ApplicationCollectionRequestBuilder(getServiceRoot() + "/applications", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Applications.
     *
     * @param id The id of the Applications to retrieve.
     * @return The request builder for the Applications object
     */
    public IApplicationRequestBuilder getApplications(final String id) {
        return new ApplicationRequestBuilder(getServiceRoot() + "/applications/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of AdministrativeUnits objects.
     *
     * @return The request builder for the collection of AdministrativeUnits objects
     */
    public IAdministrativeUnitCollectionRequestBuilder getAdministrativeUnits() {
        return new AdministrativeUnitCollectionRequestBuilder(getServiceRoot() + "/administrativeUnits", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single AdministrativeUnits.
     *
     * @param id The id of the AdministrativeUnits to retrieve.
     * @return The request builder for the AdministrativeUnits object
     */
    public IAdministrativeUnitRequestBuilder getAdministrativeUnits(final String id) {
        return new AdministrativeUnitRequestBuilder(getServiceRoot() + "/administrativeUnits/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of AppRoleAssignments objects.
     *
     * @return The request builder for the collection of AppRoleAssignments objects
     */
    public IAppRoleAssignmentCollectionRequestBuilder getAppRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/appRoleAssignments", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single AppRoleAssignments.
     *
     * @param id The id of the AppRoleAssignments to retrieve.
     * @return The request builder for the AppRoleAssignments object
     */
    public IAppRoleAssignmentRequestBuilder getAppRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getServiceRoot() + "/appRoleAssignments/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Contacts objects.
     *
     * @return The request builder for the collection of Contacts objects
     */
    public IOrgContactCollectionRequestBuilder getContacts() {
        return new OrgContactCollectionRequestBuilder(getServiceRoot() + "/contacts", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Contacts.
     *
     * @param id The id of the Contacts to retrieve.
     * @return The request builder for the Contacts object
     */
    public IOrgContactRequestBuilder getContacts(final String id) {
        return new OrgContactRequestBuilder(getServiceRoot() + "/contacts/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Devices objects.
     *
     * @return The request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder getDevices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Devices.
     *
     * @param id The id of the Devices to retrieve.
     * @return The request builder for the Devices object
     */
    public IDeviceRequestBuilder getDevices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Groups objects.
     *
     * @return The request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder getGroups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Groups.
     *
     * @param id The id of the Groups to retrieve.
     * @return The request builder for the Groups object
     */
    public IGroupRequestBuilder getGroups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects.
     *
     * @return The request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder getDirectoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoles.
     *
     * @param id The id of the DirectoryRoles to retrieve.
     * @return The request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder getDirectoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects.
     *
     * @return The request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder getDirectoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates.
     *
     * @param id The id of the DirectoryRoleTemplates to retrieve.
     * @return The request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder getDirectoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectorySettingTemplates objects.
     *
     * @return The request builder for the collection of DirectorySettingTemplates objects
     */
    public IDirectorySettingTemplateCollectionRequestBuilder getDirectorySettingTemplates() {
        return new DirectorySettingTemplateCollectionRequestBuilder(getServiceRoot() + "/directorySettingTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectorySettingTemplates.
     *
     * @param id The id of the DirectorySettingTemplates to retrieve.
     * @return The request builder for the DirectorySettingTemplates object
     */
    public IDirectorySettingTemplateRequestBuilder getDirectorySettingTemplates(final String id) {
        return new DirectorySettingTemplateRequestBuilder(getServiceRoot() + "/directorySettingTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Organization objects.
     *
     * @return The request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder getOrganization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Organization.
     *
     * @param id The id of the Organization to retrieve.
     * @return The request builder for the Organization object
     */
    public IOrganizationRequestBuilder getOrganization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Oauth2PermissionGrants objects.
     *
     * @return The request builder for the collection of Oauth2PermissionGrants objects
     */
    public IOAuth2PermissionGrantCollectionRequestBuilder getOauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Oauth2PermissionGrants.
     *
     * @param id The id of the Oauth2PermissionGrants to retrieve.
     * @return The request builder for the Oauth2PermissionGrants object
     */
    public IOAuth2PermissionGrantRequestBuilder getOauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of ScopedRoleMemberships objects.
     *
     * @return The request builder for the collection of ScopedRoleMemberships objects
     */
    public IScopedRoleMembershipCollectionRequestBuilder getScopedRoleMemberships() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getServiceRoot() + "/scopedRoleMemberships", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single ScopedRoleMemberships.
     *
     * @param id The id of the ScopedRoleMemberships to retrieve.
     * @return The request builder for the ScopedRoleMemberships object
     */
    public IScopedRoleMembershipRequestBuilder getScopedRoleMemberships(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getServiceRoot() + "/scopedRoleMemberships/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of ServicePrincipals objects.
     *
     * @return The request builder for the collection of ServicePrincipals objects
     */
    public IServicePrincipalCollectionRequestBuilder getServicePrincipals() {
        return new ServicePrincipalCollectionRequestBuilder(getServiceRoot() + "/servicePrincipals", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single ServicePrincipals.
     *
     * @param id The id of the ServicePrincipals to retrieve.
     * @return The request builder for the ServicePrincipals object
     */
    public IServicePrincipalRequestBuilder getServicePrincipals(final String id) {
        return new ServicePrincipalRequestBuilder(getServiceRoot() + "/servicePrincipals/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Settings objects.
     *
     * @return The request builder for the collection of Settings objects
     */
    public IDirectorySettingCollectionRequestBuilder getSettings() {
        return new DirectorySettingCollectionRequestBuilder(getServiceRoot() + "/settings", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Settings.
     *
     * @param id The id of the Settings to retrieve.
     * @return The request builder for the Settings object
     */
    public IDirectorySettingRequestBuilder getSettings(final String id) {
        return new DirectorySettingRequestBuilder(getServiceRoot() + "/settings/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects.
     *
     * @return The request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder getSubscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SubscribedSkus.
     *
     * @param id The id of the SubscribedSkus to retrieve.
     * @return The request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder getSubscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Users objects.
     *
     * @return The request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder getUsers() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Users.
     *
     * @param id The id of the Users to retrieve.
     * @return The request builder for the Users object
     */
    public IUserRequestBuilder getUsers(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Policies objects.
     *
     * @return The request builder for the collection of Policies objects
     */
    public IPolicyCollectionRequestBuilder getPolicies() {
        return new PolicyCollectionRequestBuilder(getServiceRoot() + "/policies", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Policies.
     *
     * @param id The id of the Policies to retrieve.
     * @return The request builder for the Policies object
     */
    public IPolicyRequestBuilder getPolicies(final String id) {
        return new PolicyRequestBuilder(getServiceRoot() + "/policies/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Workbooks objects.
     *
     * @return The request builder for the collection of Workbooks objects
     */
    public IDriveItemCollectionRequestBuilder getWorkbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Workbooks.
     *
     * @param id The id of the Workbooks to retrieve.
     * @return The request builder for the Workbooks object
     */
    public IDriveItemRequestBuilder getWorkbooks(final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Drives objects.
     *
     * @return The request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder getDrives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Drives.
     *
     * @param id The id of the Drives to retrieve.
     * @return The request builder for the Drives object
     */
    public IDriveRequestBuilder getDrives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Shares objects.
     *
     * @return The request builder for the collection of Shares objects
     */
    public ISharedDriveItemCollectionRequestBuilder getShares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Shares.
     *
     * @param id The id of the Shares to retrieve.
     * @return The request builder for the Shares object
     */
    public ISharedDriveItemRequestBuilder getShares(final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Tasks objects.
     *
     * @return The request builder for the collection of Tasks objects
     */
    public ITaskCollectionRequestBuilder getTasks() {
        return new TaskCollectionRequestBuilder(getServiceRoot() + "/tasks", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Tasks.
     *
     * @param id The id of the Tasks to retrieve.
     * @return The request builder for the Tasks object
     */
    public ITaskRequestBuilder getTasks(final String id) {
        return new TaskRequestBuilder(getServiceRoot() + "/tasks/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Plans objects.
     *
     * @return The request builder for the collection of Plans objects
     */
    public IPlanCollectionRequestBuilder getPlans() {
        return new PlanCollectionRequestBuilder(getServiceRoot() + "/plans", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Plans.
     *
     * @param id The id of the Plans to retrieve.
     * @return The request builder for the Plans object
     */
    public IPlanRequestBuilder getPlans(final String id) {
        return new PlanRequestBuilder(getServiceRoot() + "/plans/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Buckets objects.
     *
     * @return The request builder for the collection of Buckets objects
     */
    public IBucketCollectionRequestBuilder getBuckets() {
        return new BucketCollectionRequestBuilder(getServiceRoot() + "/buckets", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Buckets.
     *
     * @param id The id of the Buckets to retrieve.
     * @return The request builder for the Buckets object
     */
    public IBucketRequestBuilder getBuckets(final String id) {
        return new BucketRequestBuilder(getServiceRoot() + "/buckets/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Subscriptions objects.
     *
     * @return The request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder getSubscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Subscriptions.
     *
     * @param id The id of the Subscriptions to retrieve.
     * @return The request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder getSubscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of IdentityRiskEvents objects.
     *
     * @return The request builder for the collection of IdentityRiskEvents objects
     */
    public IIdentityRiskEventCollectionRequestBuilder getIdentityRiskEvents() {
        return new IdentityRiskEventCollectionRequestBuilder(getServiceRoot() + "/identityRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single IdentityRiskEvents.
     *
     * @param id The id of the IdentityRiskEvents to retrieve.
     * @return The request builder for the IdentityRiskEvents object
     */
    public IIdentityRiskEventRequestBuilder getIdentityRiskEvents(final String id) {
        return new IdentityRiskEventRequestBuilder(getServiceRoot() + "/identityRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of ImpossibleTravelRiskEvents objects.
     *
     * @return The request builder for the collection of ImpossibleTravelRiskEvents objects
     */
    public IImpossibleTravelRiskEventCollectionRequestBuilder getImpossibleTravelRiskEvents() {
        return new ImpossibleTravelRiskEventCollectionRequestBuilder(getServiceRoot() + "/impossibleTravelRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single ImpossibleTravelRiskEvents.
     *
     * @param id The id of the ImpossibleTravelRiskEvents to retrieve.
     * @return The request builder for the ImpossibleTravelRiskEvents object
     */
    public IImpossibleTravelRiskEventRequestBuilder getImpossibleTravelRiskEvents(final String id) {
        return new ImpossibleTravelRiskEventRequestBuilder(getServiceRoot() + "/impossibleTravelRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of LeakedCredentialsRiskEvents objects.
     *
     * @return The request builder for the collection of LeakedCredentialsRiskEvents objects
     */
    public ILeakedCredentialsRiskEventCollectionRequestBuilder getLeakedCredentialsRiskEvents() {
        return new LeakedCredentialsRiskEventCollectionRequestBuilder(getServiceRoot() + "/leakedCredentialsRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single LeakedCredentialsRiskEvents.
     *
     * @param id The id of the LeakedCredentialsRiskEvents to retrieve.
     * @return The request builder for the LeakedCredentialsRiskEvents object
     */
    public ILeakedCredentialsRiskEventRequestBuilder getLeakedCredentialsRiskEvents(final String id) {
        return new LeakedCredentialsRiskEventRequestBuilder(getServiceRoot() + "/leakedCredentialsRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of AnonymousIpRiskEvents objects.
     *
     * @return The request builder for the collection of AnonymousIpRiskEvents objects
     */
    public IAnonymousIpRiskEventCollectionRequestBuilder getAnonymousIpRiskEvents() {
        return new AnonymousIpRiskEventCollectionRequestBuilder(getServiceRoot() + "/anonymousIpRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single AnonymousIpRiskEvents.
     *
     * @param id The id of the AnonymousIpRiskEvents to retrieve.
     * @return The request builder for the AnonymousIpRiskEvents object
     */
    public IAnonymousIpRiskEventRequestBuilder getAnonymousIpRiskEvents(final String id) {
        return new AnonymousIpRiskEventRequestBuilder(getServiceRoot() + "/anonymousIpRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SuspiciousIpRiskEvents objects.
     *
     * @return The request builder for the collection of SuspiciousIpRiskEvents objects
     */
    public ISuspiciousIpRiskEventCollectionRequestBuilder getSuspiciousIpRiskEvents() {
        return new SuspiciousIpRiskEventCollectionRequestBuilder(getServiceRoot() + "/suspiciousIpRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SuspiciousIpRiskEvents.
     *
     * @param id The id of the SuspiciousIpRiskEvents to retrieve.
     * @return The request builder for the SuspiciousIpRiskEvents object
     */
    public ISuspiciousIpRiskEventRequestBuilder getSuspiciousIpRiskEvents(final String id) {
        return new SuspiciousIpRiskEventRequestBuilder(getServiceRoot() + "/suspiciousIpRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of UnfamiliarLocationRiskEvents objects.
     *
     * @return The request builder for the collection of UnfamiliarLocationRiskEvents objects
     */
    public IUnfamiliarLocationRiskEventCollectionRequestBuilder getUnfamiliarLocationRiskEvents() {
        return new UnfamiliarLocationRiskEventCollectionRequestBuilder(getServiceRoot() + "/unfamiliarLocationRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single UnfamiliarLocationRiskEvents.
     *
     * @param id The id of the UnfamiliarLocationRiskEvents to retrieve.
     * @return The request builder for the UnfamiliarLocationRiskEvents object
     */
    public IUnfamiliarLocationRiskEventRequestBuilder getUnfamiliarLocationRiskEvents(final String id) {
        return new UnfamiliarLocationRiskEventRequestBuilder(getServiceRoot() + "/unfamiliarLocationRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of MalwareRiskEvents objects.
     *
     * @return The request builder for the collection of MalwareRiskEvents objects
     */
    public IMalwareRiskEventCollectionRequestBuilder getMalwareRiskEvents() {
        return new MalwareRiskEventCollectionRequestBuilder(getServiceRoot() + "/malwareRiskEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single MalwareRiskEvents.
     *
     * @param id The id of the MalwareRiskEvents to retrieve.
     * @return The request builder for the MalwareRiskEvents object
     */
    public IMalwareRiskEventRequestBuilder getMalwareRiskEvents(final String id) {
        return new MalwareRiskEventRequestBuilder(getServiceRoot() + "/malwareRiskEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of PrivilegedRoles objects.
     *
     * @return The request builder for the collection of PrivilegedRoles objects
     */
    public IPrivilegedRoleCollectionRequestBuilder getPrivilegedRoles() {
        return new PrivilegedRoleCollectionRequestBuilder(getServiceRoot() + "/privilegedRoles", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single PrivilegedRoles.
     *
     * @param id The id of the PrivilegedRoles to retrieve.
     * @return The request builder for the PrivilegedRoles object
     */
    public IPrivilegedRoleRequestBuilder getPrivilegedRoles(final String id) {
        return new PrivilegedRoleRequestBuilder(getServiceRoot() + "/privilegedRoles/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of PrivilegedRoleAssignments objects.
     *
     * @return The request builder for the collection of PrivilegedRoleAssignments objects
     */
    public IPrivilegedRoleAssignmentCollectionRequestBuilder getPrivilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single PrivilegedRoleAssignments.
     *
     * @param id The id of the PrivilegedRoleAssignments to retrieve.
     * @return The request builder for the PrivilegedRoleAssignments object
     */
    public IPrivilegedRoleAssignmentRequestBuilder getPrivilegedRoleAssignments(final String id) {
        return new PrivilegedRoleAssignmentRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of PrivilegedOperationEvents objects.
     *
     * @return The request builder for the collection of PrivilegedOperationEvents objects
     */
    public IPrivilegedOperationEventCollectionRequestBuilder getPrivilegedOperationEvents() {
        return new PrivilegedOperationEventCollectionRequestBuilder(getServiceRoot() + "/privilegedOperationEvents", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single PrivilegedOperationEvents.
     *
     * @param id The id of the PrivilegedOperationEvents to retrieve.
     * @return The request builder for the PrivilegedOperationEvents object
     */
    public IPrivilegedOperationEventRequestBuilder getPrivilegedOperationEvents(final String id) {
        return new PrivilegedOperationEventRequestBuilder(getServiceRoot() + "/privilegedOperationEvents/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of PrivilegedSignupStatus objects.
     *
     * @return The request builder for the collection of PrivilegedSignupStatus objects
     */
    public IPrivilegedSignupStatusCollectionRequestBuilder getPrivilegedSignupStatus() {
        return new PrivilegedSignupStatusCollectionRequestBuilder(getServiceRoot() + "/privilegedSignupStatus", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single PrivilegedSignupStatus.
     *
     * @param id The id of the PrivilegedSignupStatus to retrieve.
     * @return The request builder for the PrivilegedSignupStatus object
     */
    public IPrivilegedSignupStatusRequestBuilder getPrivilegedSignupStatus(final String id) {
        return new PrivilegedSignupStatusRequestBuilder(getServiceRoot() + "/privilegedSignupStatus/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Connectors objects.
     *
     * @return The request builder for the collection of Connectors objects
     */
    public IConnectorCollectionRequestBuilder getConnectors() {
        return new ConnectorCollectionRequestBuilder(getServiceRoot() + "/connectors", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Connectors.
     *
     * @param id The id of the Connectors to retrieve.
     * @return The request builder for the Connectors object
     */
    public IConnectorRequestBuilder getConnectors(final String id) {
        return new ConnectorRequestBuilder(getServiceRoot() + "/connectors/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of ConnectorGroups objects.
     *
     * @return The request builder for the collection of ConnectorGroups objects
     */
    public IConnectorGroupCollectionRequestBuilder getConnectorGroups() {
        return new ConnectorGroupCollectionRequestBuilder(getServiceRoot() + "/connectorGroups", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single ConnectorGroups.
     *
     * @param id The id of the ConnectorGroups to retrieve.
     * @return The request builder for the ConnectorGroups object
     */
    public IConnectorGroupRequestBuilder getConnectorGroups(final String id) {
        return new ConnectorGroupRequestBuilder(getServiceRoot() + "/connectorGroups/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Invitations objects.
     *
     * @return The request builder for the collection of Invitations objects
     */
    public IInvitationCollectionRequestBuilder getInvitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Invitations.
     *
     * @param id The id of the Invitations to retrieve.
     * @return The request builder for the Invitations object
     */
    public IInvitationRequestBuilder getInvitations(final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the User.
     */
    public IUserRequestBuilder getMe() {
        return new UserRequestBuilder(getServiceRoot() + "/me", (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Drive.
     */
    public IDriveRequestBuilder getDrive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the SharePoint.
     */
    public ISharePointRequestBuilder getSharePoint() {
        return new SharePointRequestBuilder(getServiceRoot() + "/sharePoint", (IGraphServiceClient)this, null);
    }
}
