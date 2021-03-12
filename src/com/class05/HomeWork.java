package com.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		boolean creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Do you have c/c?");
		
		creditCard=scan.nextBoolean();
		if (creditCard) {
			System.out.println("What is the balance on c/c?");
			balance=scan.nextDouble();
			if (balance>1000) {
				System.out.println("pay off immediatly");
			} else {
				System.out.println("spend more");
			}
			
		} else {
			System.out.println("Would you like to get a credit card?");
		}
		
		String creditCard2;
		double balance2;
		
		
		scan=new Scanner(System.in);
		System.out.println("Do you have c/c?");
		
		creditCard2=scan.next();
		if (creditCard2.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on c/c?");
			balance2=scan.nextDouble();
			if (balance2>1000) {
				System.out.println("pay off immediatly");
			} else {
				System.out.println("spend more");
			}
			
		} else {
			System.out.println("Would you like to get a credit card?");
		}
		

	}

}
