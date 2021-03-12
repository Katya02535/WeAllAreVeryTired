package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=false;
		 if (morning) {
			 
			 System.out.println("Let me check if I have class today");
			 if (classToday) {
				 System.out.println("Good morninig my classmates");
			 } else {
				 System.out.println("Good morninig my family");
			 } 

		 }  else {
			  System.out.println("Not morninig");
			  
		 }
		System.out.println("__________example2________");
		
		boolean anyAllergy=true;
		boolean pollenAllergy=false;
		if (anyAllergy) {
			System.out.println("Let's check what allergies you have");
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
			} else {
				System.out.println("Ok I know you dont pollen allergy");
			}
		} else {
			System.out.println("You are lucky to have no allergies");
		}
		 
		System.out.println("_________________example 3______________"); 
		
		boolean isFriday=false;
		int day=13;
		
		if (isFriday) {
			
			System.out.println("It's movie day!");
			
			if (day==13) {
			System.out.println("I watch scary movies");
			
			} else {
			System.out.println("I watch any movie");
			}
		
		} else {
			System.out.println("I am staying at home");
		}
		
		System.out.println("_________________example 4______________");
		
			boolean completed=true;
			int score=65;
			
			if (completed) {
				if (score>90) {
					System.out.println("gret Job");
				} else if (score>80) {
					System.out.println("Good job");
				} else if (score>70) {
					System.out.println("Good, but let's try to do better");
				} else {
					System.out.println("good for trying, but study more!");
				}
				
			} else {
				System.out.println("Please check to complete all work");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
