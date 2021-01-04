package com.calc.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calc.StringCalculator;

class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	

}
