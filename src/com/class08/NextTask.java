package com.class08;

import java.util.Scanner;

public class NextTask {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int start, end;
		int sumOdd=0;
		int sumEven=0;
		System.out.println("Enter start intiger");
		start=scan.nextInt ();
		System.out.println("Enter end intiger");
		end=scan.nextInt ();
		
		if (start<end) {
			for (int i=start; i<=end; i++) {
				if (i%2!=0) {
					sumOdd+=i;
				} else {
					sumEven+=i;
				}
			}
			System.out.println("Summ of Odd numbers is "+sumOdd);
			System.out.println("Summ of Even numbers is "+sumEven);
			
			
		} else {
			System.out.println("you enetered the wrong range");
		}
		}

}
