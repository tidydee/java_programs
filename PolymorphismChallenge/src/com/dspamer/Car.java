package com.dspamer;

public class Car {
    //fields
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String color;

    //constructor
    public Car(String name, int cylinders, String color) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
        this.color = color;
    }

    //methods
    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brake";
    }



    //getters
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}
