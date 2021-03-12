package com.class03;

public class TempCheck {

	public static void main(String[] args) {
		
		int temp;
		temp=-15;
		
		if (temp<=0) {
			System.out.println("Water will freeze with temperature "+temp);
		} else {
			System.out.println("Water will not freeze with temperature "+temp);
		}
		
		boolean snow=true;
		if(snow==true) {
			System.out.println("going to play outside");
		} else {
			System.out.println("stay home");
		}
		
		boolean snow1=true;
		if(snow1) {
			System.out.println("going to play outside");
		} else {
			System.out.println("stay home");
		}

	}

}
