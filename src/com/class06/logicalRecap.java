package com.class06;

import java.util.Scanner;

public class logicalRecap {

	public static void main(String[] args) {
		/* default value of int=0
		 * default value of double =0.0
		 * default of boolean=false;
		 * default of String and all non-primitive = null
		 */
		
		Scanner scan;
		int time;
		String timeOfTheDay = "Invalid"; //compiler can initialize variable to their default values
		
		scan=new Scanner(System.in);
		System.out.println("Please enter time in 24 hour format");
		time=scan.nextInt();
		
		if(time>=1 && time<=11) {
			timeOfTheDay="Morning";
			
		} else if (time>=12 && time<=13) {
			timeOfTheDay="Noon";
		} else if (time>=14 && time<=17) {
			timeOfTheDay="Afternoon";
		} else if (time>=18 && time<=21) {
			timeOfTheDay="Evening";
		} else if (time>=22 && time<=24) {
			timeOfTheDay="Night";
		} 
		
		System.out.println("Based on time entered it is time of the day "+timeOfTheDay);

	}

}
