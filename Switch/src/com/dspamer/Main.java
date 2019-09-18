package com.dspamer;

public class Main {

    public static void main(String[] args) {
        //**********************************************
        //switch can be used with byte, short, char, int
        //**********************************************
//        int switchValue = 3;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was 3, or 4, or 5");
//                System.out.println("The actual number was " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

        // A,B,C,D,E
        char val = 'F';

        switch (val) {
            case 'A':
                System.out.println("Value was 'A'");
                break;
            case 'B':
                System.out.println("Value was 'B'");
                break;
            case 'C':
                System.out.println("Value was 'C'");
                break;
            case 'D':
                System.out.println("Value was 'D'");
                break;
            case 'E':
                System.out.println("Value was 'E'");
                break;
            default:
                System.out.println("Was not A, B, C, D or E");

        }

        String value = "JanUary";

        switch (value.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            default:
                System.out.println("ERROR");
                break;
        }


    }
}
