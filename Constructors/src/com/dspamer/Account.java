package com.dspamer;

public class Account {
    //fields
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    //Constructor
    public Account() {
        //Using "this" is a special UseCase that will execute when No Parameters has been specified upon Class init.
        // "this" will call another Constructor with the default values specified.
        this(12345, 10.00, "Default Name", "6011231234", "defaultEmail");
        System.out.println("DEFAULT ACCOUNT CONSTRUCTOR CALLED");
    }

    public Account(int number, double balance, String name, String phone, String email) {
        System.out.println("ACCOUNT CONSTRUCTOR WITH PARAMS CALLED");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Account(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    //Methods
    public void deposit(double amount) {
        System.out.println(" ***** Deposit starting... ***** ");
        System.out.println(" ***** Current Balance = " + getBalance() +  " ***** ");
        double balance = this.balance;
        balance += amount;
        setBalance(balance);
        System.out.println(" ***** Deposit Successful ***** ");
        System.out.println(" ***** New Balance = " + getBalance() + " ***** ");
    }

    public void withdraw(double amount) {
        System.out.println(" ***** Withdrawel starting... ***** ");
        System.out.println(" ***** Balance = " + this.balance + " ***** ");
        if (this.balance - amount <0) {
            System.out.println(" ***** Withdrawel FAILED ***** ");
            System.out.println(" ***** Insufficient Funds ***** ");
            System.out.println(" ***** New Balance = " + getBalance() + " ***** ");
        } else {
            this.balance -= amount;
            System.out.println(" ***** Withdrawel Successful ***** ");
            System.out.println(" ***** New Balance = " + getBalance() + " ***** ");
        }
    }

    public double balance() {
        System.out.println(" ***** Checking Balance... ***** ");
        System.out.println(" ***** Your Current Balance = " + getBalance() + " ***** ");
        return getBalance();
    }

    //getters & setters
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
}
