package com.dspamer;

public class Main {

    public static void main(String[] args) {
        Account davesAccount = new Account();

        //Account davesAccount = new Account(123456789, 0.0, "Dave Lamp", "6051232345", "davelamp@fmail.com");
//        System.out.println(davesAccount.getNumber());
//        System.out.println(davesAccount.getBalance());


//	    davesAccount.setBalance(0.0);
//	    davesAccount.setNumber(123456789);
//	    davesAccount.setName("Dave Lamp");
//	    davesAccount.setPhone("6051232345");
//	    davesAccount.setEmail("davelamp@fmail.com");

        davesAccount.balance();
        System.out.println("//////////////////////");
        davesAccount.deposit(100.00);
        System.out.println("//////////////////////");
        davesAccount.balance();
        System.out.println("//////////////////////");
        davesAccount.withdraw(50.00);
        System.out.println("//////////////////////");
        davesAccount.balance();
        System.out.println("//////////////////////");
        davesAccount.withdraw(70.00);
        System.out.println("Amount to withdraw: 70.00");
        System.out.println("//////////////////////");
        System.out.println("Your balance is: " + davesAccount.balance());
        System.out.println("Amount to withdraw: 60.00");
        davesAccount.withdraw(60.00);
        davesAccount.balance();
        //////////////////////////////////////////////
        VipCustomer judy = new VipCustomer();
        VipCustomer john = new VipCustomer("John", 200.00);
        VipCustomer ashley = new VipCustomer("Ashley", 1000.000, "ashley@fmail.com");


        System.out.println("Judy: " + judy.getName() + ", " + judy.getCreditLimit() + ", " + judy.getEmailAddress() );
        System.out.println("John: " + john.getName() + ", " + john.getCreditLimit() + ", " + john.getEmailAddress() );
        System.out.println("Ashley: " + ashley.getName() + ", " + ashley.getCreditLimit() + ", " + ashley.getEmailAddress() );
    }
}
