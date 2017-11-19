package com.example.calculator.main;

import com.example.calculator.classes.ScientificCalculator;
import com.example.calculator.classes.SimpleCalculator;

public class Main {
	public static void main(String[] args) {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		System.out.println(simpleCalculator.addition(3.3, 4.5));
		System.out.println(simpleCalculator.division(40, 8));
		
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		System.out.println(scientificCalculator.square(10.0));
		//test2
		System.out.println(scientificCalculator.remainder(10, 2));
	}

}
