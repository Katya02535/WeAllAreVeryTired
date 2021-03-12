package com.review02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		String name;
		String password;
		System.out.println("Please enter username");  
		Scanner scanner=new Scanner(System.in);
		name=scanner.next();
		System.out.println("Please enter your password");
		password=scanner.next();
		
		double accountBalance=1000;
		double amountToTransfer;
		
		if (name.equals("Katya")) {
			
			if (password.equals("Katya123")) {
				System.out.println("Welcome to MV Bank");
				System.out.println("Please eneter the amount to transfer");
				amountToTransfer=scanner.nextDouble();
				if (accountBalance>=amountToTransfer) {
					System.out.println("Amount Transfered");
				} else {
					System.out.println("insufficient funds");
				}
				
			} else {
				System.out.println("your password is incorrect");
			}
		} else {
			System.out.println("your user name is not correct");
		}
		
		
		
		

	}

}
