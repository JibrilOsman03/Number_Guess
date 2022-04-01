package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class InputRangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_range);

        configureBackButton();
    }


    private void configureBackButton()
    {
        Button BackButton = findViewById(R.id.backButtonRange);
        BackButton.setOnClickListener(view -> finish());
    }
}