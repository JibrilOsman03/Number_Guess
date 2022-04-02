package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.numberguess.DifficultyActivity.algorithm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputRangeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_range);

        configureBackButton();
        configureConfirmButton();
    }

    private void configureBackButton()
    {
        Button BackButton = findViewById(R.id.backButtonRange);
        BackButton.setOnClickListener(view -> finish());
    }

    public void buttonClicked(View v)
    {
        EditText rangeView = findViewById(R.id.rangeBox);
        String rS = rangeView.getText().toString();

        int rD = NumberGuessAlgorithm.toInt(rS);

        algorithm.guessAmount(rD);
    }

    private void configureConfirmButton()
    {
        Button ConfirmButton = findViewById(R.id.confirmButton);
        ConfirmButton.setOnClickListener(view -> startActivity(new Intent(InputRangeActivity.this, GuessActivity.class)));
    }

}