package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class Dash_Board_Activity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager food_pager;
    BottomNavigationView bottomNavigationView;
    ImageView orders;
    TextView seemore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        tabLayout = findViewById(R.id.food_tab);
        food_pager = findViewById(R.id.food_pager);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        orders = findViewById(R.id.orders);
        seemore =  findViewById(R.id.seemore);

        seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager =  getSupportFragmentManager();
                Seemore_Fragment seemore_fragment= new Seemore_Fragment();
                fragmentManager.beginTransaction().replace(R.id.dashboard, seemore_fragment).commit();


            }
        });



        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dash_Board_Activity.this, order.class);
                startActivity(intent);
            }
        });




        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.fav:
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.person:
                        startActivity(new Intent(getApplicationContext(), Profile_Activity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.history:
                        startActivity(new Intent(getApplicationContext(), history.class));
                        overridePendingTransition(0,0);
                        return true;
                }


                return false;
            }
        });

        tabLayout.addTab(tabLayout.newTab().setText("Food"));
        tabLayout.addTab(tabLayout.newTab().setText("Drinks"));
        tabLayout.addTab(tabLayout.newTab().setText("Snacks"));
        tabLayout.addTab(tabLayout.newTab().setText("Beverage"));
        tabLayout.addTab(tabLayout.newTab().setText("Biryani"));
        tabLayout.addTab(tabLayout.newTab().setText("Pizza"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final FooditemAdapter adapter = new FooditemAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        food_pager.setAdapter(adapter);


        food_pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                food_pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}