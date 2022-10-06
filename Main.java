/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-09-27
*/

import java.util.Scanner;
/**
* Class Main.
*/

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // use MrCoxallStack class
        final MrCoxallStack aStack = new MrCoxallStack();
        final int tempElement;

        System.out.println("Enter a number: ");
        final int userNumber = myObj.nextInt();
        aStack.push(userNumber);

        aStack.showStack();

        System.out.println("Pop element.");
        tempElement = aStack.pop();
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
