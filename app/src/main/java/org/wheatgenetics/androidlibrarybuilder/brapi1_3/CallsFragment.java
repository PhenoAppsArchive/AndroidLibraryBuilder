package org.wheatgenetics.androidlibrarybuilder.brapi1_3;

/**
 * Uses:
 * android.content.DialogInterface
 * android.os.Bundle
 * android.support.annotation.IntRange
 * android.support.annotation.NonNull
 * android.support.annotation.Nullable
 * android.view.LayoutInflater
 * android.view.View
 * android.view.View.OnClickListener
 * android.view.ViewGroup
 * android.widget.Button
 * android.widget.TextView
 *
 * io.swagger.client.ApiCallback
 * io.swagger.client.ApiException
 * io.swagger.client.api.CallsApi
 * io.swagger.client.model.CallsResponse
 * io.swagger.client.model.WSMIMEDataTypes
 *
 * org.wheatgenetics.brapi1_3.DataTypeAlertDialog
 *
 * org.wheatgenetics.androidlibrarybuilder.R
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.PagedFragment
 */
public class CallsFragment
extends org.wheatgenetics.androidlibrarybuilder.brapi1_3.PagedFragment
{
    // region Fields
    private android.widget.TextView dataTypeTextView;

    private io.swagger.client.model.WSMIMEDataTypes        dataType                    = null;
    private org.wheatgenetics.brapi1_3.DataTypeAlertDialog dataTypeAlertDialogInstance = null;

    private io.swagger.client.api.CallsApi callsApiInstance = null;
    private io.swagger.client.ApiCallback<io.swagger.client.model.CallsResponse>
        callbackInstance = null;
    // endregion

    // region Private Methods
    // region dataType Private Methods
    private void setDataType(@android.support.annotation.IntRange(from = 0) final int i)
    {
        this.dataType = this.dataTypeAlertDialog().item(i);
        if (null != this.dataTypeTextView) this.dataTypeTextView.setText(
            null == this.dataType ? "null" : this.dataType.toString());
    }

    private org.wheatgenetics.brapi1_3.DataTypeAlertDialog dataTypeAlertDialog()
    {
        if (null == this.dataTypeAlertDialogInstance)
        {
            this.dataTypeAlertDialogInstance =
                new org.wheatgenetics.brapi1_3.DataTypeAlertDialog(this.getActivity());
            this.dataTypeAlertDialogInstance.setOnClickListener(
                new android.content.DialogInterface.OnClickListener()
                {
                    @java.lang.Override public void onClick(
                    final android.content.DialogInterface dialog, final int which)
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3
                            .CallsFragment.this.setDataType(which);
                    }
                });
        }
        return this.dataTypeAlertDialogInstance;
    }

    private void showDataTypeAlertDialog() { this.dataTypeAlertDialog().show(); }
    // endregion

    // region callsGet() Private Methods
    private io.swagger.client.api.CallsApi callsApi()
    {
        if (null == this.callsApiInstance)
            this.callsApiInstance = new io.swagger.client.api.CallsApi();
        return this.callsApiInstance;
    }

    private void setResponseTextViewText(final io.swagger.client.model.CallsResponse callsResponse)
    {
        this.setResponseTextViewTextFromThread(
            null == callsResponse ? "null" : callsResponse.toString());
    }

    private io.swagger.client.ApiCallback<io.swagger.client.model.CallsResponse> callback()
    {
        if (null == this.callbackInstance) this.callbackInstance =
            new io.swagger.client.ApiCallback<io.swagger.client.model.CallsResponse>()
            {
                @java.lang.Override public void onFailure(
                final io.swagger.client.ApiException e, final int statusCode,
                final java.util.Map<java.lang.String, java.util.List<java.lang.String>>
                    responseHeaders)
                {
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3
                        .CallsFragment.this.setResponseTextViewTextFromThread(e);
                }

                @java.lang.Override public void onSuccess(
                final io.swagger.client.model.CallsResponse result, final int statusCode,
                final java.util.Map<java.lang.String, java.util.List<java.lang.String>>
                    responseHeaders)
                {
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3
                        .CallsFragment.this.setResponseTextViewText(result);
                }

                @java.lang.Override public void onUploadProgress(
                final long bytesWritten, final long contentLength, final boolean done) {}

                @java.lang.Override public void onDownloadProgress(
                final long bytesRead, final long contentLength, final boolean done) {}
            };
        return this.callbackInstance;
    }

    private void callsGet()
    {
        try
        {
            this.callsApi().callsGetAsync(
                /* datatype      => */null,
                /* dataType      => */ this.dataType                    ,
                /* page          => */ this.getPageEditTextIntText    (),
                /* pageSize      => */ this.getPageSizeEditTextIntText(),
                /* authorization => */null,
                /* callback      => */ this.callback());
        }
        catch (final java.lang.Throwable e) { this.setResponseTextViewText(e); }
    }
    // endregion
    // endregion

    public CallsFragment() {}

    @android.support.annotation.Nullable @java.lang.Override public android.view.View onCreateView(
    @android.support.annotation.NonNull  final android.view.LayoutInflater inflater          ,
    @android.support.annotation.Nullable final android.view.ViewGroup      container         ,
    @android.support.annotation.Nullable final android.os.Bundle           savedInstanceState)
    {
        final android.view.View rootView = this.inflate(inflater, container,
            org.wheatgenetics.androidlibrarybuilder.R.layout.fragment_brapi1_3_calls);

        // The following six ids are from fragment_brapi1_3_calls.xml.
        assert null != rootView; this.dataTypeTextView = rootView.findViewById(
            org.wheatgenetics.androidlibrarybuilder.R.id.callsDataTypeValueTextView);
        {
            final android.widget.Button changeDataTypeButton = rootView.findViewById(
                org.wheatgenetics.androidlibrarybuilder.R.id.callsChangeDataTypeButton);
            if (null != changeDataTypeButton) changeDataTypeButton.setOnClickListener(
                new android.view.View.OnClickListener()
                {
                    @java.lang.Override public void onClick(final android.view.View v)
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3
                            .CallsFragment.this.showDataTypeAlertDialog();
                    }
                });
        }
        this.findPageEditTextById(rootView,
            org.wheatgenetics.androidlibrarybuilder.R.id.callsPageEditText);
        this.findPageSizeEditTextById(rootView,
            org.wheatgenetics.androidlibrarybuilder.R.id.callsPageSizeEditText);
        {
            final android.widget.Button callsGetButton = rootView.findViewById(
                org.wheatgenetics.androidlibrarybuilder.R.id.callsGetButton);
            if (null != callsGetButton) callsGetButton.setOnClickListener(
                new android.view.View.OnClickListener()
                {
                    @java.lang.Override public void onClick(final android.view.View v)
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3
                            .CallsFragment.this.callsGet();
                    }
                });
        }
        this.findResponseTextViewById(rootView,
            org.wheatgenetics.androidlibrarybuilder.R.id.callsResponseTextView);

        return rootView;
    }
}