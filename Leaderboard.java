package com.example.numberguess;

public class Leaderboard {
    private LeaderboardRank[] EasyBoard;
    private LeaderboardRank[] MediumBoard;
    private LeaderboardRank[] HardBoard;
    private LeaderboardRank[] SpeedBoard;

    public Leaderboard(){
        this.EasyBoard = new LeaderboardRank[5];
        this.MediumBoard = new LeaderboardRank[5];
        this.HardBoard = new LeaderboardRank[5];
        this.SpeedBoard = new LeaderboardRank[5];
    }

    public void addToLeaderboard(LeaderboardRank add){
        int maxScore = 0;
        int minScore = 1000000000;
        String mode = add.getMode();
        if(mode.equals("Easy")){
            for(int i = 0; i < 5; i++){
                if (!(this.EasyBoard[i] == null) && this.EasyBoard[i].getScore() > maxScore){
                    maxScore = this.EasyBoard[i].getScore();
                }
                if (!(this.EasyBoard[i] == null) && this.EasyBoard[i].getScore() < minScore){
                    minScore = this.EasyBoard[i].getScore();
                }
            }

            if(add.getScore() > maxScore || this.EasyBoard[0] == null) {
                this.EasyBoard[4] = this.EasyBoard[3];
                this.EasyBoard[3] = this.EasyBoard[2];
                this.EasyBoard[2] = this.EasyBoard[1];
                this.EasyBoard[1] = this.EasyBoard[0];
                this.EasyBoard[0] = add;
                minScore = add.getScore();
                maxScore = add.getScore();
            }

            if(add.getScore() < maxScore && add.getScore() > minScore){
                for(int i = 4; i > -1; i--){
                    if(add.getScore() > this.EasyBoard[i].getScore()) {
                        for (int j = 3; j < i; j++) {
                            this.EasyBoard[j + 1] = this.EasyBoard[j];
                        }
                        this.EasyBoard[i] = add;
                    }
                }
            }
        }
        if(mode.equals("Medium")){
            for(int i = 0; i < 5; i++){
                if (!(this.MediumBoard[i] == null) && this.MediumBoard[i].getScore() > maxScore){
                    maxScore = this.MediumBoard[i].getScore();
                }
                if (!(this.MediumBoard[i] == null) && this.MediumBoard[i].getScore() < minScore){
                    minScore = this.MediumBoard[i].getScore();
                }
            }

            if(add.getScore() > maxScore || this.MediumBoard[0] == null) {
                this.MediumBoard[4] = this.MediumBoard[3];
                this.MediumBoard[3] = this.MediumBoard[2];
                this.MediumBoard[2] = this.MediumBoard[1];
                this.MediumBoard[1] = this.MediumBoard[0];
                this.MediumBoard[0] = add;
                minScore = add.getScore();
                maxScore = add.getScore();
            }

            if(add.getScore() < maxScore && add.getScore() > minScore){
                for(int i = 4; i > -1; i--){
                    if(add.getScore() > this.MediumBoard[i].getScore()) {
                        for (int j = 3; j < i; j++) {
                            this.MediumBoard[j + 1] = this.MediumBoard[j];
                        }
                        this.MediumBoard[i] = add;
                    }
                }
            }
        }
        if(mode.equals("Hard")){
            for(int i = 0; i < 5; i++){
                if (!(this.HardBoard[i] == null) && this.HardBoard[i].getScore() > maxScore){
                    maxScore = this.HardBoard[i].getScore();
                }
                if (!(this.HardBoard[i] == null) && this.HardBoard[i].getScore() < minScore){
                    minScore = this.HardBoard[i].getScore();
                }
            }

            if(add.getScore() > maxScore || this.HardBoard[0] == null) {
                this.HardBoard[4] = this.HardBoard[3];
                this.HardBoard[3] = this.HardBoard[2];
                this.HardBoard[2] = this.HardBoard[1];
                this.HardBoard[1] = this.HardBoard[0];
                this.HardBoard[0] = add;
                minScore = add.getScore();
                maxScore = add.getScore();
            }

            if(add.getScore() < maxScore && add.getScore() > minScore){
                for(int i = 4; i > -1; i--){
                    if(add.getScore() > this.HardBoard[i].getScore()) {
                        for (int j = 3; j < i; j++) {
                            this.HardBoard[j + 1] = this.HardBoard[j];
                        }
                        this.HardBoard[i] = add;
                    }
                }
            }
        }
        if(mode.equals("Speed")){
            for(int i = 0; i < 5; i++){
                if (!(this.SpeedBoard[i] == null) && this.SpeedBoard[i].getScore() > maxScore){
                    maxScore = this.SpeedBoard[i].getScore();
                }
                if (!(this.SpeedBoard[i] == null) && this.SpeedBoard[i].getScore() < minScore){
                    minScore = this.SpeedBoard[i].getScore();
                }
            }

            if(add.getScore() > maxScore || this.SpeedBoard[0] == null) {
                this.SpeedBoard[4] = this.SpeedBoard[3];
                this.SpeedBoard[3] = this.SpeedBoard[2];
                this.SpeedBoard[2] = this.SpeedBoard[1];
                this.SpeedBoard[1] = this.SpeedBoard[0];
                this.SpeedBoard[0] = add;
                minScore = add.getScore();
                maxScore = add.getScore();
            }

            if(add.getScore() < maxScore && add.getScore() > minScore){
                for(int i = 4; i > -1; i--){
                    if(add.getScore() > this.SpeedBoard[i].getScore()) {
                        for (int j = 3; j < i; j++) {
                            this.SpeedBoard[j + 1] = this.SpeedBoard[j];
                        }
                        this.SpeedBoard[i] = add;
                    }
                }
            }
        }
    }

    public LeaderboardRank[] getLeaderboard(String mode){
        if(mode.equals("Easy")){
            return this.EasyBoard;
        }
        if(mode.equals("Medium")){
            return this.MediumBoard;
        }
        if(mode.equals("Hard")){
            return this.HardBoard;
        }
        else
            return this.SpeedBoard;
    }
}
