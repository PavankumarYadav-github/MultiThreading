package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.Account;

public class Person2 implements Runnable{
	
	Account account;
	
	public Person2(Account account){
		this.account=account;
	}
	
	@Override
	public synchronized void run() {
		account.depoditAmount(3000);
		account.withdrawAmount(1500);
		
	}

}
