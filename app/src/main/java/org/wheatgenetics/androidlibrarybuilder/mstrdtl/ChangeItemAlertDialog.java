package org.wheatgenetics.androidlibrarybuilder.mstrdtl;

/**
 * Uses:
 * android.app.Activity
 * android.view.View
 * android.view.View.OnClickListener
 * android.widget.EditText
 *
 * org.wheatgenetics.androidlibrary.AlertDialog
 * org.wheatgenetics.androidlibrary.Utils
 *
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item
 * org.wheatgenetics.androidlibrarybuilder.R
 */
class ChangeItemAlertDialog extends org.wheatgenetics.androidlibrary.AlertDialog
{
    @java.lang.SuppressWarnings({"UnnecessaryInterfaceModifier"})
    public interface Handler { public abstract void handleChangeItemDone(); }

    // region Fields
    private final org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog.Handler
        handler;
    private android.widget.EditText                              itemEditText;
    private org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item item = null ;
    // endregion

    private void handleChangeItemDone()
    {
        if (null != this.item && null != this.itemEditText)
            this.item.setContent(org.wheatgenetics.androidlibrary.Utils.getText(this.itemEditText));
        this.cancelAlertDialog(); assert null != this.handler; this.handler.handleChangeItemDone();
    }

    ChangeItemAlertDialog(final android.app.Activity activity,
    final org.wheatgenetics.androidlibrarybuilder.mstrdtl.ChangeItemAlertDialog.Handler handler)
    { super(activity); this.handler = handler; }

    @java.lang.Override public void configure()
    {
        this.setTitle("Change Item");
        {
            final android.view.View view = this.layoutInflater().inflate(
                org.wheatgenetics.androidlibrarybuilder.R.layout.alert_dialog_change_item,
                null);
            if (null == this.itemEditText)
            {
                assert null != view; this.itemEditText = view.findViewById(
                    org.wheatgenetics.androidlibrarybuilder.R.id.itemEditText);
            }
            this.setView(view);
        }
        this.setOKPositiveButton(null).setCancelNegativeButton();
    }

    void show(final org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item item)
    {
        if (null != item && null != this.itemEditText)
        {
            this.item = item; this.itemEditText.setText(this.item.getContent());

            this.show();
            if (!this.positiveOnClickListenerHasBeenReplaced()) this.replacePositiveOnClickListener(
                new android.view.View.OnClickListener()
                {
                    @java.lang.Override public void onClick(final android.view.View v)
                    {
                        org.wheatgenetics.androidlibrarybuilder.mstrdtl
                            .ChangeItemAlertDialog.this.handleChangeItemDone();
                    }
                });
        }
    }
}