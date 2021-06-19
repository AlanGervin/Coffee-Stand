package org.perscholas.cafe;

import java.util.Scanner;

public class Store {
	private ShoppingCart sc = new ShoppingCart();
	
	public Store () {
		
	}
	
	public void shop() { 
		Scanner in1 = new Scanner(System.in); 
		System.out.println("Please select from the following menu:\n 1: "
				+ "Coffee\n 2: Cappuccino\n 3: Espresso \n 4: To finish order");
		int itemNumber = 0;
		try {
			while (itemNumber != 4) {
				System.out.println("Enter an order Item number or 4 to end order: ");
				itemNumber = in1.nextInt();	
//				in1.nextLine();
				if (itemNumber == 1) {
					sc.addItem(new Coffee("French Roast", 4.50, "Hot java",false, false));

					if (sc.getIndex(sc.size()-1) instanceof Coffee) {
						Coffee m = (Coffee)sc.getIndex(sc.size()-1);
						m.printOptions();
						sc.put(sc.size()-1, (Product)m);
					}
				}
				if (itemNumber == 2) {
					sc.addItem(new Cappuccino("Cappuccino", 4.50, "Cappuccino el beste", false, false));
					if (sc.getIndex(sc.size()-1) instanceof Cappuccino) {
						Cappuccino m = (Cappuccino)sc.getIndex(sc.size()-1);
						m.printOptions();
						sc.put(sc.size()-1, (Product)m);
					}
				}
				if (itemNumber == 3) {
					sc.addItem(new Espresso("Espresso", 5.50, "Espresso brand", false, false));
					if (sc.getIndex(sc.size()-1) instanceof Espresso) {
						Espresso m = (Espresso)sc.getIndex(sc.size()-1);
						m.printOptions();
						sc.put(sc.size()-1, (Product)m);
					}
				}
				if (itemNumber == 4) {
					System.out.println("Proceed to checkout.\n");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in1.close();
		}
		
	}
	
	public int getLength() {
		return sc.size();
	}
	
	
	public ShoppingCart getShoppingCart() {
		return sc;
	}
	
		
}
