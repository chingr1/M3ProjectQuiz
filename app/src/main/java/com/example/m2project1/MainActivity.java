package com.example.m2project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // set splash timer
    // set button + editText
    private final int SPLASH_DISPLAY_LENGTH = 1000;
    private Button bContinue;
    private EditText etWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find values
        etWelcome = (EditText) findViewById(R.id.etWelcome);
        bContinue = (Button) findViewById(R.id.bContinue);
        bContinue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // first intent to move to next screen on click of button
        Intent i=new Intent(this, Login.class);
        startActivity(i);
        }
    }
