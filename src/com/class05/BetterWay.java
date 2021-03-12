package com.class05;

import java.util.Scanner;

public class BetterWay {

	public static void main(String[] args) {
		
		int hight;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your hight in inches");
		hight=scan.nextInt();
		String definition;
		
		if (hight<60 ) {
			definition="short";
		} else if (hight>=60 && hight<=72) {
			definition="medium";
		} else {
			definition="tall";
		} 
		
		System.out.println("You are a person who's height is "+definition);

	}

}
