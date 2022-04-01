package com.example.number_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.number_guess;

public class SettingsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_screen);

        final Button BackButton = findViewById(R.id.Back_button);
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v)
            {
                startActivity(new Intent(SettingsActivity.this, MainActivity.class));
            }
        });
    }

    private void goBack()
    {
        Intent goBack = new Intent(this, MainActivity.class);
        goBack.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goBack);
    }

}