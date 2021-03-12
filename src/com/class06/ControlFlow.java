package com.class06;

public class ControlFlow {

	public static void main(String[] args) {
		
		int day=6;
		String weekday1;
		
		if (day==1) {
			weekday1="Monday";	
		} else if (day==2) {
			weekday1="Tuesday";
		} else if (day==3) {
			weekday1="Wednesday";	
		} else {
			weekday1="Invalid";
		}
		
		if (!weekday1.equals("Invalid")) {
			System.out.println("Today is "+weekday1);
		}
		System.out.println("-------------");
		
		String weekday;
		
		
		switch (day) {
		
		case 1:
			weekday="Monday";
			break;
		case 2:
			weekday="Tuesday";
			break;
		case 3:
			weekday="Wednesday";
			break;
		case 4:
			weekday="Thursday";
			break;
		case 5:
			weekday="Friday";
			break;
		case 6:
			weekday="Saturday";
			break;	
		case 7:
			weekday="Sunday";
			break;
		default:
			weekday="Invalid";
		}
		
		if (!weekday.equals("Invalid")) {
			System.out.println("Today is "+weekday);
			
		}
	}

}
