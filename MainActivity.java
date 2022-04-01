package com.example.number_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureStartButton();
        configureExitButton();
        configureSettingsButton();
    }

    private void configureStartButton()
    {
        Button StartButton = findViewById(R.id.StartButton);
        StartButton.setOnClickListener(view -> startActivity(new Intent(this, DifficultyActivity.class)));
    }


    private void configureSettingsButton()
    {
        ImageButton settingsButton = findViewById(R.id.SettingButton);
        settingsButton.setOnClickListener(view -> startActivity(new Intent(this, SettingsActivity.class)));
    }

    private void configureExitButton()
    {
        Button ExitButton = findViewById(R.id.ExitButton);
        ExitButton.setOnClickListener(view -> finish());
    }
}