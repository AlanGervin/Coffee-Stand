package org.perscholas.cafe;

public class CafeApp {	
	
	public static void main(String[] args) {
		double tax = .08;
		double total = 0.0;	
		
		Store s = new Store();
		s.shop();
		
		ShoppingCart sc = s.getShoppingCart();
		
		for (int i = 0; i < sc.size(); i++) {
			total += sc.getIndex(i).getPrice();
			//enter logic to display name, price, qty, subtotal,
			// alsy extra shot, machiatto, peppermint, whipped cream, sugar or milk if they exist
		}

		System.out.printf("Purchase subtotal: %.2f%n", total);
		double salesTax = Double.parseDouble(String.format("%.2f", (total * tax)));
		System.out.printf("Sales tax: %.2f%n", salesTax);
		System.out.printf("Purchase total: %.2f%n", (salesTax + total));
	}

}
