package com.company;

import java.util.Scanner;
/**
 * Main class for the application. 
 * @author Letu Kassa
 * @version October 19, 2017
 *
 */
public class WindChillCalculator {

    public static void main( String[] args ) {
    
        Scanner keyboard;
        keyboard = new Scanner( System.in );
        int country; 
        final int CANADA = 0; 
        final int MEXICO = 1;
        double temperature; 
        double windsp;
        String station;
        double chill;      
 
 // Prompt user for the country
        country = TerminalUI.promptForUnitlessInt( keyboard, 
            "Canada (0), Mexico (1), or U.S. (2):" );
  
 // Prompt user for the temperature 
        if ( country == CANADA || country == MEXICO ) {
        
            temperature = TerminalUI.promptForDouble( keyboard,
            "Temperature " ,  "degrees C" );
            
            temperature = Convert.fromCelsiusToFahrenheit( temperature );
        } else {
        
            temperature = TerminalUI.promptForDouble( keyboard,
                    "Temperature " ,  "degrees F" );      
        }
               
 //Prompt the user for the wind speed 
        if ( country == CANADA ) {
            windsp = TerminalUI.promptForDouble( keyboard, 
          "Wind Speed", "km/hr" );
            windsp = Convert.fromKilometersToMiles( windsp );
            
        } else if ( country == MEXICO ) {
            windsp = TerminalUI.promptForDouble( keyboard, 
              "Wind Speed", "m/sec" );
            windsp = Convert.fromMetersPerSecondToMilesPerHour( windsp );
        
        } else {
            windsp = TerminalUI.promptForDouble( keyboard, 
                "Wind Speed", "mi/hr" );
        
        }
      
// Prompt the user for the ICAO
        station = TerminalUI.promptForString( keyboard, "Station:" );
          
 
//Calculate the wind chill value in standard units.
        

        if ( country == CANADA ) {
            chill = Weather.windChill( temperature, windsp );
            System.out.printf( "Wind Chill for %s: %6.2f degrees C",
                  station,  Convert.fromFahrenheitToCelsius( chill ) );
            if ( Weather.isDangerous( chill ) ) {
                System.out.print( " (Be careful!) " );
            }
            System.out.println();
        } else if ( country == MEXICO ) {
            chill = Weather.windChill( temperature, windsp );
            System.out.printf( "Wind Chill for %s: %6.2f degrees C",
                station,  Convert.fromFahrenheitToCelsius( chill ) ); 
            if ( Weather.isDangerous( chill ) ) {
                System.out.print( " (Be careful!) " );
            }
            System.out.println();
        } else {
            chill = Weather.windChill( temperature, windsp );
            System.out.printf( "Wind Chill for %s: %6.2f degrees F",
                station,  chill );
            if ( Weather.isDangerous( chill ) ) {
                System.out.print( " (Be careful!) " );
            }
            System.out.println();
        }   
    
    
    }
}
