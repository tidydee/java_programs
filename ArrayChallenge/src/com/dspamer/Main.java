package com.dspamer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = getIntegers(5);
	    int[] sortedArr = sortIntegers(myIntegers);
	    printArray(sortedArr);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        //Copying the Array
//        int[] sortedArr = new int[array.length];
//        for (int i=0; i<array.length; i++) {
//            sortedArr[i] = array[i];
//        }
        //Shorter way to copy an Array
        int[] sortedArr = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0; i<sortedArr.length-1; i++) {
                if (sortedArr[i] < sortedArr[i+1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArr;
    }
}
