package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.LaptopShop;

public class LaptopSupplier implements Runnable{
	
	LaptopShop laptopShop;
	
	public LaptopSupplier(LaptopShop laptopShop) {
		
		this.laptopShop=laptopShop;
	}
	
	public void run() {
		laptopShop.reStockingLaptop(20);
	}

}
