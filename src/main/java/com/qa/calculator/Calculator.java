package com.qa.calculator;

public class Calculator {

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double subtract(double d, double e) {
		
		return d - e;
	}

	public double multi(double d, double e) {
		
		return d * e;
	}

	public double divide(double d, double e) {
		if(d == 0 || e == 0) {
			return 0;
		}
		return d / e;
	}

}
