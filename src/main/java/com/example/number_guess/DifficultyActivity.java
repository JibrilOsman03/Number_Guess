package com.example.number_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.number_guess;

public class DifficultyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty_screen);
        final Button Easy_button = findViewById(R.id.Easy_button);
        final Button Medium_button = findViewById(R.id.Medium_Button);
        final Button Hard_button = findViewById(R.id.Hard_button);
        final Button Speed_button = findViewById(R.id.Speed_button);
        final Button Back1 = findViewById(R.id.button5);
        //String mode = "";
        Easy_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                NumberGuessAlgorithm guesser = new NumberGuessAlgorithm("Easy");
                setContentView(R.layout.input_range_screen);
            }
        });
        Medium_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                NumberGuessAlgorithm guesser = new NumberGuessAlgorithm("Medium");
                setContentView(R.layout.input_range_screen);
            }
        });
        Hard_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                NumberGuessAlgorithm guesser = new NumberGuessAlgorithm("Hard");
                setContentView(R.layout.input_range_screen);
            }
        });
        Speed_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                NumberGuessAlgorithm guesser = new NumberGuessAlgorithm("Speed");
                setContentView(R.layout.input_range_screen);
            }
        });
        Back1.setOnClickListener(new View.OnClickListener() {
            public void onClick(android.view.View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }
}
