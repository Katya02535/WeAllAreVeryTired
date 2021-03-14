package com.class14;

public class MoreMethods {
	
	// method that does not take any values & returns String "Hi"
	String print() {
		return "Hi";
	} 
	
	// create method that takes a number and returns the double of that number
	double doubleTheValue(double input) {
		return input*2;
	}
	
	//create a method that will take boolean as a method and if it's true
	// say "take umbrella. if false "go for a walk"
	
	void isRaining (boolean isRain) {
		if (isRain) {
			System.out.println("Please take the umbrella");
		} else {
			System.out.println("Please go for a walk");
		}
	}
	
	void times () {
		for (int i=0; i<5; i++) {
			System.out.println("Batch 9 is awesome");  
		}
		}
	
	double returnGreater(double num1, double num2) {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
		void numbers(int numN) {
			if (numN%2==0) {
				System.out.println("It's even");
			} else {
				System.out.println("It's odd");
			}
		}
	
		double returnTheArraySum (double [] arr) {
			double sum=0;
			for (double element:arr) {
				sum=sum+element;
			}
			return sum;
		}
		
		boolean isMirror (String str) {
			String newStr="";
			for (int i=str.length()-1; i>=0; i--) {
				System.out.println(i+" "+str.charAt(i));
				newStr+=str.charAt(i);
			}
			System.out.println(newStr);
			
			if (str.equals(newStr)) {
			 return true;
		} else {
			return false;
		}
			
		}
		
	
}
