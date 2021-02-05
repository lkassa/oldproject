package com.company;

/**
 * Calculation for weather. 
 *
 * @author Letu Kassa
 * @version October 18, 2017
 */
public class Weather {

/**
 * Calculate the wind chill value.
 * @param t temperature
 * @param v wind velocity
 * @return formula of wind
 */
    public static double windChill( double t, double v ) {
        if ( 50 >= t && v > 3 ) {
            return 35.74 + 0.6215 * t - 35.75
                * Math.pow( v, 0.16 ) + 0.4275 * t * Math.pow( v, 0.16 );
        }  
        return t; 
    }

/**
 * 
 * @param w wind chill
 * @return true or false
 */
    public static boolean isDangerous( double w ) {
        return w < -20.0;
    }

}
