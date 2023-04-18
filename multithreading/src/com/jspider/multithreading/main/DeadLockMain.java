package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.RSThread1;
import com.jspider.multithreading.threads.RSThread2;
import com.jspider.multithreading.threads.resource.Resource;

public class DeadLockMain {
	
	public static void main(String[] args) {
		Resource resource=new Resource();
		
		RSThread1 rsThread1=new RSThread1(resource);
		RSThread2 rsThread2=new RSThread2(resource);
		
		rsThread1.start();
		rsThread2.start();
	}

}
