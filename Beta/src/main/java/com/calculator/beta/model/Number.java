package com.calculator.beta.model;

/**
 * Number class with attributes
 * 
 * @author karam
 *
 */
public class Number {

	private int number;
	
	public Number(final int number) {
		this.number = number;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
}
