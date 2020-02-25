package com.java.test;

import com.java.Factory.FactoryA;
import com.java.Factory.FactoryB;

public class FactoryPatternTest {
		public static void main(String[] args) {
			FactoryA factoryA=new FactoryA();
			factoryA.facture().Show();
			FactoryB factoryB=new FactoryB();
			factoryB.facture().Show();
		}
}
