package com.jspider.multithreading.threads;

public class MyThread3 extends Thread{
	
	public void run() {
		
		/*getName() and getPriority() both are method from Thread Class
		which is use to get name of thread and  priority of thread*/
		
		System.out.println("From Thread Class");
		System.out.println(this.getName()+" "+this.getPriority());
	}

}
