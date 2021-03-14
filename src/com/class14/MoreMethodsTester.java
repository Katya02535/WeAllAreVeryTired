package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		MoreMethods moreMethods=new MoreMethods();
		System.out.println(moreMethods.print());
		System.out.println(moreMethods.doubleTheValue(10));
		
		moreMethods.isRaining(false);
		moreMethods.times();
		
		System.out.println(moreMethods.returnGreater(7, 66));
		moreMethods.numbers(67);
		
		double []arr= {27.5,7,8};
		System.out.println(moreMethods.returnTheArraySum(arr));
		
		System.out.println(moreMethods.isMirror("aba"));
		System.out.println(moreMethods.isMirror("abafghij"));
	}

}
