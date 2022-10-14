

/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-09-27
*/

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class MrCoxallStack {

    /**
    * An ArrayList that will hold the tack elements.
    */
    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * Getter.
    * The showStack method.
    *
    * @return regets stack and returns it
    */
    public ArrayList<Integer> getStack() {
        return theStack;
    }

    /**
    * The push() function.
    *
    * @param pushNumber The int to be added to the stack
    */
    public void push(final int pushNumber) {
        final int index = theStack.size();
        theStack.add(index, pushNumber);
    }
    /**
    * The pop() function.
    *
    * @return Remove the top element and return it
    */

    public int pop() {
        return theStack.remove(theStack.size() - 1);
    }
}
