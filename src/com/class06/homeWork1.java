package com.class06;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
		Scanner input;
		String country, lang;
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
			
			case "usa":
				lang="English";
				break;
			case "ukraine":
				lang="Ukrainian";
				break;
			case "brazil":
				lang="Portuguese";
				break;
			case "poland":
				lang="Polisg";
				break;
			
			case "mexico":
				lang="Spanish";
				break;
			default:
				lang="unknown";
		}
		
		System.out.println("You speak "+lang);
		
		
		

	}

}
