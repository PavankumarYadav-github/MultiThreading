package com.jspider.multithreading.threads;

public class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("myThread2 is now Running ...");
		}
		
	}

}
