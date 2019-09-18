package com.dspamer;

public class Main {

    public static void main(String[] args) {
	    Crv crv = new Crv(36);
	    crv.steer(25);
	    crv.accelerate(30);
	    crv.accelerate(20);
	    crv.accelerate(-40);
    }
}
