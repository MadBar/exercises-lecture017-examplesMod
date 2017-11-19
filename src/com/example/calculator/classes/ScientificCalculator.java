package com.example.calculator.classes;

import com.example.calculator.interfaces.AdvancedMathOperations;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {
	public double square(double number) {
		return number * number;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public double remainder(double dividend, double divisor) {

		double remainder = dividend % divisor;
		
		//Hans lösning skapar inte en variabel till:
		//Direkt:
		//return dividend % divisor;

		return remainder;
	}
}
