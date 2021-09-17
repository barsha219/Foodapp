package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class payment_details_Activity extends AppCompatActivity {

    ImageView imgview1;
    RadioGroup radiogrp1, radiogrp2;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        radiogrp1 = findViewById(R.id.radiogrp1);
        radiogrp2 = findViewById(R.id.radiogrp2);

        imgview1 = findViewById(R.id.imgview1);
        imgview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void checkButton(View v){
        int radioID = radiogrp1.getCheckedRadioButtonId();
        int radioID1 = radiogrp2.getCheckedRadioButtonId();
        radioButton = findViewById(radioID);
        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}