package com.class10;

public class AdvancedForLoop {

	public static void main(String[] args) {
		int[] numbers= {5,8,90,5,89,6};
		
		for (int num:numbers){
			if(num%2==0) {
			System.out.print(num+" ");
			}
		}
		
		System.out.println();
		String[] name= {"Katya","JOhn","Julia","Max","Roman"};
		for (int i=0; i<name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		for (String j:name) {
			System.out.println(j);
		}
	}

}
