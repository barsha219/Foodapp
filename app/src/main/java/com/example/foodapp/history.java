package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class history extends AppCompatActivity {

    Button startorderbtn;
    ImageView imageview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        imageview6 = findViewById(R.id.imageview6);
        imageview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        startorderbtn = findViewById(R.id.startorderbtn);
        startorderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(history.this, Dash_Board_Activity.class);
                startActivity(intent);
            }
        });
    }
}