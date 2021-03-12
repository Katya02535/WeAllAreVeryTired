package com.class04;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Print enter your text");
		String text=scan.nextLine(); //capture console input entire line incuding spaces
		System.out.println("Text that I entered is "+text);
		
		System.out.println("Please enter your name");
		String name=scan.next(); //one word
		System.out.println("Nice to meet you "+name);

		System.out.println("whta's your age");
		int age=scan.nextInt();
		System.out.println("My name is "+name+" I am "+age+" years old");
	}

}
