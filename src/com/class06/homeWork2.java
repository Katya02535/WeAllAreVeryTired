package com.class06;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		Scanner input;
		String grade, expl;
		input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		grade=input.nextLine();
		
		switch (grade.toLowerCase()) {
			
			case "a":
				expl="Excellent";
				break;
			case "b":
				expl="Good";
				break;
			case "c":
				expl="Average";
				break;
			case "d":
				expl="Bad";
				break;
			
			
			default:
				expl="Not Acceptable";
		}
		
		System.out.println("You entered grade "+grade+" it means "+expl);
		
		

	}

}
