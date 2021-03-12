package com.class10;

public class Arrays {

	public static void main(String[] args) {
		
		
		int num=10;
		num=20;
		System.out.println(num);
		
		int[] array=new int[5];
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		System.out.println(array[2]+array[3]);
		
		double[] numbers=new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		System.out.println(numbers[0]);
		
		String [] names=new String [3];
		names[0]="katya";
		names[1]="ktch";
		names[2]="tya";
		
		System.out.println(names[0]);
		
		
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=true;
		
		System.out.println(b[1]);
		
		int size=b.length;
		System.out.println(size);
	}

}
