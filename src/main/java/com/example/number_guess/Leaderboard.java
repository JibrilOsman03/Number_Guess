package com.example.number_guess;
import com.example.number_guess.Rank;
public class Leaderboard
{
    private final Rank[] leaderboard = new Rank[10];
    private int size;
    private String difficulty;

    public Leaderboard(String difficulty)
    {
        this.size = 0;
        this.difficulty = difficulty;
    }

    public void addRank(Rank rank)
    {
        if (size < 10)
        {
            leaderboard[size] = rank;
            size++;
        }
    }

    public String [] getNames()
    {
        String [] names = new String[leaderboard.length];

        for(int i = 0; i < leaderboard.length; i++)
        {
            names[i] = leaderboard[i].getPlayerName();
        }

        return names;
    }

    public int [] getScores()
    {
        int [] scores = new int[leaderboard.length];

        for(int i = 0; i < leaderboard.length; i++)
        {
            scores[i] = leaderboard[i].getScore();
        }

        return scores;
    }

    public double [] getTime()
    {
        double [] times = new double[leaderboard.length];

        for(int i = 0; i < leaderboard.length; i++)
        {
            times[i] = leaderboard[i].getTime();
        }
        return times;
    }
}


// [name, score]