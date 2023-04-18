package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.Shop;

public class Customer extends Thread{
	
	Shop shop;
	
	public Customer(Shop shop){
		this.shop=shop;
	}
	
	@Override
	public void run() {
		shop.orderProduct(10);
	}
}
