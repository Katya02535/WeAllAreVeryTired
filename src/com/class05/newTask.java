package com.class05;

import java.util.Scanner;

public class newTask {
		
		public static void main(String[] args) {
			
			double quiz, midTerm, finalScore, avarageScore;
			char grade;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter your quiz score");
			quiz=scan.nextDouble();
			System.out.println("Please enter your mid score");
			midTerm=scan.nextDouble();
			System.out.println("Please enter your final score");
			finalScore=scan.nextDouble();
			avarageScore=(quiz+midTerm+finalScore)/3;
			
			
			if (avarageScore >=90 ) {
				grade='A';
			} else if (avarageScore>=70 && avarageScore<90) {
				grade='B';
			} else if (avarageScore>=50 && avarageScore<70) {
				grade='C';
			} else {
				grade='D';
			}

			
			System.out.println("Your grade based on avarage score is  "+ grade);

	}

}
