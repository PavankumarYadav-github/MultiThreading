package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.LaptopCustomer;
import com.jspider.multithreading.threads.LaptopSupplier;
import com.jspider.multithreading.threads.resource.LaptopShop;

public class LaptopDriver {
	
	public static void main(String[] args) {
		
		LaptopShop laptopshop=new LaptopShop(5);
		
		LaptopCustomer customer=new LaptopCustomer(laptopshop);
		LaptopSupplier supplier=new LaptopSupplier(laptopshop);
		Thread supplierT=new Thread(supplier);
		
		customer.start();
		supplierT.start();
	}

}
