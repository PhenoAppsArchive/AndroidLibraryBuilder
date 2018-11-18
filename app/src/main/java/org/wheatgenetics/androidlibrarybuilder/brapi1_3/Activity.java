package org.wheatgenetics.androidlibrarybuilder.brapi1_3;

/**
 * Uses:
 * android.content.res.Resources
 * android.os.Bundle
 * android.support.annotation.IntRange
 * android.support.annotation.MenuRes
 * android.support.annotation.NonNull
 * android.support.annotation.Size
 * android.support.v4.app.Fragment
 * android.support.v4.app.FragmentManager
 * android.support.v4.app.FragmentPagerAdapter
 * android.support.v4.view.ViewPager
 * android.support.v4.view.ViewPager.OnPageChangeListener
 * android.support.v7.app.AppCompatActivity
 * android.support.v7.widget.Toolbar
 * android.view.Menu
 * android.view.MenuItem
 *
 * org.wheatgenetics.androidlibrarybuilder.R
 *
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.CallsFragment
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.CropsFragment
 * _org.wheatgenetics.androidlibrarybuilder.brapi1_3.LocationsFragment
 * _org.wheatgenetics.androidlibrarybuilder.brapi1_3.ProgramsFragment
 * org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment
 * _org.wheatgenetics.androidlibrarybuilder.brapi1_3.StudiesFragment
 * _org.wheatgenetics.androidlibrarybuilder.brapi1_3.TrialsFragment
 */
public class Activity extends android.support.v7.app.AppCompatActivity
{
    private static class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter
    {
        private FragmentPagerAdapter(@android.support.annotation.NonNull
        final android.support.v4.app.FragmentManager fragmentManager) { super(fragmentManager); }

        // region Overridden Methods
        /** getItem() is called to instantiate the fragment for the given page. */
        @java.lang.Override public android.support.v4.app.Fragment getItem(final int position)
        {
            switch (position)
            {
                case 0: return new org.wheatgenetics.androidlibrarybuilder.brapi1_3.CallsFragment();
                case 1: return new org.wheatgenetics.androidlibrarybuilder.brapi1_3.CropsFragment();

                case 2: return
                    //new org.wheatgenetics.androidlibrarybuilder.brapi1_3.ProgramsFragment();
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Programs");

                case 3: return
                    //new org.wheatgenetics.androidlibrarybuilder.brapi1_3.LocationsFragment();
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Locations");

                case 4: return
                    //new org.wheatgenetics.androidlibrarybuilder.brapi1_3.TrialsFragment();
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Trials");

                case 5: return
                    //new org.wheatgenetics.androidlibrarybuilder.brapi1_3.StudiesFragment();
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Studies");

                case 6: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Observations");

                case 7: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "ObservationVariables");

                case 8: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Phenotypes");

                case 9: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Germplasm");

                case 10: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "GermplasmAttributes");

                case 11: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Markers");

                case 12: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "MarkerProfiles");

