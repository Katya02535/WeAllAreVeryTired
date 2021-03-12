package com.class11;

public class AllValues2D {

	public static void main(String[] args) {
		
		String[][] usa= {
				
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach","Fairfax"},
				{"Philly","Strassburg","Pittsbug"},
				{"Boston","Quincy","Springfield","Burlington"},
				{"LA","Long Beach","San Francisco"},
				{"Miami","Orlando","Tampa","Tellahasee"}
		}; 
			System.out.println(usa.length); // how many rows total
			System.out.println(usa[0].length);// how many elements inside particular row
	
	 for (int i=0; i<usa.length; i++) { //rows
		 for (int c=0; c<usa[i].length; c++) {
			 System.out.print(usa[i][c]+" ");
		 }
		 System.out.println();
	
	 }
	 
	 for (String [] a:usa) {
		 for (String b:a) {
			 System.out.print(b+" ");
		 }
		 System.out.println();
	 }
	}

}
