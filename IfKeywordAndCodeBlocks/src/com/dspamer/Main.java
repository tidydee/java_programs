package com.dspamer;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int levelCompleted = 5;
        int bonus = 100;
        int score = 800;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else{
//            System.out.println("Got here :)");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        levelCompleted = 8;
        bonus = 200;
        score = 10000;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
