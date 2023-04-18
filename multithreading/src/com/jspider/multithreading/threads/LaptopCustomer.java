package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.LaptopShop;

public class LaptopCustomer extends Thread{
	
	LaptopShop laptopshop;
	
	public LaptopCustomer(LaptopShop laptopShop) {
		this.laptopshop=laptopShop;
	}
	
	public void run() {
		
		laptopshop.orderLaptop(25);
	}

}
