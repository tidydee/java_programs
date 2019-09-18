package com.dspamer;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "120", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherboard = new Motherboard("83-200", "Asus", 4, 6, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.powerUp();

//	    thePC.getMonitor().drawPixelAt(1500, 120, "blue");
//	    thePC.getMotherboard().loadProgram("Windows 10");
//	    thePC.getTheCase().pressPowerButton();

		//Challenge TIME
		//Room
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("South");
		Wall wall3 = new Wall("East");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Modern", 2, 100, 2, 1);

		Lamp lamp = new Lamp("Modern", false, 63);

		Bedroom bedroom = new Bedroom("Daves", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();
		bedroom.getLamp().turnOn();

    }
}
