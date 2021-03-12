package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
			double sum=0;
			Scanner input=new Scanner(System.in); 
			System.out.println("Please enter the size of array");
			int size=input.nextInt();
			double[] array=new double [size];
			
			for (int i=0; i<size; i++) {
				array[i]=input.nextDouble();
				sum+=array[i];
			}
			
			System.out.println("The sum is "+sum);
			sum=0;
			
			for (double num:array) {
				sum+=num;
			}
			System.out.println("The sum is "+sum);
	}

}
