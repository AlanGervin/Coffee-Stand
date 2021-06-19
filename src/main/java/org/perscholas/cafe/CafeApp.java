package org.perscholas.cafe;

public class CafeApp {	
	
	public static void main(String[] args) {
		double tax = .08;
		double total = 0.0;	
		
		Store s = new Store();
		s.shop();
		
		ShoppingCart sc = s.getShoppingCart();
		
		for (int i = 0; i < sc.size(); i++) {
			
			if (sc.getIndex(i) instanceof Coffee) {
				Coffee a = (Coffee)sc.getIndex(i);
				System.out.printf("Item: %s, Price: $%.2f, Qty: %d,"
						+ " Subtotal: $%.2f, Milk: %s, Sugar: %s%n", a.getName(), a.getPrice(),
						a.getQuantity(), a.calculateProductSubtotal(), a.isMilk(), a.isSugar());
				total += a.calculateProductSubtotal();
			}
			
			if (sc.getIndex(i) instanceof Cappuccino) {
				Cappuccino a = (Cappuccino)sc.getIndex(i);
				System.out.printf("Item: %s, Price: $%.2f, Qty: %d,"
						+ " Subtotal: $%.2f, Peppermint: %s, Whipped Cream: %s%n", 
						a.getName(), a.getPrice(),a.getQuantity(),
						a.calculateProductSubtotal(), a.isPeppermint(), a.isWhippedCream());
				total += a.calculateProductSubtotal();
			}
			
			if (sc.getIndex(i) instanceof Espresso) {
				Espresso a = (Espresso)sc.getIndex(i);
				System.out.printf("Item: %s, Price: $%.2f, Qty: %d,"
						+ " Subtotal: $%.2f, Extra shot: %s, macchiato: %s%n", 
						a.getName(), a.getPrice(),a.getQuantity(),
						a.calculateProductSubtotal(), a.isExtraShot(), a.isMacchiato());
				total += a.calculateProductSubtotal();
			}
		}

		System.out.printf("Purchase subtotal: %.2f%n", total);
		double salesTax = Double.parseDouble(String.format("%.2f", (total * tax)));
		System.out.printf("Sales tax: %.2f%n", salesTax);
		System.out.printf("Purchase total: %.2f%n", (salesTax + total));
	}

}
