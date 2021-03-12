package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int hight;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your hight in inches");
		hight=scan.nextInt();
		
		
		if (hight<60 ) {
			System.out.println("you are short");
		} else if (hight>=60 && hight<=72) {
			System.out.println("you are of a medium hight");
		} else {
			System.out.println("you are tall");
		} 
		
		

	}

}
