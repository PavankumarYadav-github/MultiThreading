package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.Resource;

public class RSThread1 extends Thread{
	
	Resource resource;
	public RSThread1(Resource resource){
		this.resource=resource;
		
	}
	
	public void run() {
		synchronized (resource.resource1) {
			System.out.println(this.getName()+" Locked "+resource.resource1);
			synchronized (resource.resource2) {
				
				System.out.println(this.getName()+" locked "+resource.resource2);
				
			}
			System.out.println(this.getName()+" Release "+resource.resource2);
		}
		System.out.println(this.getName()+" Release "+resource.resource2);
	}

}
