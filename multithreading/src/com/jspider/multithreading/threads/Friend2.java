package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.FriendsResource;

public class Friend2 extends Thread{
	
	FriendsResource friendsResource;
	
	public Friend2(FriendsResource friendsResource) {
		this.friendsResource=friendsResource;
		
	}
	
	public void run() {
		synchronized (friendsResource.key) {
			System.out.println(this.getName()+" Locked "+friendsResource.key);
			synchronized (friendsResource.Bike) {
				synchronized (friendsResource.Bike) {
					System.out.println(this.getName()+" Locked "+friendsResource.Bike);
				}
				System.out.println(this.getName()+" Release "+friendsResource.Bike);
			}
			System.out.println(this.getName()+" Release "+friendsResource.key);
			
		}
	}

}
