package com.calculator.beta.utilities;

import org.junit.Assert;
import org.junit.Test;


public class UtilsTest {

	@Test
	public void getFactorialTest_whenGivenValidNumber() {

		int x = 3;
		
		int result = Utils.getFactorial(x);

		Assert.assertEquals(6, result);
	}
	
	@Test
	public void getFactorialTest_whenGivenZero() {

		int x = 0;
		
		int result = Utils.getFactorial(x);

		Assert.assertEquals(1, result);
	}

}
