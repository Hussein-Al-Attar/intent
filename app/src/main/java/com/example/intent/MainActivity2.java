package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            Intent intent = getIntent();
            String name = intent.getStringExtra("name");
            String age = intent.getStringExtra("age");
            String address = intent.getStringExtra("address");
            String phone = intent.getStringExtra("phone");
            // Capture the layout's TextView and set the string as its text
            TextView textViewName = findViewById(R.id.textViewName);
            TextView textViewAge = findViewById(R.id.textViewAge);
            TextView textViewAddress= findViewById(R.id.textViewAddress);
            TextView textViewPhone = findViewById(R.id.textViewPhone);
            textViewName.setText(name);
            textViewAge.setText(age);
            textViewAddress.setText(address);
            textViewPhone.setText(phone);
        }
    }
