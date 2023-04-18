package com.jspider.multithreading.threads;

public class MyThread4 implements Runnable{
	
	public void run() {
		/*currentThread is a static method from Thread Class 
		 which point to the current executing thread*/
		System.out.println("From Runnable Interface");
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	
	}
}
