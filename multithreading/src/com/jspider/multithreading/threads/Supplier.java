package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.Shop;

public class Supplier extends Thread{
	
	Shop shop;
	
	public Supplier(Shop shop) {
		this.shop=shop;
	}
	@Override
	public void run() {
		shop.reStockProduct(20);
	}

}
