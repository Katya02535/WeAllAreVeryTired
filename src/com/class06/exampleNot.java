package com.class06;

import java.util.Scanner;

public class exampleNot {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double price, discPrice;
		discPrice=0;
		boolean sale;
		String item;
		System.out.println("Is there a sale");
		sale=input.nextBoolean();
		
		if (!sale) {
			System.out.println("I am not going for shopping");
		} else {
			System.out.println("What are you buying?");
			item=input.next();
			System.out.println("What is the price?");
			price=input.nextDouble();
			if (price<=10) {
				discPrice=price-(0.05*price);
			} else if (price>10 && price<=100) {
				discPrice=price-(0.1*price);
			} else if (price>100 && price<=500) {
				discPrice=price-(0.2*price);
			} else if (price>500 ) {
				discPrice=price-(0.3*price);
			} 
				
			
			System.out.println("You purchased "+item+" that was originally price "+price+" after discount it is "+discPrice);
		
			if (discPrice<500) {
				System.out.println("My shopping is not that crazy");
			}
		}
		
		
		

	}

}
