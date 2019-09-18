public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Dawid!");

        int myFirstNumber = 5;
        int mySecondNumber = 10;
        int myThirdNumber = 20;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int diffFromThousand = 1000 - myTotal;

        System.out.println("My first number = " + (myFirstNumber + mySecondNumber) );
        System.out.println("My Total = " + myTotal);
        System.out.println("The Difference from 1000 = " + diffFromThousand);
    }
}
