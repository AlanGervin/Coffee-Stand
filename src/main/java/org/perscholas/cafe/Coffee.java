package org.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product {
	private static Scanner in = new Scanner(System.in);
	private boolean sugar;
	private boolean milk;
	
	public Coffee() {
		super();
		this.sugar = false;
		this.milk = false;
	}
	
	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.sugar = sugar;
		this.milk = milk;
	}
	
		
	public boolean isSugar() {
		return sugar;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}


	
	
	@Override
	public double calculateProductSubtotal() {
		return this.getPrice()*this.getQuantity(); 
	}

	@Override
	public void addOption() {

		
	}

	@Override
	public void printOptions() {
		
		System.out.println("Would you like sugar with that?");
		String answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setSugar(true);
		}
		System.out.println("Would you like milk with that?");
		answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setMilk(true);
		}
	}

}
