package org.wheatgenetics.androidlibrarybuilder.mstrdtl;

/**
 * Uses:
 * android.support.annotation.IntRange
 * android.support.annotation.NonNull
 * android.support.annotation.Nullable
 *
 * org.wheatgenetics.javalib.mstrdtl.Item
 * org.wheatgenetics.javalib.mstrdtl.Items
 *
 * org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item
 */
@java.lang.SuppressWarnings({"ClassExplicitlyExtendsObject"})
class Items extends java.lang.Object implements org.wheatgenetics.javalib.mstrdtl.Items
{
    // region Fields
    private java.util.List<org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item>            // lazy
        itemsInstance = null;                                                               //  load
    private static org.wheatgenetics.androidlibrarybuilder.mstrdtl.Items                    // lazy
        ITEMS_INSTANCE = null;                                                              //  load
    // endregion

    @android.support.annotation.NonNull @java.lang.SuppressWarnings({"Convert2Diamond"})
    private java.util.List<org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item> items()
    {
        if (null == this.itemsInstance) this.itemsInstance =
            new java.util.ArrayList<org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item>();
        return this.itemsInstance;
    }

    // region Overridden Methods
    @java.lang.Override
    public void add(@android.support.annotation.NonNull org.wheatgenetics.javalib.mstrdtl.Item item)
    { this.items().add((org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item) item); }

    @android.support.annotation.IntRange(from = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
    @java.lang.Override public int size()
    { return null == this.itemsInstance ? 0 : this.itemsInstance.size(); }

    @android.support.annotation.Nullable @java.lang.Override
    public org.wheatgenetics.javalib.mstrdtl.Item get(
    @android.support.annotation.IntRange(from = org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
        final int position)
    {
        if (position < org.wheatgenetics.javalib.mstrdtl.Item.MIN_POSITION)
            throw new java.lang.IllegalArgumentException(
                org.wheatgenetics.javalib.mstrdtl.Item.TOO_SMALL_POSITION_MESSAGE);
        return null == this.itemsInstance ? null : this.itemsInstance.get(position);
    }
    // endregion

    static org.wheatgenetics.androidlibrarybuilder.mstrdtl.Items ITEMS()
    {
        if (null == ITEMS_INSTANCE)
        {
            ITEMS_INSTANCE = new org.wheatgenetics.androidlibrarybuilder.mstrdtl.Items();

            final int MAX_POSITION = 24;
            for (int position = org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item.MIN_POSITION;
            position <= MAX_POSITION; position++)
                ITEMS_INSTANCE.add(
                    new org.wheatgenetics.androidlibrarybuilder.mstrdtl.Item(position));
        }
        return ITEMS_INSTANCE;
    }
}