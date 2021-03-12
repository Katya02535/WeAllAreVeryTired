package com.class05;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		double saleAmount, commission;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your sales for the day");
		saleAmount=scan.nextDouble();
		
		
		if (saleAmount<=10 ) {
			commission=0;
		} else if (saleAmount>10 && saleAmount<=100) {
			commission=saleAmount*0.1;
		} else if (saleAmount>100 && saleAmount<=500) {
			commission=saleAmount*0.2;
		} else if (saleAmount>500 && saleAmount<=1000) {
			commission=saleAmount*0.3;
		} else {
			commission=saleAmount*0.5;
		} 
		
		System.out.println("If you sales are "+saleAmount+" commission amount is "+commission);

		if (commission>=500) {
			System.out.println("You are an amazing seller");
		}
		

	}

}
