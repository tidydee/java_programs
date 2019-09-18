package com.dspamer;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        //Challenge/////////////
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters <0.0) {
            System.out.println("INVALID PARAMETERS");
        }

        calcFeetAndInchesToCentimeters(157);
        /////////////////////////
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 100;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Player scored " + score + " points.");
//        return score * 100;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score.");
//        return 0;
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("INVALID FEET OR INCHES");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("INVALID INCHES");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

