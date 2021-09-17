package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Food_detail_activity extends AppCompatActivity {

    ImageView backicon;
    TextView food_Name, food_Prc;
    ImageView food_image;
    Button add_to_cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        backicon =  findViewById(R.id.backicon);
        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();

        food_Name =  findViewById(R.id.food_Name);
        food_Prc = findViewById(R.id.food_Prc);
        food_image = findViewById(R.id.food_image);
        add_to_cart =  findViewById(R.id.add_to_cart);

        food_Name.setText(intent.getStringExtra("food_name"));
        food_Prc.setText(intent.getStringExtra("food_price"));
        food_image.setImageResource(intent.getIntExtra("food_image", R.drawable.img2));
        add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_detail_activity.this, delivery_details_activity.class);
                startActivity(intent);
            }
        });
    }
}