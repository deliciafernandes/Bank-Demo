package com.pro;

import com.beans.Customer;
import com.main.Deposit;

public class A implements Deposit{

	@Override
	public void deposit(int amount, Customer c) {
		
			c.setBalance(c.getBalance() + amount);
		   
	}
}
