package com.dspamer;

public class Crv extends Car{
    //constructor
    public Crv(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public String accelerate() {
        return "CRV -> accelerate";
    }

    @Override
    public String startEngine() {
        return "CRV -> startEngine";
    }

    @Override
    public String brake() {
        return "CRV -> brake";
    }
}
