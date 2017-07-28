package org.wheatgenetics.androidlibrary;

/**
 * Uses:
 * android.content.Context
 * android.net.Uri
 * android.os.Environment
 *
 * org.wheatgenetics.javalib.Dir
 *
 * org.wheatgenetics.androidlibrary.Utils
 */
public class Dir extends org.wheatgenetics.javalib.Dir
{
    private final android.content.Context context;

    public Dir(final android.content.Context context, final java.lang.String name,
    final java.lang.String blankHiddenFileName)
    {
        super(android.os.Environment.getExternalStorageDirectory(), name, blankHiddenFileName);

        assert null != context;
        this.context = context;
    }

    @java.lang.Override
    public java.io.File createIfMissing() throws java.io.IOException
    {
        final java.io.File blankHiddenFile = super.createIfMissing();
        org.wheatgenetics.androidlibrary.Utils.makeFileDiscoverable(this.context, blankHiddenFile);
        return blankHiddenFile;
    }

    public android.net.Uri parse(final java.lang.String fileName)
    { return android.net.Uri.parse(this.path.toString() + fileName); }
}