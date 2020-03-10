package com.main;

import java.util.Scanner;

import com.beans.Customer;
import com.pro.A;
import com.pro.B;

public class App {

	public static void main(String[] args) {
		
		int ch=1;
		while(ch!=3) {
			Scanner s= new Scanner(System.in);
			
			System.out.println("Welcome to your online bank transaction!");
			System.out.println("\n1.DEPOSIT\n2.WITHDRAW\n3.EXIT");
			ch=s.nextInt();
			
			System.out.println("Please enter your name:\t");
			String name=s.nextLine();
			System.out.println("Please enter your amount:\t");
			int amount=s.nextInt();
			Customer c1 = new Customer(name,5000); //keeping balance as 5000
			
			
			switch(ch) {
			
			case 1:
				A a=new A(); 
		        a.deposit(amount, c1); 
		        System.out.println("Balance after deposit:\t"+c1.getBalance()+"rupees");
		        
			case 2:
				B b=new B();
		        b.withdraw(amount, c1);
		        System.out.println("Amount withdrawn:\t"+c1.getBalance()+"rupees");
			
		    default:
		    	System.out.println("Invalid Choice!");
		    	break;
			}
			
			System.out.println("Do you want to exit?\nYES / NO");
			String answer=s.nextLine();
			
			if (answer=="YES"){
					System.out.println("Thanks for visiting!");
					ch=3;
			}
		}
	}
}

