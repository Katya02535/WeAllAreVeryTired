package com.class05;

import java.util.Scanner;

public class compiler {

	public static void main(String[] args) {
		
		Scanner anyVariableName;
		anyVariableName=new Scanner(System.in);
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		char singleCharacter=anyVariableName.next().charAt(0);
		System.out.println(singleCharacter);
		
		

	}

}
