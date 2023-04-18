package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.Customer;
import com.jspider.multithreading.threads.Supplier;
import com.jspider.multithreading.threads.resource.Shop;

public class SC_Main {
	
	public static void main(String[] args) {
		
		Shop shop=new Shop(5);
		
		Customer customer=new Customer(shop);
		Supplier supplier=new Supplier(shop);
		
		customer.start();
		supplier.start();
		
	}

}
