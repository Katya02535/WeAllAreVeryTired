package com.class04;

public class Diploma {

	public static void main(String[] args) {
		boolean diploma=false;
		boolean degreeProgram=true;
		double gpa=2;
		
		if (diploma) {
			System.out.println("Congartulations!");
		} else if (degreeProgram) {
			if (gpa>=3.5) { 
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
					
		} else {
			System.out.println("Get a deegre, you'll need it!");
		}
		
		
	}

}
