package com.example.numberguess;

import static com.example.numberguess.MainActivity.rankings;
import com.example.numberguess.Leaderboard;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EasyBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        configureBackButton();
        LeaderboardRank[] ranking = rankings.getLeaderboard("Easy");
        TextView name1 = findViewById(R.id.textView5);
        TextView name2 = findViewById(R.id.textView6);
        TextView name3 = findViewById(R.id.textView7);
        TextView name4 = findViewById(R.id.textView8);
        TextView name5 = findViewById(R.id.textView9);
        TextView score1 = findViewById(R.id.textView10);
        TextView score2 = findViewById(R.id.textView11);
        TextView score3 = findViewById(R.id.textView12);
        TextView score4 = findViewById(R.id.textView13);
        TextView score5 = findViewById(R.id.textView14);

        if(!(ranking[0] == null))
            name1.setText(ranking[0].getName());
        if(!(ranking[1] == null))
            name2.setText(ranking[1].getName());
        if(!(ranking[2] == null))
            name3.setText(ranking[2].getName());
        if(!(ranking[3] == null))
            name4.setText(ranking[3].getName());
        if(!(ranking[4] == null))
            name5.setText(ranking[4].getName());

        if(!(ranking[0] == null))
            score1.setText(ranking[0].getScore());
        if(!(ranking[1] == null))
            score2.setText(ranking[1].getScore());
        if(!(ranking[2] == null))
            score3.setText(ranking[2].getScore());
        if(!(ranking[3] == null))
            score4.setText(ranking[3].getScore());
        if(!(ranking[4] == null))
            score5.setText(ranking[4].getScore());
    }

    private void configureBackButton()
    {
        Button backButton = findViewById(R.id.button5);
        backButton.setOnClickListener(view -> startActivity(new Intent(this, GuessActivity.class)));
    }
}
