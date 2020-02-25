package com.java.Factory;

import com.java.Product.Product;
import com.java.Product.ProductB;

public class FactoryB extends Factory {

	@Override
	public Product facture() {
		return new ProductB();
	}

}
