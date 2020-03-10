package com.pro;

import java.util.Scanner;

import com.beans.Customer;
import com.main.Withdrawal;

public class B implements Withdrawal{

	@Override
	public void withdraw(int amount, Customer c) {
		// TODO Auto-generated method stub
		
		if (amount<=c.getBalance() & amount<=limit) {
			c.setBalance(c.getBalance() - amount);
		    //go to DB and save the balance
		}
		else if(amount<=c.getBalance() & amount>limit){
			
			System.out.println("Our bank only permits a withdrawal limit of 50000/-");
			System.out.println("Would you like to withdraw the limit amount?\nYES / NO ?");
			
			Scanner s= new Scanner(System.in);
			
			String ch= s.nextLine();
			if (ch=="YES") {
				c.setBalance(c.getBalance() - limit);
			}
		}
	}
}