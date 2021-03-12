package com.class05;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		
		double one, two, three;
		double largestNumber;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		one=scan.nextDouble();
		System.out.println("Please enter second number");
		two=scan.nextDouble();
		System.out.println("Please enter third number");
		three=scan.nextDouble();
		
		
		if (one>two && one>three) {
			largestNumber=one;
		} else if (two>one && two>three) {
			largestNumber=two;
		} else  {
			largestNumber=three;
		} 

		System.out.println("The largest number is "+ largestNumber);
		

	}

}
