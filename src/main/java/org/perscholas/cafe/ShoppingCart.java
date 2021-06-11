package org.perscholas.cafe;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> shoppingCart = new ArrayList<>();
	
	public void addItem(Product p) {
		shoppingCart.add(p);
	}
	
	public int size() {
		return shoppingCart.size();
	}
	
	public Product getIndex(int i) {
		return shoppingCart.get(i);
	}
	
	public void put(int i, Product p) {
		shoppingCart.set(i, p);
	}

}
