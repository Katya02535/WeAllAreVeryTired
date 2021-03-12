package com.class07;

public class TaskA {

	public static void main(String[] args) {
		
		
		int num=1;
		while (num<=100) {
			System.out.print (num+" ");
			num++;
		}
		System.out.println(" ");
		
		int num2=100;
		while (num2>=1) {
			System.out.print (num2+" ");
			num2--;
		}
			
		System.out.println(" ");
				int num3=20;
				while (num3>=1) {
					System.out.print (num3+" ");
					num3-=2;
				}
					System.out.println(" ");
				for (num3=20; num3>=1; num3-=2) {
					System.out.print (num3+" ");
				}
				
		System.out.println(" ");
				
				
				for (num3=21; num3<=49; num3+=2) {
					System.out.print (num3+" ");
				}	
				System.out.println(" ");
				
				for (num3=20; num3<=50; num3++) {
					if (num3%2!=0) {
						System.out.print (num3+" ");
					}
				}
		}

	}


