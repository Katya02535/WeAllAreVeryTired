package com.class14;

public class CalculatorTester {
	
	public static void main (String[] args) {
	
	Calculator calculator=new Calculator();
	System.out.println(calculator.add(10,12));
	int results=(int)calculator.sub(15.5,10);
	System.out.println(results);
	System.out.println(calculator.div(56,9));
}
}