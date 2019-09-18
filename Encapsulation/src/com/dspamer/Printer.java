package com.dspamer;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100 ) {
            this.tonerLevel += tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.isDuplexPrinter = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <0 && tonerAmount <=100 ) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        System.out.println("Printing a page...");
        int pagesToPrint = pages;
        if (this.isDuplexPrinter) {
            pagesToPrint = (pages /2) + (pages %2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
