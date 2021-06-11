package org.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product{
	private static Scanner in = new Scanner(System.in);
	private boolean peppermint;
	private boolean whippedCream;
	
	public Cappuccino() {
		
	}
	
	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	@Override
	public double calculateProductSubtotal() {
		// TODO Auto-generated method stub
		double total = 0.0;
		
		total += this.getQuantity()*this.getPrice();
		if (peppermint) {
			total += 2.00 * this.getQuantity();
		}
		if (whippedCream) {
			total += 1.00 * this.getQuantity();
		}
		
		return total;
	}
	@Override
	public void addOption() {
		// TODO Auto-generated method stub
		this.setPrice(this.getPrice() + 1.00);
		
	}
	@Override
	public void printOptions() {
		in = new Scanner(System.in);
		System.out.println("Would you like whipped cream with that?");
		String answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setWhippedCream(true);
			this.setPrice(this.getPrice() + 1.00);
		}
		System.out.println("Would you like perrermint with that?");
		answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setPeppermint(true);
			this.setPrice(this.getPrice() + 2.00);
		}

	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

}
