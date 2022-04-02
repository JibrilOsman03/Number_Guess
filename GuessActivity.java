package com.example.numberguess;

import static com.example.numberguess.DifficultyActivity.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GuessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
    }

    public void buttonClicked(View v)
    {
        EditText rangeView = findViewById(R.id.rangeBox);
        String rS = rangeView.getText().toString();

        int rD = NumberGuessAlgorithm.toInt(rS);

        algorithm.guessAmount(rD);
    }
}