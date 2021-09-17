package com.example.foodapp;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class FooditemAdapter extends FragmentPagerAdapter {

    int tabCounts;

    public FooditemAdapter(@NonNull FragmentManager fm, int tabCounts){
        super(fm);
        this.tabCounts = tabCounts;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                FoodsFragment foodsFragment = new FoodsFragment();
                return  foodsFragment;
            case 1:
                FoodsFragment2 foodsFragment2 = new FoodsFragment2();
                return  foodsFragment2;
            case 2:
                FoodsFragment3 foodsFragment3 = new FoodsFragment3();
                return  foodsFragment3;
            case 3:
                FoodsFragment4 foodsFragment4 = new FoodsFragment4();
                return  foodsFragment4;
            case 4:
                FoodsFragment5 foodsFragment5 = new FoodsFragment5();
                return  foodsFragment5;
            case 5:
                FoodsFragment6 foodsFragment6 = new FoodsFragment6();
                return  foodsFragment6;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
