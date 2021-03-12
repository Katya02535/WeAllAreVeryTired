package com.class05;

import java.util.Scanner;

public class homeWork2b {


		public static void main(String[] args) {
			
			double one, two, three;
		
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter first number");
			one=scan.nextDouble();
			System.out.println("Please enter second number");
			two=scan.nextDouble();
			System.out.println("Please enter third number");
			three=scan.nextDouble();
			
			
			if (one>two) {
			
				if (one>three) {
				System.out.println("The largest number is "+ one);
				}
			} 
			if (two>one) {
				if (two>three) {
				System.out.println("The largest number is "+ two);
				}
			} 
			if (three>two) {
				if (three>one) {
				System.out.println("The largest number is "+ three);
				}
		}
			
			/* 
			 * if (num1==num2 && num2==num3){
			 * System.out.println("Numbers are equal");
			 * } else {
			 * 		if (num1>num2) {
			 * 			if (num2>num3) {
			 *		 	largest=num1;
			 * 			} else {
			 *			 largest=num3;
			 *			 }
			 * 		} else {
			 *			 if (num2>num3) [
			 *		 	larger=num2;
			 * 			} else {
			 * 			largest=num3;
			 * }
			 * }
			 * }
			 * 
			 * 
			 */
			
	}
		
}
