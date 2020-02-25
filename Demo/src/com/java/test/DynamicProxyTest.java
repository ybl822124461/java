package com.java.test;

import java.lang.reflect.Proxy;

import com.java.buyhouse.BuyHouse;
import com.java.buyhouse.BuyHouseImpl;
import com.java.handier.DynamicProxyHandler;

public class DynamicProxyTest {
public static void main(String[] args) {
	BuyHouse buyHouse=new BuyHouseImpl();
	BuyHouse House=(BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
	House.BuyHouse();
	
	
	
	
	
}
	
	
	
	
}
