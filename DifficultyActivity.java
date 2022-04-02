package com.example.numberguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DifficultyActivity extends AppCompatActivity
{
    public static NumberGuessAlgorithm algorithm;
    String difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        configureEasyButton();
        configureMediumButton();
        configureHardButton();
        configureSpeedButton();
        configureBackButton();
    }

    private void configureEasyButton()
    {
        Button easyButton = findViewById(R.id.easyButton);
        easyButton.setOnClickListener(view -> startActivity(new Intent(DifficultyActivity.this, InputRangeActivity.class)));

        difficulty = "Easy";

        NumberGuessAlgorithm algorithm = new NumberGuessAlgorithm(difficulty);
        System.out.println(algorithm.getGuessesLeft());
    }

    private void configureMediumButton()
    {
        Button mediumButton = findViewById(R.id.mediumButton);
        mediumButton.setOnClickListener(view -> startActivity(new Intent(DifficultyActivity.this, InputRangeActivity.class)));

        difficulty = "Medium";

        NumberGuessAlgorithm algorithm = new NumberGuessAlgorithm(difficulty);
        System.out.println(algorithm.getGuessesLeft());
    }

    private void configureHardButton()
    {
        Button hardButton = findViewById(R.id.hardButton);
        hardButton.setOnClickListener(view -> startActivity(new Intent(DifficultyActivity.this, InputRangeActivity.class)));

        difficulty = "Hard";

        NumberGuessAlgorithm algorithm = new NumberGuessAlgorithm(difficulty);
        System.out.println(algorithm.getGuessesLeft());
    }

    private void configureSpeedButton()
    {
        Button speedButton = findViewById(R.id.speedButton);
        speedButton.setOnClickListener(view -> startActivity(new Intent(DifficultyActivity.this, InputRangeActivity.class)));

        difficulty = "Speed";

        NumberGuessAlgorithm algorithm = new NumberGuessAlgorithm(difficulty);
        System.out.println(algorithm.getGuessesLeft());
    }

    private void configureBackButton()
    {
        Button BackButton = findViewById(R.id.backButton);
        BackButton.setOnClickListener(view -> finish());
    }

}