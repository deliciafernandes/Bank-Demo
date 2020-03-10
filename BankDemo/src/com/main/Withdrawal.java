package com.main;

import com.beans.Customer;

public interface Withdrawal {

	int limit=50000;
	
	void withdraw(int amount, Customer c);
	
}
