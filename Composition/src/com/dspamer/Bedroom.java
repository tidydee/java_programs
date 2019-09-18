package com.dspamer;

public class Bedroom {
    private String Bedroom;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String bedroom, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        Bedroom = bedroom;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making Bed...");
        bed.make();
    }
}
