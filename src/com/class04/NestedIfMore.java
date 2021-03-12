package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		
		int age=30;
		int weight=14;
		
		if (age>=18) {
			if (weight>110) {
				System.out.println("you can donate based on your age and weight");
			} else {
				System.out.println("your weight is too small, you can not donate");
			}
			
		} else {
			System.out.println("your age is not eligible");
		}
		
	}

}
