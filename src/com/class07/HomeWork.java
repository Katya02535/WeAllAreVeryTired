package com.class07;

public class HomeWork {

	public static void main(String[] args) {
		int sumOdd,sumEven;
		sumOdd=0; 
		sumEven=0;
		for (int i=1; i<=50; i++) {
			if (i%2!=0) {
				sumOdd+=i;
			} else {
				sumEven+=i;
			}
		}
		System.out.println("Summ of Odd numbers is "+sumOdd);
		System.out.println("Summ of Even numbers is "+sumEven);

	}

}
