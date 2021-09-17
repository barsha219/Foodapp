package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class delivery_details_activity extends AppCompatActivity {

    Button propayment;
    ImageView imgview;
    RadioGroup radiogrp;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details);

        radiogrp = findViewById(R.id.radiogrp);

        imgview = findViewById(R.id.imgview);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        propayment = findViewById(R.id.propayment);
        propayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(delivery_details_activity.this, delivery_details2_activity.class);
                startActivity(intent);
            }
        });
    }
    public void checkButton(View v){
        int radioID = radiogrp.getCheckedRadioButtonId();
        radioButton = findViewById(radioID);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }
}