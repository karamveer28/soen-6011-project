package com.calculator.beta.utilities;

/**
 * Utility class
 * 
 * @author karam
 *
 */
public class Utils {

	/**
	 * Finds the factorial of a number
	 * 
	 * @param number Input
	 * @return factorial of a number
	 */
	public static int getFactorial(final int number) {
		int fact = 1;
	    for (int i = 2; i <= number; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
}
