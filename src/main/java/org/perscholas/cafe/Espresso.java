package org.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product {
	private static Scanner in = new Scanner(System.in);
	private boolean extraShot;
	private boolean macchiato;

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	public Espresso() {
		this.extraShot = false;
		this.macchiato = false;
	}
	
	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	@Override
	public double calculateProductSubtotal() {
		double total = 0.0;
		
		total += this.getQuantity()*this.getPrice();
		if (extraShot) {
			total += 2.00 * this.getQuantity();
		}
		if (macchiato) {
			total += 1.00 * this.getQuantity();
		}
		
		return total;
	}

	@Override
	public void addOption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printOptions() {
		in = new Scanner(System.in);
		System.out.println("Would you like extra shot with that?");
		String answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setExtraShot(true);
		}
		System.out.println("Would you like macchiato with that?");
		answer = in.next();
		if (answer.equalsIgnoreCase("y")) {
			this.setMacchiato(true);
		}
	
		
	}

}
