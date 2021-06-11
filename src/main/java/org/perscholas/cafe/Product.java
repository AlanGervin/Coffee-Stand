package org.perscholas.cafe;

public abstract class Product {
	private String name;
	private Double price;
	private String description;
	private int quantity;
	
	Product() {
		
	}
	
	Product(String name, Double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public double calculateProductTotal() {
		return quantity * price;
	}
	
	public abstract double calculateProductSubtotal();
	
	public abstract void addOption();
	
	public abstract void printOptions();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
