package com.jspider.multithreading.threads;

public class MyThread1 extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Mythread1 is now running ....");
		}
	}

}
