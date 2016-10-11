// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.extensions.INotebookRequestBuilder;
import com.microsoft.graph.extensions.IPageCopyToSectionRequestBuilder;
import com.microsoft.graph.extensions.IPagePatchContentRequestBuilder;
import com.microsoft.graph.extensions.IPageRequest;
import com.microsoft.graph.extensions.IPageStreamRequestBuilder;
import com.microsoft.graph.extensions.ISectionRequestBuilder;
import com.microsoft.graph.extensions.NotebookRequestBuilder;
import com.microsoft.graph.extensions.PageCopyToSectionRequestBuilder;
import com.microsoft.graph.extensions.PagePatchContentRequestBuilder;
import com.microsoft.graph.extensions.PageRequest;
import com.microsoft.graph.extensions.PageStreamRequestBuilder;
import com.microsoft.graph.extensions.PatchContentCommand;
import com.microsoft.graph.extensions.SectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Page Request Builder.
 */
public class BasePageRequestBuilder extends BaseRequestBuilder implements IBasePageRequestBuilder {

    /**
     * The request builder for the Page
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePageRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IPageRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IPageRequest buildRequest(final List<Option> requestOptions) {
        return new PageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for Section.
     */
    public ISectionRequestBuilder getParentSection() {
        return new SectionRequestBuilder(getRequestUrlWithAdditionalSegment("parentSection"), getClient(), null);
    }

    /**
     * Gets the request builder for Notebook.
     */
    public INotebookRequestBuilder getParentNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("parentNotebook"), getClient(), null);
    }

    public IPageStreamRequestBuilder getContent() {
        return new PageStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }

    public IPagePatchContentRequestBuilder getPatchContent(final List<PatchContentCommand> commands) {
        return new PagePatchContentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.PatchContent"), getClient(), null, commands);
    }

    public IPageCopyToSectionRequestBuilder getCopyToSection(final String id, final String groupId) {
        return new PageCopyToSectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.CopyToSection"), getClient(), null, id, groupId);
    }
}
