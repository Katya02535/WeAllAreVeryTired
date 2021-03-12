package com.class08;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		int i;
		do {
			System.out.println("Please enter your pay");
			i=scan.nextInt();
			if (i<3) {
				System.out.println("Please give more money");
			}
				else if (i>3) {
					System.out.println("Please give less money");
				}
				
				
			}
	
		 while (i!=3); 
		System.out.println("you entered right amout");
	}
}

