package com.dspamer;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("CopyRight Symbol: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char registeredTradeMark = '\u00AE';
        System.out.println("RegisteredTradeMark is: " + registeredTradeMark);
    }
}
