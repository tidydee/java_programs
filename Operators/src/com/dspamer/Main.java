package com.dspamer;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien!");
        else
            System.out.println("ALIEN ALERT!!!");

        int topScore = 200;

        if (topScore <= 199)
            System.out.println("You got the high score!!!");
        else if (topScore >= 200)
            System.out.println("BEST SCORE EVER!!!");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not suppose to happen.");
        else
            System.out.println("ALL GOOD HERE SIR!");

        //turnary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar = true");
        else
            System.out.println("wasCar = false");


        double firstVal = 20d;
        double secondVal = 80d;
        double resultVal = (firstVal + secondVal) * 25;
        System.out.println("My total = " + resultVal);
        double remainderVal = resultVal % 40;
        if (remainderVal <= 20)
            System.out.println("Total was over the limit!" + "\n" + "Remainder = " + remainderVal);
        else
            System.out.println("ALL GOOD HERE!");










    }
}
