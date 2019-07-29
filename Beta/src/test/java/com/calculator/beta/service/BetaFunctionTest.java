package com.calculator.beta.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BetaFunctionTest {
	
	private IBetaFunction iBeta;
	
	@Before
	public void setup() {
		iBeta = new BetaFunction();
	}

	@Test
	public void calculateBetaFunctionTest_whenGivenValidNumbers() {

		int x = 2;
		int y = 2;
		
		double result = iBeta.calculateBetaFunction(x, y);

		Assert.assertEquals(0.16666666666666666, result, 0);
	}
}
