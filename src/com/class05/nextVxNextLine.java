package com.class05;

import java.util.Scanner;

public class nextVxNextLine {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		
		System.out.println(num);
		
		System.out.println("Enter text");
		String text=scan.nextLine();
		System.out.println(text);
		System.out.println("End of program");
		
		
		

	}

}
