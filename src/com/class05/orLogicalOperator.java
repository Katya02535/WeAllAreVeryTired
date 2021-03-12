package com.class05;

public class orLogicalOperator {

	public static void main(String[] args) {
		/* variable day
		 * 
		 * if day is Tuesday or Wednesday ---> manual class
		 * if day Monday or Friday ---> day off
		 * if day is Sat or Sun ---> Java class
		 * if day is Thursday --> review class
		 * 
		 */
		
		String day="Saturday";
		if (day.equals("Monady")||day.equals("Friday")) {
			System.out.println("Today I have no class");
		} else if (day.equals("Tuesday")||day.equals("Wednesday")){
			System.out.println("Today I have manual class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today I have a review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today Java");
		} else {
			System.out.println(day+" is invalid entry");
		}
		

	}

}
