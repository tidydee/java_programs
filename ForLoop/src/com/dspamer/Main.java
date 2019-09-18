package com.dspamer;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 5));
//
//        // for (init; termination; increment)
//        for (int i=0; i<5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }

        for (int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i) ));
        }

        System.out.println("==============================");

        for (int i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.00, i) ));
        }

        System.out.println("==============================");

        int primeNumberFound = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                primeNumberFound++;
                System.out.println("Prime Number = " + i);
                System.out.println("PrimeNumberFound = " + primeNumberFound);
                if (primeNumberFound == 3) {
                    System.out.println("EXISTING FOR LOOP!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i<= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));
    }
}
