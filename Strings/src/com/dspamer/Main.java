package com.dspamer;

public class Main {

    public static void main(String[] args) {
	// 8 Primitive Data Types:
    //  int
    //  byte
    //  short
    //  long
    //  float
    //  double
    //  char
    //  boolean
        // String is from the String class. Not a real primitive type.


        String myString = "This is a string";
        System.out.println("MyString = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is now: " + myString);
        myString = myString + "\u00A9 2018";
        System.out.println("myString is now: " + myString);
    }
}
