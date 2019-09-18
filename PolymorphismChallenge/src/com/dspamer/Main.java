package com.dspamer;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base Car", 4, "black");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("///////////////");
        Crv crv = new Crv("CRV", 4, "Blue");
        System.out.println(crv.startEngine());
        System.out.println(crv.accelerate());
        System.out.println(crv.brake());
        System.out.println(crv.getCylinders());
        System.out.println(crv.getName());

        System.out.println("///////////////");
        Rave4 rav4 = new Rave4("Rav4", 4, "Red");
        System.out.println(rav4.startEngine());
        System.out.println(rav4.accelerate());
        System.out.println(rav4.brake());
        System.out.println("///////////////");
        Outlander outlander = new Outlander("Outlander", 6, "White");
        System.out.println(outlander.getCylinders());
        System.out.println(outlander.startEngine());
        System.out.println(outlander.accelerate());
        System.out.println(outlander.brake());

    }
}
