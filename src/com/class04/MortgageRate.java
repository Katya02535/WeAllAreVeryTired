package com.class04;

public class MortgageRate {

	public static void main(String[] args) {
		
		double mortRate=3.25;
		int mortPrice=350000;
		
		if (mortRate>4.5) {
			System.out.println("Dont Buy a house");
		} else {
			if (mortPrice>200000) {
		
			System.out.println("will take a loan");
		} else {
			System.out.println("Will pay cash");
		}
		
		}
	
		
	}

}
