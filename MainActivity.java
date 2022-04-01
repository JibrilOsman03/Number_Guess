package com.example.number_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button StartButton = findViewById(R.id.StartButton);
        StartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                launchActivity();
            }
        });

        final Button ExitButton = findViewById(R.id.ExitButton);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                finish();
            }
        });

        final ImageButton SettingButton = findViewById(R.id.SettingButton);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                setContentView(R.layout.setting_screen);
            }
        });
    }

    public void launchActivity(){
        Intent intent = new Intent(this, DifficultyActivity.class);
        startActivity(intent);
    }




}