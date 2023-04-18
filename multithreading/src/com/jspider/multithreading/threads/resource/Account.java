package com.jspider.multithreading.threads.resource;

public class Account {
	
	int accountBalance;
	
	public Account(int accountBalance){
		this.accountBalance=accountBalance;
	}
	
	public void checkBalance() {
		System.out.println("Current Account Balance "+accountBalance);
	}
	
	public void depoditAmount(int amount) {
		System.out.println("Depositing "+amount+"Rs in Account");
		accountBalance+=amount;
		checkBalance();
	}
	
	public void withdrawAmount(int amount) {
		System.out.println("Trying To Withdrawal"+amount+"Rs From Account");
		if(amount>accountBalance) {
			System.out.println("Insufficient Balance");
		}
		else {
			accountBalance+=amount;
			checkBalance();
		}
	}

}
