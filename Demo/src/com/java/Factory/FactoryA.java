package com.java.Factory;

import com.java.Product.Product;
import com.java.Product.ProductA;

public class FactoryA extends Factory {

	@Override
	public Product facture() {
		return new ProductA();
	}

}
