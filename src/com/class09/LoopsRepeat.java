package com.class09;

public class LoopsRepeat {

	public static void main(String[] args) {
		
		//for (int i=5; i<7; i++) {
		//	System.out.println(i);
			//for (int j=10; j<=12; j++)
			//	System.out.println();
	//	} 
 // System.out.println("_____");
  	
  		for (int i=1; i<10; i++) {
  			for (int j=0; j<=9; j++) {
  			System.out.print (i+" "+j);
  			}
  		}
  		
  		System.out.println("_____");
  		
  		
  		for (int i=0; i<10; i++) {
  			for (int j=0; j<=9; j++) {
  				for (int k=0; k<=9; k++) {
  		  			for (int l=0; l<=9; l++) {
  		  				System.out.println(i+" "+j+" "+k+" "+l);
  		  			}
  		  			}
  		  			
  			}
  			}
  			
  		System.out.println("_____");
  		
  	// not working proper my clock
  		for (int i=0; i<=23; i++) {
  			for (int j=0; j<=59; j++) {
  				if (i>=10 && j>=10) {
  					
  				System.out.println(i+":"+j);
  			
  			} else {
  				System.out.println("0"+i+":0"+j);
  			}
  				
  			}
  			
  		}
  		
  		System.out.println("_____");
  		
  		for (int i=1; i<10; i++)  {
  			
  			for (int j=1; j<10; j++) {
  				System.out.println(i+"*"+j+"="+i*j);
  			}
  			
  		}
  		
	}

}
