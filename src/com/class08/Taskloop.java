package com.class08;

import java.util.Scanner;

public class Taskloop {

	public static void main(String[] args) {
		
		for (int i=1; i<=50; i++) {
			
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println("-------------------------------------");
		
		Scanner scan=new Scanner (System.in);
		String answer=null;
		
		
		while (!"yes".equalsIgnoreCase(answer)) {
			System.out.println("Would you like a credit card?");
			answer=scan.next();
			
			if (answer.equalsIgnoreCase("yes")) {
				break;
			}
			
		}
	}

}
