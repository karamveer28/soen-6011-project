package com.calculator.beta.service;


import com.calculator.beta.utilities.Utils;

/**
 * Service Class. Contains the business logic
 * 
 * @author karam
 *
 */
public class BetaFunction implements IBetaFunction {
	
	public double calculateBetaFunction(final int x, final int y) {
		
		double result = 0.0;
		
		try {
	        double numerator1 = (double)Utils.getFactorial(x-1);
	        double numerator2 = (double)Utils.getFactorial(y-1);
	        double denominator = (double)Utils.getFactorial(x+y-1);
	        
	        result = (numerator1*numerator2)/denominator;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
