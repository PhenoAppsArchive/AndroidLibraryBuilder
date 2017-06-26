package org.wheatgenetics.usb;

/**
 * Uses:
 * android.hardware.usb.UsbDevice
 * android.hardware.usb.UsbDeviceConnection
 * android.hardware.usb.UsbEndpoint
 * android.hardware.usb.UsbInterface
 * android.hardware.usb.UsbManager
 * android.os.AsyncTask
 * android.support.annotation.NonNull
 */

class Device extends java.lang.Object
{
    static abstract class Exception extends java.lang.Exception
    { Exception(final java.lang.String message) { super(message); }}

    static class UsbDeviceIsNull extends org.wheatgenetics.usb.Device.Exception
    { UsbDeviceIsNull() { super("Device.this.usbDevice is still null."); }}

    static class UsbInterfaceIsNull extends org.wheatgenetics.usb.Device.Exception
    { UsbInterfaceIsNull() { super("Device.this.usbDevice.getInterface(0) returned null."); }}

    static class UsbDeviceConnectionIsNull extends org.wheatgenetics.usb.Device.Exception
    { UsbDeviceConnectionIsNull() { super("Device.this.usbManager.openDevice() returned null."); }}

    interface Handler
    {
        public abstract void publish    (byte             buffer[]);
        public abstract void reportError(java.lang.String message );
    }

    private static class AsyncTask
    extends android.os.AsyncTask<java.lang.Void, byte[], org.wheatgenetics.usb.Device.Exception>
    {
        private interface Handler
        {
            public abstract int  read(byte buffer[]) throws org.wheatgenetics.usb.Device.Exception;
            public abstract void publish    (byte             buffer[]);
            public abstract void reportError(java.lang.String message );
        }

        private final org.wheatgenetics.usb.Device.AsyncTask.Handler handler;

        private AsyncTask(@android.support.annotation.NonNull
        final org.wheatgenetics.usb.Device.AsyncTask.Handler handler)
        {
            super();

            assert null != handler;
            this.handler = handler;
        }

        @java.lang.Override
        protected org.wheatgenetics.usb.Device.Exception doInBackground(
        final java.lang.Void... params)
        {
            final byte buffer[] = new byte[128];
            assert null != this.handler;
            do
            {
                try { this.handler.read(buffer); }
                catch (final org.wheatgenetics.usb.Device.Exception e) { return e; }
                this.publishProgress(buffer);
            }
            while (true);
        }

        @java.lang.Override
        protected void onProgressUpdate(final byte[]... values)
        {
            assert null != this.handler;
            this.handler.publish(values[0]);
        }

        @java.lang.Override
        protected void onPostExecute(final org.wheatgenetics.usb.Device.Exception e)
        {
            assert null != e           ;
            assert null != this.handler;
            this.handler.reportError(e.getMessage());
        }
    }

    private       android.hardware.usb.UsbDevice  usbDevice ;
    private final android.hardware.usb.UsbManager usbManager;

    private org.wheatgenetics.usb.Device.Handler handler = null;

    // region Private Methods
    private java.lang.String getDeviceName()
    { return null == this.usbDevice ? null : this.usbDevice.getDeviceName(); }

    private int getProductId()
    { return null == this.usbDevice ? 0 : this.usbDevice.getProductId(); }

    private void publish(final byte[] buffer)
    { if (null != this.handler) this.handler.publish(buffer); }

    private void reportError(final java.lang.String message)
    { if (null != this.handler) this.handler.reportError(message); }
    // endregion

    // region Constructors
    // region DeviceList Constructor
    Device(final android.hardware.usb.UsbDevice usbDevice,
    @android.support.annotation.NonNull final android.hardware.usb.UsbManager usbManager)
    {
        super();

        this.usbDevice = usbDevice;

        assert null != usbManager;
        this.usbManager = usbManager;
    }
    // endregion

    // region ExtraDevice Constructor
    Device(                             final android.hardware.usb.UsbDevice       usbDevice ,
    @android.support.annotation.NonNull final android.hardware.usb.UsbManager      usbManager,
    @android.support.annotation.NonNull final org.wheatgenetics.usb.Device.Handler handler   )
    {
        this(usbDevice, usbManager);

        assert null != handler;
        this.handler = handler;
    }
    // endregion
    // endregion

    @java.lang.Override
    public java.lang.String toString()
    {
        java.lang.String returnValue = this.getDeviceName();
        if (null == returnValue) returnValue = super.toString();
        return returnValue;
    }

    // region Package Methods
    // region DeviceList Package Methods
    java.lang.String information()
    {
        if (this.usbDeviceIsNull())
            return null;
        else
            return java.lang.String.format("name=%s id=%d productId=%d vendorId=%d " +
                    "class=%d subClass=%d protocol=%d interfaceCount=%d",
                this.getDeviceName()              , this.usbDevice.getDeviceId      (),
                this.getProductId ()              , this.usbDevice.getVendorId      (),
                this.usbDevice.getDeviceClass   (), this.usbDevice.getDeviceSubclass(),
                this.usbDevice.getDeviceProtocol(), this.usbDevice.getInterfaceCount());
    }

    boolean productIdsAreEqual(final int productId)
    {
        if (this.usbDeviceIsNull())
            return false;
        else
            return 0 == productId ? false : this.getProductId() == productId;
    }
    // endregion

    // region ExtraDevice Package Methods
    boolean usbDeviceIsNull() { return null == this.usbDevice; }

    void setUsbDevice(final org.wheatgenetics.usb.Device device)
    { if (null != device) this.usbDevice = device.usbDevice; }
    // endregion

    int read(final byte buffer[]) throws org.wheatgenetics.usb.Device.Exception
    {
        if (this.usbDeviceIsNull())
            throw new org.wheatgenetics.usb.Device.UsbDeviceIsNull();
        else
        {
            android.hardware.usb.UsbEndpoint         usbEndpoint        ;
            android.hardware.usb.UsbDeviceConnection usbDeviceConnection;
            {
                final android.hardware.usb.UsbInterface usbInterface =
                    this.usbDevice.getInterface(0);
                if (null == usbInterface)
                    throw new org.wheatgenetics.usb.Device.UsbInterfaceIsNull();
                else
                {
                    usbEndpoint         = usbInterface.getEndpoint(0)               ;
                    usbDeviceConnection = this.usbManager.openDevice(this.usbDevice);

                    if (null == usbDeviceConnection)
                        throw new org.wheatgenetics.usb.Device.UsbDeviceConnectionIsNull();
                    else
                        usbDeviceConnection.claimInterface(usbInterface, true);
                }
            }
            return usbDeviceConnection.bulkTransfer(usbEndpoint, buffer,
                null == buffer ? 0 : buffer.length, /* timeout => */ 2000);
        }
    }

    void readContinuously()
    {
        final org.wheatgenetics.usb.Device.AsyncTask asyncTask =
            new org.wheatgenetics.usb.Device.AsyncTask(
                new org.wheatgenetics.usb.Device.AsyncTask.Handler()
                {
                    @java.lang.Override
                    public int read(final byte[] buffer)
                    throws org.wheatgenetics.usb.Device.Exception
                    { return org.wheatgenetics.usb.Device.this.read(buffer); }

                    @java.lang.Override
                    public void publish(final byte[] buffer)
                    { org.wheatgenetics.usb.Device.this.publish(buffer); }

                    @java.lang.Override
                    public void reportError(final java.lang.String message)
                    { org.wheatgenetics.usb.Device.this.reportError(message); }
                });
        asyncTask.execute();
    }
    // endregion
}