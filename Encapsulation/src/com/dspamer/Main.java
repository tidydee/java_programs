package com.dspamer;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Dave";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

        ////////////////
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Gun");
        System.out.println("Initial health is " + player.getHealth());
        ////////////////

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages prined was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages prined was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPagesPrinted());


    }
}
