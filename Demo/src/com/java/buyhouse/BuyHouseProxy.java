package com.java.buyhouse;

public class BuyHouseProxy implements BuyHouse {
	private BuyHouse buyHouse; 
	public BuyHouseProxy(final BuyHouse buyHouse) {
		this.buyHouse = buyHouse;
	}
	public void BuyHouse() {
		System.out.println("��ǰ׼��");
		buyHouse.BuyHouse();
		System.out.println("�򷿺�װ��");
	}

}
