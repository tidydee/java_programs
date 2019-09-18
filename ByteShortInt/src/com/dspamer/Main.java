package com.dspamer;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int minIntValue = -2_147_483_648;
        int maxIntValue = 2_147_483_647;
        int intTotal = (minIntValue / 2 );

        // byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte byteTotal = (byte) (minByteValue/2);
        //System.out.println("My new Byte Value is: " + byteTotal);

        // short has a width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short shortTotal = (short) (minShortValue/2);
        //System.out.println("Short total is: " + shortTotal);

        // long has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        byte cByte = 10;
        short cShort = 20;
        int cInt = 50;
        long longTotal = 50000L + 10L * (cByte + cShort + cInt);
        short cShortTotal = (short) (1000 + 10 * (cByte + cShort + cInt));
        System.out.println("long total is: " + longTotal);
        System.out.println("short total is: " + cShortTotal);
    }
}
