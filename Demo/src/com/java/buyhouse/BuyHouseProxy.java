package com.java.buyhouse;

public class BuyHouseProxy implements BuyHouse {
	private BuyHouse buyHouse; 
	public BuyHouseProxy(final BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}
	public void BuyHouse() {
		System.out.println("买房前准备");
		buyHouse.BuyHouse();
		System.out.println("买房后装修");
	}

}
