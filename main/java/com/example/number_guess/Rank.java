package com.example.number_guess;

public class Rank
{
    private String playerName;
    private boolean isSpeed;
    private double time;
    private int score;
    private String difficulty;

    public Rank (String playerName, int score, String difficulty)
    {
        this.playerName = playerName;
        this.score = score;
        this.difficulty = difficulty;
    }

    public Rank (String playerName, boolean isSpeed, double time, int score, String difficulty)
    {
        this.playerName = playerName;
        this.isSpeed = isSpeed;
        this.time = time;
        this.score = score;
        this.difficulty = difficulty;
    }

    public void setPlayerName (String playerName)
    {
        this.playerName = playerName;
    }

    public void setIsSpeed (boolean isSpeed)
    {
        this.isSpeed = isSpeed;
    }

    public void setTime (double time)
    {
        this.time = time;
    }

    public void setScore (int score)
    {
        this.score = score;
    }

    public void setDifficulty (String difficulty)
    {
        this.difficulty = difficulty;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public Boolean getIsSpeed()
    {
        return isSpeed;
    }
    public double getTime()
    {
        return time;
    }

    public int getScore()
    {
        return score;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

}
