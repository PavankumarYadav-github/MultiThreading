package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.Account;

public class Person1 extends Thread{
	
	Account account;
	
	public Person1(Account account ) {
		this.account=account;
		
	}
	//with the help synchronized keyword at a time only one thread can access resource
	//synchronized is use to avoid inconsistency
	//using synchronized we put Lock on resource 
	//Static Method --> Class Lock
	//Non-Static Member --> Object Lock
	
	public synchronized void run() {
		account.depoditAmount(5000);
		account.withdrawAmount(3000);
	}

}
