package com.jspider.multithreading.threads;

public class MyThread5 implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			if(i>2) {
				Thread.currentThread().stop();
			}
			System.out.println("MyThread5 is now Running..."+i);
		}
	}

}
