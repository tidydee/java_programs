package com.dspamer;

public class VipCustomer {
    //fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    //constructors


    public VipCustomer() {
        this("no-name", 50, "no-email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "no-email");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
