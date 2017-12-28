package com.android.miwok;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Números", "Cores", "Família", "Frases"};
    private Context context;

    public CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersActivity();
        } else if (position == 1){
            return new ColorsActivity();
        } else if (position == 2) {
            return new FamilyActivity();
        } else {
            return new PhrasesActivity();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
