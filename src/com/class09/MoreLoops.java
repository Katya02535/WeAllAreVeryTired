package com.class09;

public class MoreLoops {

	public static void main(String[] args) {
		
		for (int i=1; i<=6; i++) {
			for (int c=1; c<=8; c++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		System.out.println("__________________________");
		
		for (int i=1; i<=4; i++) {
			for (int c=1; c<=5; c++) {
			System.out.print(c+" ");
		}
		System.out.println();
		}
System.out.println("__________________________");
		
		for (int i=1; i<=5; i++)
		
		{	
			for (int c=6; c>=1; c--) {
				System.out.print(c+" ");
		}
			
			System.out.println();
		}
		
System.out.println("__________________________");
		
		for (int i=1; i<=5; i++) {
			for (int c=1; c<=5; c++) {
				System.out.print(i+" ");	
		}
			
		System.out.println();
		}
		
System.out.println("__________________________");
		
		for (int i=1; i<=5; i++) {
			for (int c=1; c<=i; c++) {
				
			
					System.out.print("* ");
					
				} 
			System.out.println();
		}
			
		
		for (int i=5; i>=1; i--) {
			for (int c=1; c<=i; c++) {
				
			
					System.out.print("* ");
					
				} 
			System.out.println();
		}
		
	}

}
