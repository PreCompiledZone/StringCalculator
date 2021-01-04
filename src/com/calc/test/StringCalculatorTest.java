package com.calc.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calc.StringCalculator;

public class StringCalculatorTest {
	
	public StringCalculatorTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
    public void testThreeNumbers(){
    	assertEquals(6, StringCalculator.add("1,2,3"));
    }
	
	@Test
    public void testNewLine(){
    	assertEquals(6, StringCalculator.add("1\n2,3"));
    }
	
	@Test
    public void testOtherDelimiter(){
    	assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
	
	@Test
    public void testOverThousand(){
    	assertEquals(2, StringCalculator.add("1000,2"));
    }
	
	@Test
    public void testNegativeNumver(){
    	try {
    		StringCalculator.add("-6,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -6");
		}

		try {
			StringCalculator.add("2,-7,3,-3");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -7,-3");
		}
    }

}
