package com.class13;

public class Account {

	
	String username;
	String password;
	double balance;
	String accountNum;
	boolean isLoggedIn;
	public void login(String usernameWhenLoggin,String passwordWhenLogging) {
		if(username.equals(usernameWhenLoggin)&&password.equals(passwordWhenLogging)) {
			System.out.println("Welcome to bank of America your balance is "+balance);
		} else {
			System.out.println("Incorrect entry");
		}
	}
	
	public void printInfo() {
		if (isLoggedIn) {
			System.out.println("YOur account number is "+accountNum+" YOur balance is "+balance);
		}
	}
	
}
