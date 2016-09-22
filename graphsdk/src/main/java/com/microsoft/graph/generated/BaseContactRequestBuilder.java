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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact Request Builder.
 */
public class BaseContactRequestBuilder extends BaseRequestBuilder implements IBaseContactRequestBuilder {

    /**
     * The request builder for the Contact
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseContactRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IContactRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IContactRequest buildRequest(final List<Option> options) {
        return new ContactRequest(getRequestUrl(), getClient(), options);
    }

    public IExtensionCollectionRequestBuilder getExtensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder getExtensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public ISingleValueLegacyExtendedPropertyCollectionRequestBuilder getSingleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public ISingleValueLegacyExtendedPropertyRequestBuilder getSingleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public IMultiValueLegacyExtendedPropertyCollectionRequestBuilder getMultiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public IMultiValueLegacyExtendedPropertyRequestBuilder getMultiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto.
     */
    public IProfilePhotoRequestBuilder getPhoto() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
}
