package com.dspamer;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("COunt val = " + count);
            count++;
        }

        for (int i=6; i !=6; i++) {
            System.out.println("Count val is " + count);
        }

        count = 1;
        do  {
            System.out.println("Count Val was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count !=6);

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            if (evenNumberFound <5) {
                number++;
                if (!isEvenNumber(number)) {
                    continue;
                }

                evenNumberFound++;
                System.out.println("Even Number " + number);
            } else {
                System.out.println("EvenNumberFound = " + evenNumberFound);
                break;
            }
        }
    }


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
//            System.out.println("VALUE IS A EVEN NUMBER = TRUE");
            return true;
        }
        return false;
    }
}
