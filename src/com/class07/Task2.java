package com.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String name;
		
		int q=1;
		
		while (q<=5) {
		System.out.println("Please enter your name");
		name=scan.nextLine();
		System.out.println("Hello "+name);
		q++;
		}

	}

}
