package com.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		String item;
		double price;
		double sum=0;
		double money;
		double change;
		double remainder;
		
		System.out.println("What would you like to buy?");
		item=scan.nextLine();
		System.out.println("what is the price of "+item);
		price=scan.nextDouble();
		System.out.println("Please pay for "+item);
		
		do {
			
		money=scan.nextDouble();
		sum+=money;
			if (sum<price) {
				
				remainder=price-sum;
				if (sum!=price) {
				System.out.println("Please enter "+remainder);
				} else {
					break;
				
				}
			} else if (sum>price) {
				change=money-price;
				System.out.println("Here is your change "+change);
				break;
			} else {
				System.out.println("you got the right amount");
			}
		} while (price!=sum);
		
		System.out.println("TY for shopping");
	}

}
