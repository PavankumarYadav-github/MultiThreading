package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.Person1;
import com.jspider.multithreading.threads.Person2;
import com.jspider.multithreading.threads.resource.Account;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account account=new Account(10000);
		
		Person1 person1=new Person1(account);
		Person2 person2=new Person2(account);
		Thread thread =new Thread(person2);
		
		person1.start();
		thread.start();
	}

}
