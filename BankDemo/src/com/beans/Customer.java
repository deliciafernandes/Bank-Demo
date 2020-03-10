package com.beans;

public class Customer {

	private String name;
	private int balance;
	
	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	//Encapsulated name and balance fields for security
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
