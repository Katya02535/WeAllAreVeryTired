package com.review02;

public class ifBlocks {

	public static void main(String[] args) {
		
		String name="Katya";
		String password="Katya123";
		
		double accountBalance=1000;
		double amountToTransfer=3000;
		
		if (name.equals("Katya")) {
			
			if (password.equals("Katya123")) {
				System.out.println("Welcome to MV Bank");
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
