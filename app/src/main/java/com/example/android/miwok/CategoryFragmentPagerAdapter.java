package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mehrnoosh on 11/5/2017.
 */
public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[] { "Numbers", "Family", "Colors","Phrases" };

    private Fragment[] fragments = new Fragment[] { new NumbersFragment(), new FamilyMembersFragment(),  new ColorsFragment(), new PhrasesFragment() };

    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}