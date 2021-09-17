package com.example.foodapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.foodapp.LoginFragment;
import com.example.foodapp.SignupFragment;


public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int tablayout;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.tablayout = totalTabs;
    }

    @Override
    public int getCount() {
        return tablayout;
    }
    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginFragment loginFragment= new LoginFragment();
                return loginFragment;
            case 1:
                SignupFragment signupFragment= new SignupFragment();
                return signupFragment;
            default:
                return null;
        }
    }

}


