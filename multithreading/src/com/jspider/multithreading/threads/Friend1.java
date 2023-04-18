package com.jspider.multithreading.threads;

import com.jspider.multithreading.threads.resource.FriendsResource;

public class Friend1 extends Thread{
	
	FriendsResource friendsResource;
	
	public Friend1(FriendsResource friendsResource) {
		this.friendsResource=friendsResource;
	}
	
	public void run() {
		synchronized (friendsResource.Bike) {
			System.out.println(this.getName()+" Locked "+friendsResource.Bike);
			synchronized (friendsResource.key) {
				System.out.println(this.getName()+" Locked "+friendsResource.key);
			}
			System.out.println(this.getName()+" Release "+friendsResource.key);
		}
		System.out.println(this.getName()+" Release "+friendsResource.Bike);
	}

}
