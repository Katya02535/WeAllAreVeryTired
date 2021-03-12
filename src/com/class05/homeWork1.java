package com.class05;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
		int month;
		String season;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		month=scan.nextInt();
		
		
		if (month==1 || month==12 || month ==2 ) {
			season="winter";
		} else if (month>=3 && month<=5) {
			season="spring";
		} else if (month>=6 && month<=8) {
			season="summer";
		} else  {
			season="fall";
		} 

		System.out.println("You were born in season "+ season);
		

	}

}
