package com.jspider.multithreading.threads.resource;

public class Shop {
	
	int availableProduct;
	
	public Shop(int availableProduct) {
		this.availableProduct=availableProduct;
	}
	
	public synchronized void  orderProduct(int noOfProduct) {
		System.out.println("Trying to Purchase "+noOfProduct+" Products");
		if(noOfProduct>availableProduct) {
			System.out.println(noOfProduct+" Products Not Available...!");
			System.out.println("Please Wait...");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableProduct-=noOfProduct;
		System.out.println(noOfProduct+" product Purchace");
		System.out.println("Now Available Product "+availableProduct);
	}
	
	public synchronized void reStockProduct(int noOfProduct) {
		System.out.println("Restocking "+noOfProduct+" Product");
		availableProduct+=noOfProduct;
		System.out.println("Product Available "+availableProduct);
		this.notify();
		
	}

}
