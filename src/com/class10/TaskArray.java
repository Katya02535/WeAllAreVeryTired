package com.class10;

public class TaskArray {

	public static void main(String[] args) {
		
		String [] name=new String [6];
		name[0]="Katya";
		name[1]="Alina";
		name[2]="Ksenia";
		name[3]="Mehmet";
		name[4]="Suni";
		name[5]="Kalim";
		System.out.println(name[0]);
		System.out.println("an other way of creating an array--------");
		
		String[] names= {"Katya","Ksenia","Mehmet", "Suni"};
		System.out.println(names[0]);
		
		
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}

		

	}

}
