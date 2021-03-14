package com.class13;

import java.util.Scanner;

public class MobilePhone {

	

	private String model;
	private int price;
	private String make;
	private double size;
	private String color;

	public static void main(String[] args) {
		
		String s="Hello";
		Scanner scanner=new Scanner(System.in);
		
		MobilePhone iPhone= new MobilePhone();
		iPhone.model="IPhone 12";
		iPhone.price=1200;
		iPhone.size=6.4;
		iPhone.make="Apple";
		iPhone.color="Black";
		
		MobilePhone samsungS21= new MobilePhone();
		samsungS21.model="S 21";
		samsungS21.price=800;
		samsungS21.size=6.8;
		samsungS21.make="Samsung";
		samsungS21.color="Phanton Balck";
		
		

	}

}
