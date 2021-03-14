package com.example.m2project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {
    // set values
    private Button bRegister;
    private EditText etFirstName, etLastName, etDoB, etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // get values for each field
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etDoB = (EditText) findViewById(R.id.etDoB);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        // set on click listener
        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // validates the information
        // must fill in text fields in order to proceed
        if (TextUtils.isEmpty(etFirstName.getText())) {
            etFirstName.setError("Please enter your First Name");

            if (TextUtils.isEmpty(etLastName.getText())) {
                etLastName.setError("Please enter your Last Name");

                if (TextUtils.isEmpty(etDoB.getText())) {
                    etDoB.setError("Please enter your Date of Birth");


                    if (TextUtils.isEmpty(etEmail.getText())) {
                        etEmail.setError("Please enter your Email Address");


                        if (TextUtils.isEmpty(etPassword.getText())) {
                            etPassword.setError("Please enter a Password");

                        }

                    } else {
                        // this moves you to the welcome page (main page)
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);

                    }
                }

            }
        }
    }
}
