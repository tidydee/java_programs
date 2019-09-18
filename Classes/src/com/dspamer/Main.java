package com.dspamer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Car honda = new Car();
        Car bmw = new Car();
        honda.setModel("BMX");
        System.out.println("Model is " + honda.getModel());
        honda.setModel("Pilot");
        System.out.println("Model is " + honda.getModel());
    }
}
