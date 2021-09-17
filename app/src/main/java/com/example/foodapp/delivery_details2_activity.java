package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class delivery_details2_activity extends AppCompatActivity {

    Button btn_cancel, btn_proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_details2);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_proceed =  findViewById(R.id.btn_proceed);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(delivery_details2_activity.this, payment_details_Activity.class);
                startActivity(intent);
            }
        });
    }
}