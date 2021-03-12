package com.class06;

import java.util.Scanner;

public class SwitchStringValue {

	public static void main(String[] args) {
		Scanner input;
		String country, food;
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
			
			case "usa":
				food="burger";
				break;
			case "afganistan":
				food="kebab";
				break;
			case "vietnam":
				food="pho";
				break;
			case "poland":
				food="pirogi";
				break;
			case "kazakstan":
				food="horse";
				break;
			case "belarus":
				food="draniki";
				break;
			case "tajikistan":
				food="plov";
				break;
			case "mexico":
				food="tacos";
				break;
			default:
				food="unknown";
		}
		
		System.out.println("Fav food "+food);
	}

}
