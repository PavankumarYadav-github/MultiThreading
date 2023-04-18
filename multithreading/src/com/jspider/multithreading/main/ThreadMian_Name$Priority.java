package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread3;
import com.jspider.multithreading.threads.MyThread4;

public class ThreadMian_Name$Priority {
	
	public static void main(String[] args) {
		
		MyThread3 myThread3=new MyThread3();
		MyThread4 myThread4=new MyThread4();
		Thread thread=new Thread(myThread4);
		
		myThread3.setName("My Thread 1(Thread Class)");
		thread.setName("My Thread 2(Runnable Interface)");
		
		myThread3.start();
		thread.start();
	}

}
