package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread1;
import com.jspider.multithreading.threads.MyThread2;

public class Main {
	public static void main(String[] args) {
		
		
		//Using Thread Class
		MyThread1 mythread1=new MyThread1();
		//mythread1.start();//start() from Thread Class (non-static method)
		
		//Using Runnable Interface
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		
		/*we have to pass object of custom thread class which implement Runnable Interface
		to Thread Class because in Runnable Interface there is no start Method start method is in 
		Thread Class*/
		
		mythread1.start();
		thread.start();
		
		/*Thread Scheduler will delicate stack for each thread and transfer control 
		between them base on thread Property*/
		
		
		
	}
}
