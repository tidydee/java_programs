package com.dspamer;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 800;
        levelCompleted = 5;
        bonus = 100;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        String playerName = "Dave";
        int myScore = 1500;
        int position = calculateHighScorePosition(myScore);
        displayHighScorePosition( playerName, position);

        myScore = 900;
        position = calculateHighScorePosition(myScore);
        displayHighScorePosition( playerName, position);

        myScore = 400;
        position = calculateHighScorePosition(myScore);
        displayHighScorePosition( playerName, position);

        myScore = 50;
        position = calculateHighScorePosition(myScore);
        displayHighScorePosition( playerName, position);

        myScore = 1000;
        playerName = "Peter";
        position = calculateHighScorePosition(myScore);
        displayHighScorePosition( playerName, position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition( String playerName, int position) {
        System.out.println("Congrats " + playerName + " you managed to reach position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int highScore) {
        if (highScore >= 1000) {
            return 1;
        } else if (highScore > 500 && highScore < 1000) {
            return 2;
        } else if (highScore > 100 && highScore  < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
