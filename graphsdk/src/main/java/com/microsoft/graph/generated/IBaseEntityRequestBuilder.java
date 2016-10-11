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
 * The interface for the Base Entity Request Builder.
 */
public interface IBaseEntityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IEntityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IEntityRequest buildRequest(final List<Option> requestOptions);

    IDirectoryObjectRequestBuilder directoryObject();

    IConnectorGroupRequestBuilder connectorGroup();

    IAppRoleAssignmentRequestBuilder appRoleAssignment();

    IScopedRoleMembershipRequestBuilder scopedRoleMembership();

    IDirectorySettingRequestBuilder directorySetting();

    IConversationThreadRequestBuilder conversationThread();

    ICalendarRequestBuilder calendar();

    IOutlookItemRequestBuilder outlookItem();

    IConversationRequestBuilder conversation();

    IProfilePhotoRequestBuilder profilePhoto();

    IDriveRequestBuilder drive();

    ISharePointRequestBuilder sharePoint();

    IPlanRequestBuilder plan();

    INotesRequestBuilder notes();

    IOAuth2PermissionGrantRequestBuilder oAuth2PermissionGrant();

    ISubscribedSkuRequestBuilder subscribedSku();

    IMailFolderRequestBuilder mailFolder();

    ICalendarGroupRequestBuilder calendarGroup();

    IPersonRequestBuilder person();

    IContactFolderRequestBuilder contactFolder();

    IInferenceClassificationRequestBuilder inferenceClassification();

    IOfficeGraphInsightsRequestBuilder officeGraphInsights();

    IDriveItemRequestBuilder driveItem();

    ITaskRequestBuilder task();

    IWorkbookRequestBuilder workbook();

    IPermissionRequestBuilder permission();

    IThumbnailSetRequestBuilder thumbnailSet();

    IWorkbookApplicationRequestBuilder workbookApplication();

    IWorkbookNamedItemRequestBuilder workbookNamedItem();

    IWorkbookTableRequestBuilder workbookTable();

    IWorkbookWorksheetRequestBuilder workbookWorksheet();

    IWorkbookFunctionsRequestBuilder workbookFunctions();

    IWorkbookChartRequestBuilder workbookChart();

    IWorkbookChartAxesRequestBuilder workbookChartAxes();

    IWorkbookChartDataLabelsRequestBuilder workbookChartDataLabels();

    IWorkbookChartAreaFormatRequestBuilder workbookChartAreaFormat();

    IWorkbookChartLegendRequestBuilder workbookChartLegend();

    IWorkbookChartSeriesRequestBuilder workbookChartSeries();

    IWorkbookChartTitleRequestBuilder workbookChartTitle();

    IWorkbookChartFillRequestBuilder workbookChartFill();

    IWorkbookChartFontRequestBuilder workbookChartFont();

    IWorkbookChartAxisRequestBuilder workbookChartAxis();

    IWorkbookChartAxisFormatRequestBuilder workbookChartAxisFormat();

    IWorkbookChartGridlinesRequestBuilder workbookChartGridlines();

    IWorkbookChartAxisTitleRequestBuilder workbookChartAxisTitle();

    IWorkbookChartLineFormatRequestBuilder workbookChartLineFormat();

    IWorkbookChartAxisTitleFormatRequestBuilder workbookChartAxisTitleFormat();

    IWorkbookChartDataLabelFormatRequestBuilder workbookChartDataLabelFormat();

    IWorkbookChartGridlinesFormatRequestBuilder workbookChartGridlinesFormat();

    IWorkbookChartLegendFormatRequestBuilder workbookChartLegendFormat();

    IWorkbookChartPointRequestBuilder workbookChartPoint();

    IWorkbookChartPointFormatRequestBuilder workbookChartPointFormat();

    IWorkbookChartSeriesFormatRequestBuilder workbookChartSeriesFormat();

    IWorkbookChartTitleFormatRequestBuilder workbookChartTitleFormat();

    IWorkbookFilterRequestBuilder workbookFilter();

    IWorkbookFormatProtectionRequestBuilder workbookFormatProtection();

    IWorkbookFunctionResultRequestBuilder workbookFunctionResult();

    IWorkbookRangeRequestBuilder workbookRange();

    IWorkbookRangeFormatRequestBuilder workbookRangeFormat();

    IWorkbookRangeSortRequestBuilder workbookRangeSort();

    IWorkbookRangeBorderRequestBuilder workbookRangeBorder();

    IWorkbookRangeFillRequestBuilder workbookRangeFill();

    IWorkbookRangeFontRequestBuilder workbookRangeFont();

    IWorkbookTableColumnRequestBuilder workbookTableColumn();

    IWorkbookTableRowRequestBuilder workbookTableRow();

    IWorkbookTableSortRequestBuilder workbookTableSort();

    IWorkbookWorksheetProtectionRequestBuilder workbookWorksheetProtection();

    IAttachmentRequestBuilder attachment();

    IUserConfigurationRequestBuilder userConfiguration();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueLegacyExtendedProperty();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueLegacyExtendedProperty();

    IExtensionRequestBuilder extension();

    IMentionRequestBuilder mention();

    IInferenceClassificationOverrideRequestBuilder inferenceClassificationOverride();

    ISharedDriveItemRequestBuilder sharedDriveItem();

    IBaseItemRequestBuilder baseItem();

    IFieldValueSetRequestBuilder fieldValueSet();

    ITrendingRequestBuilder trending();

    ITaskDetailsRequestBuilder taskDetails();

    ITaskBoardTaskFormatRequestBuilder taskBoardTaskFormat();

    IBucketRequestBuilder bucket();

    IPlanDetailsRequestBuilder planDetails();

    IPlanTaskBoardRequestBuilder planTaskBoard();

    INotebookRequestBuilder notebook();

    ISectionRequestBuilder section();

    ISectionGroupRequestBuilder sectionGroup();

    IPageRequestBuilder page();

    IResourceRequestBuilder resource();

    INotesOperationRequestBuilder notesOperation();

    ISubscriptionRequestBuilder subscription();

    IIdentityRiskEventRequestBuilder identityRiskEvent();

    IPrivilegedRoleRequestBuilder privilegedRole();

    IPrivilegedRoleSettingsRequestBuilder privilegedRoleSettings();

    IPrivilegedRoleAssignmentRequestBuilder privilegedRoleAssignment();

    IPrivilegedRoleSummaryRequestBuilder privilegedRoleSummary();

    IPrivilegedOperationEventRequestBuilder privilegedOperationEvent();

    IPrivilegedSignupStatusRequestBuilder privilegedSignupStatus();

    ITenantSetupInfoRequestBuilder tenantSetupInfo();

    IConnectorRequestBuilder connector();

    IInvitationRequestBuilder invitation();

}
