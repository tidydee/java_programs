package com.dspamer;

public class Rave4 extends Car {
    //constructor
    public Rave4(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public String brake() {
        return "Rave4.brake called. Rave4 is braking with ABS.";
    }
}
