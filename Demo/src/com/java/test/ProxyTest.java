package com.java.test;

import com.java.buyhouse.BuyHouse;
import com.java.buyhouse.BuyHouseImpl;
import com.java.buyhouse.BuyHouseProxy;

public class ProxyTest {
	public static void main(String[] args) {
		BuyHouse buyHouse=new BuyHouseImpl();
		buyHouse.BuyHouse();
		BuyHouseProxy buyHouseProxy=new BuyHouseProxy(buyHouse);
		buyHouseProxy.BuyHouse();
		
	}
	
	
	
	
	
}
