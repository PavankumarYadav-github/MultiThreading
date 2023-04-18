package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.Friend1;
import com.jspider.multithreading.threads.Friend2;
import com.jspider.multithreading.threads.resource.FriendsResource;

public class FriendsMainSituation {
	
	public static void main(String[] args) {
		FriendsResource friendsResource=new FriendsResource();
		
		Friend1 friend1=new Friend1(friendsResource);
		Friend2 friend2=new Friend2(friendsResource);
		
		friend1.setName("Captain");
		friend2.setName("IronMan");
		
		friend1.start();
		friend2.start();
	}
	
	
	
}
