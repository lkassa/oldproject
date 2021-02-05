package com.company;

/**
 * Conversion tool for WindChillCalculator.
 * @author Letu Kassa
 * @version October 19, 2017
 *
 */
public class Convert {

/**
 * Conversions from c to f.
 * @param c temperature 
 * @return the formula
 */
    public static double fromCelsiusToFahrenheit( double c ) {
        return ( 9.0 / 5.0 * c ) + 32.0;
    }
 
/**
* Conversions from f to c.
* @param f temperature 
* @return the formula
*/
    public static double fromFahrenheitToCelsius( double f ) {
        return ( 5.0 / 9.0 ) * ( f - 32.0 );
    }
    
/**
* Conversions from kilometers to miles.
* @param km kilometers
* @return the formula
*/
    public static double fromKilometersToMiles( double km ) {
        return km * 0.621371;
    }
 
/**
* Conversions from miles to kilometers.
* @param mi miles 
* @return the formula
*/
    public static double fromMilesToKilometers( double mi ) {
        return mi * 1.60934;
    }
    
/**
* Conversions from meters per second to miles per hour.
* @param mps meters per second
* @return the formula
*/
    public static double fromMetersPerSecondToMilesPerHour( double mps ) {
        return mps * 2.23694;
    }
 
/**
* Conversions from miles per hours to meters per second.
* @param mph miles per hours
* @return the formula
*/
    public static double fromMilesPerHourToMetersPerSecond( double mph ) {
        return mph * 0.44704; 
        
    }
    
/**
 * Meters per kilometer.
 * @param kl kilometer
 * @return the formula  
 * 
 */
    public static double fromMetersPerKilometer( double kl ) {
        return kl * 1000.0; 
    }
    
/**
* Seconds per hour.
* @param hr kilometer
* @return the formula  
* 
*/
    public static double fromSecondsToHours( double hr ) {
        return hr * 3600.0; 
    }
}
