package com.javaassignment;

public class Bank {
	
	int account_number;
	String customer_name;
	float balance;
	float rate_of_interest;
	
	public Bank(int account_number, String customer_name, float balance, float rate_of_interest) {
		super();
		this.account_number = account_number;
		this.customer_name = customer_name;
		this.balance = balance;
		this.rate_of_interest = rate_of_interest;
	}
	
	public static void main(String args[]) {
		
		
		Bank user1 = new Bank(405300153,"Pankaj Chauhan",(float)50000.0,(float)6.5);
		user1.display();
		
		boolean deposit = user1.deposit(7000);
		if(deposit == true)
			System.out.println("Transaction successful");
		else
			System.out.println("Transaction failed");
		
		boolean withdraw = user1.withdraw(2000);
		if(withdraw == true)
			System.out.println("Amount withdrawn successful");
		else
			System.out.println("Amount withdrwan failed");
		
		System.out.println("The rate of interest is: "+ user1.getRateOfInterest());
		
		user1.display();
		
		
	}
	
	public boolean deposit(float amount) {
		if(account_number == 0) {
			System.out.println("Account does not exist");
		}else {
			this.balance += amount;
			System.out.println("Your amount has been deposited succesfully");	
			return true;
		}
		return false;
	}
	
	public boolean withdraw(float amount) {
		if(this.balance - amount < 5000) {
			System.out.println("You don't have sufficient balance to withdraw");
		}else
		{
			this.balance -= amount;
			System.out.println("Amount " + this.balance + " has been debited from the account");
			return true;
		}
		return false;
		
	}
	
	public float getRateOfInterest() {
		return this.rate_of_interest;
	}
	
	public void display() {
		System.out.println("The account details are: ");
		System.out.println("Account number: "+ this.account_number);
		System.out.println("Customer name: "+ this.customer_name);
		System.out.println("Account Balance: "+ this.balance);
		System.out.println("Rate of Interest: "+ this.rate_of_interest);
		
	}
	

}
