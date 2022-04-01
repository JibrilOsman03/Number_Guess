package com.example.numberguess;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureStartButton();
        configureExitButton();
    }

    private void configureStartButton()
    {
        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, DifficultyActivity.class)));
    }

    private void configureExitButton()
    {
        Button exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(view -> finish());
    }


}