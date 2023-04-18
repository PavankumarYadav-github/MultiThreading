package com.jspider.multithreading.threads.resource;


public class LaptopShop {
	
	int noOflaptop;
	
	public LaptopShop(int noOfLaptop) {
		
		this.noOflaptop=noOfLaptop;
		
	}
	
	public synchronized void orderLaptop(int orderLaptop) {
		
		System.out.println("Trying To See Avaliable Stock");
		System.out.println("Available Product:- "+noOflaptop);
		if(orderLaptop>noOflaptop) {
			System.out.println("Out Of Stocks");
			System.out.println("Please wait...");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			noOflaptop-=orderLaptop;
			System.out.println("Laptop Purchase:- "+orderLaptop);
			System.out.println("Now Available Laptops "+noOflaptop);
			
		}
		
	}
	
	public synchronized void reStockingLaptop(int noOfreStocklaptop) {
		System.out.println("ReStocking Product....");
		noOflaptop+=noOfreStocklaptop;
		System.out.println("Done....");
		this.notify();
	}

}
