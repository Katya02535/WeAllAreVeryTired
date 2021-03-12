package com.class03;

public class IfElseIf {

	public static void main(String[] args) {

		double a = 5;
		double b = 5;

		if (a > b) {
			System.out.println("Double value " + a + " larger than " + b);
		} else if (a < b) {
			System.out.println("Double value " + a + " smaller than " + b);

		} else {
			System.out.println("equal");
		}

		int day = 0;
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Sunday");
		}

	}

}
