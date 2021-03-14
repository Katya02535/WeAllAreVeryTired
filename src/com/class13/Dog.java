package com.class13;

public class Dog {

	
		
		public String breed;
		public double size;
		public String color;
		public int age;
		public void bark() {
			System.out.println("gav gav gav");
		}
		public void sleep() {
			System.out.println("zzzzzzzzzz");
		}
		
		public void eat() {
			System.out.println("yum yummmy");
		}
		
		public void look(){
			System.out.println("Hi I am a dog and my color is "+color);
		}
		public static void main(String[] args) {
		
			Dog bullDog=new Dog();
			bullDog.age=5;
			bullDog.breed="America Bulldog";
			bullDog.size=6.8;
			bullDog.color="Pink";
			bullDog.bark();
			bullDog.sleep();
			bullDog.eat();
			bullDog.look();
			
			
			Dog lab= new Dog();
			
			lab.age=7;
			lab.breed="labrador";
			lab.color="yellow";
			lab.look();

	}

}
