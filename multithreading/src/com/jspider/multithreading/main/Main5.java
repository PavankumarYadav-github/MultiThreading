package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread5;

public class Main5 {
		
		public static void main(String[] args) {
			
			MyThread5 mythread=new MyThread5();
			Thread thread=new Thread(mythread);
			thread.start();
//			mythread.start();
		}
}
