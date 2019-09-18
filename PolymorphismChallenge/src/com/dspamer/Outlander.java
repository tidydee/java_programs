package com.dspamer;

public class Outlander extends Car{

    //constructor
    public Outlander(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public String accelerate() {
        return "Outlander.accelerate called. Outlander is speeding up faster...";
    }

    @Override
    public String brake() {
        return "Outlander.brake called. Outlander is braking with ABS.";
    }
}
