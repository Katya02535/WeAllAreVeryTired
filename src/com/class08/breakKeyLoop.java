package com.class08;

public class breakKeyLoop {

	public static void main(String[] args) {
		boolean rain=true;
		int temp=60;
		
		while (rain) {
			System.out.println("Stay home");
			if (temp>75) {
				System.out.println("I will walk under the rain");
				break;
			}
			temp+=2;
			
			//System.out.println("I am the code inside hwile loop"); cant even place after break
		}

		for (int i=1; i<=10; i++) {
			System.out.println("hello");
			if (i==5) {
				break;
			}
			System.out.println("I am inside the loop");
		}	
	}

}