                case 13: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "GenomeMaps");

                case 14: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Samples");

                case 15: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Vendor");

                case 16: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Lists");

                case 17: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "Images");

                case 18: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "People");

                case 19: return
                    org.wheatgenetics.androidlibrarybuilder.brapi1_3.StubFragment.instantiate(
                        "SearchServices");

                default: return null;
            }
        }

        @java.lang.Override public int getCount() { return 20; }
        // endregion
    }

    // region Fields
    private java.lang.String                  resourceNames[] = null;
    private android.support.v7.widget.Toolbar toolbar         = null;
    private android.support.v4.view.ViewPager viewPager       = null;
    // endregion

    // region Private Methods
    private void setToolBarTitle(@android.support.annotation.IntRange(from = 0) final int i)
    {
        if (null != this.toolbar) this.toolbar.setTitle(this.getString(
            org.wheatgenetics.androidlibrarybuilder.R.string.title_toolbar_brapi1_3,
            this.resourceNames[i]                                                  ));
    }

    private void setPage(@android.support.annotation.NonNull
    @android.support.annotation.Size(min = 1) final java.lang.CharSequence selectedResourceName)
    {
        if (null != this.viewPager)
        {
            int i = 0;
            for (final java.lang.String resourceName: this.resourceNames)
            {
                if (selectedResourceName.equals(resourceName))
                    { this.viewPager.setCurrentItem(i); break; }
                i++;
            }
        }
    }
    // endregion

    // region Overridden Methods
    @java.lang.Override protected void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(org.wheatgenetics.androidlibrarybuilder.R.layout.activity_brapi1_3);

        {
            final android.content.res.Resources resources = this.getResources();
            if (null != resources) this.resourceNames = resources.getStringArray(
                org.wheatgenetics.androidlibrarybuilder.R.array.resourceNames);
        }

        this.toolbar = this.findViewById(
            org.wheatgenetics.androidlibrarybuilder.R.id.toolbar);            // From layout/acti-
        this.setSupportActionBar(this.toolbar);                               //  vity_brapi1_3.xml.
        { final int firstResourceName = 0; this.setToolBarTitle(firstResourceName); }

        this.viewPager = this.findViewById(
            org.wheatgenetics.androidlibrarybuilder.R.id.view_pager);         // From layout/acti-
        if (null != this.viewPager)                                           //  vity_brapi1_3.xml.
        {
            this.viewPager.setAdapter(
                new org.wheatgenetics.androidlibrarybuilder.brapi1_3.Activity.FragmentPagerAdapter(
                    this.getSupportFragmentManager()));

            this.viewPager.addOnPageChangeListener(
                new android.support.v4.view.ViewPager.OnPageChangeListener()
                {
                    @java.lang.Override
                    public void onPageScrolled(final int i, final float v, final int i1) {}

                    @java.lang.Override public void onPageSelected(final int i)
                    {
                        org.wheatgenetics.androidlibrarybuilder.brapi1_3.Activity
                            .this.setToolBarTitle(i);
                    }

                    @java.lang.Override public void onPageScrollStateChanged(final int i) {}
                });
        }
    }

    @java.lang.Override public boolean onCreateOptionsMenu(final android.view.Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.getMenuInflater().inflate(
            org.wheatgenetics.androidlibrarybuilder.R.menu.menu_brapi1_3, menu);
        return true;
    }

    @java.lang.Override public boolean onOptionsItemSelected(final android.view.MenuItem menuItem)
    {
        // Handle action bar menuItem clicks here.  The action bar will automatically handle clicks
        // on the Home/Up button so long as you specify a parent activity in AndroidManifest.xml.
        assert null != menuItem;
        @android.support.annotation.MenuRes final int id = menuItem.getItemId();

        // The id values in the following switch statement are from menu/menu_brapi1_3.xml.
        switch (id)
        {
            case org.wheatgenetics.androidlibrarybuilder.R.id.CallsMenuItemId               :
            case org.wheatgenetics.androidlibrarybuilder.R.id.CropsMenuItemId               :
            case org.wheatgenetics.androidlibrarybuilder.R.id.ProgramsMenuItemId            :
            case org.wheatgenetics.androidlibrarybuilder.R.id.LocationsMenuItemId           :
            case org.wheatgenetics.androidlibrarybuilder.R.id.TrialsMenuItemId              :
            case org.wheatgenetics.androidlibrarybuilder.R.id.StudiesMenuItemId             :
            case org.wheatgenetics.androidlibrarybuilder.R.id.ObservationsMenuItemId        :
            case org.wheatgenetics.androidlibrarybuilder.R.id.ObservationVariablesMenuItemId:
            case org.wheatgenetics.androidlibrarybuilder.R.id.PhenotypesMenuItemId          :
            case org.wheatgenetics.androidlibrarybuilder.R.id.GermplasmMenuItemId           :
            case org.wheatgenetics.androidlibrarybuilder.R.id.GermplasmAttributesMenuItemId :
            case org.wheatgenetics.androidlibrarybuilder.R.id.MarkersMenuItemId             :
            case org.wheatgenetics.androidlibrarybuilder.R.id.MarkerProfilesMenuItemId      :
            case org.wheatgenetics.androidlibrarybuilder.R.id.GenomeMapsMenuItemId          :
            case org.wheatgenetics.androidlibrarybuilder.R.id.SamplesMenuItemId             :
            case org.wheatgenetics.androidlibrarybuilder.R.id.VendorMenuItemId              :
            case org.wheatgenetics.androidlibrarybuilder.R.id.ListsMenuItemId               :
            case org.wheatgenetics.androidlibrarybuilder.R.id.ImagesMenuItemId              :
            case org.wheatgenetics.androidlibrarybuilder.R.id.PeopleMenuItemId              :
            case org.wheatgenetics.androidlibrarybuilder.R.id.SearchServicesMenuItemId      :
                this.setPage(menuItem.getTitle()); return true;

            default: return super.onOptionsItemSelected(menuItem);
        }
    }

    @java.lang.Override protected void onDestroy()
    { if (null != this.viewPager) this.viewPager.clearOnPageChangeListeners(); super.onDestroy(); }
    // endregion
}