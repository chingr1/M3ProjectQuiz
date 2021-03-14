package com.example.m2project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;


public class Login extends AppCompatActivity{
    // load values
    private Button bLogin, tvRegisterLink;
    private EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // set values
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegisterLink = (Button) findViewById(R.id.tvRegisterLink);
        }

    public void loginOnClick(View v) {
        // checks whether the email field is empty
        // you must type in an email for you to advance
        if (TextUtils.isEmpty(etEmail.getText())) {
            etEmail.setError("Please enter an email");
        } else {
            // this moves you to the welcome page (main page)
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    }
     public void registerOnClick(View v){
            // leads you to the register page
            Intent i = new Intent(this, Register.class);
            startActivity(i);
            finish();
        }

        }

