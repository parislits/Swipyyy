package com.example.paris.swipyyy;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class Adapter extends FragmentPagerAdapter {

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new First_fragment();
            case 1:
                return new Second_fragment();
            case 2:
                return new Third_fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        //posa tabs uparxoun
        return 3;
    }

}
