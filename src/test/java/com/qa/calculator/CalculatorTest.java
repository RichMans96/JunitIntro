package com.qa.calculator;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void createdCalcTest() {
		boolean isCalc = calc instanceof Calculator;
		
		assertTrue(isCalc);
	}
	
	@Test
	public void additionSuccessTest() {
		double answer = 10.0;
		
		assertEquals(answer, calc.add(5.0, 5.0), 0);
	}
	
	@Test
	public void subtractionSuccesTest() {
		double answer = 5.0;
		
		assertEquals(answer, calc.subtract(10.0, 5.0), 0);
	}
	
	@Test
	public void multiplicationSuccesTest() {
		double answer = 25.0;
		
		assertEquals(answer, calc.multi(5.0, 5.0), 0);
	}
	
	@Test
	public void divisionSuccesTest() {
		double answer = 2.0;
		
		assertEquals(answer, calc.divide(10.0, 5.0), 0);
	}
	
	@Test
	public void divideByZeroTest() {
		double answer = 0;
		
		assertEquals(answer, calc.divide(10.0, 0), 0);
	}
	
	
	
}
