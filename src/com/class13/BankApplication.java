package com.class13;

public class BankApplication {
	
	public static void main (String[] args) {
		Account ghulamsAccount= new Account();
		ghulamsAccount.accountNum="123";
		ghulamsAccount.username="Ghulam123";
		ghulamsAccount.password="password123";
		ghulamsAccount.balance=1400;
		ghulamsAccount.login("Ghulam123","password123");
	}
	

}
