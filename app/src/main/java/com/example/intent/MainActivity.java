package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextAge;
    EditText editTextAddress;
    EditText editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextAge = (EditText) findViewById(R.id.editTextNumberAge);
        editTextAddress = (EditText) findViewById(R.id.address);
        editTextPhone = (EditText) findViewById(R.id.editTextPhone);
            }

    public void SB(View view) {

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("name", editTextName.getText().toString());
            intent.putExtra("age", editTextAge.getText().toString());
            intent.putExtra("address", editTextAddress.getText().toString());
            intent.putExtra("phone", editTextPhone.getText().toString());
            startActivity(intent);

    }
}

