package com.company;

import java.util.Scanner;
/**
 * Used to prompt the user for input and read the user's response.
 * @author Letu Kassa
 * @version October 19, 2017
 *
 */

public class TerminalUI {

/**
* @param units printed unites
* @param message question 
* @param keyboard user insert
* @return keyboard double
* 
*/
    public static double promptForDouble( Scanner keyboard, 
            String message, String units ) {
        System.out.print( message );
        System.out.print( " ( " + units + " ) : " );
        return keyboard.nextDouble();
    }

/**
* @param message question 
* @param keyboard user insert
* @return keyboard string
* 
*/    
    public static String promptForString( Scanner keyboard, String message ) {
        System.out.print( message );
        keyboard.nextLine();
        return keyboard.nextLine();

    }

/**
* @param message question 
* @param keyboard user insert
* @return keyboard int
* 
*/
    public static int promptForUnitlessInt( Scanner keyboard, String message ) {
        System.out.print( message );
        return keyboard.nextInt();

    }

}
