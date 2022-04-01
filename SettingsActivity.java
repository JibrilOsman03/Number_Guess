package com.example.number_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

//import com.example.number_guess;

public class SettingsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_screen);

        configureBackButton();
    }

    private void configureBackButton()
    {
        Button BackButton = findViewById(R.id.Back_button);
        BackButton.setOnClickListener(view -> finish());
    }

}