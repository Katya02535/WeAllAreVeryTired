package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int winNumber;
		
		
		
		do {
			System.out.println("Enter any number from 1 to 100");
			winNumber=scan.nextInt ();
			
		} while (winNumber!=17);

		System.out.println("Congrats!");
	}

}
