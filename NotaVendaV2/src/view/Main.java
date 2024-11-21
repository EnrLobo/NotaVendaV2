package view;

import model.Sale;

public class Main {

	public static void main(String[] args) {
		Sale sale = new Sale();
		sale.createSaleItem("ga", 2);
		sale.createSaleItem("pa", 6);
		sale.createSaleItem("mo", 200);
		sale.createSaleItem("mu", 200);
		
		for (Object item : sale.getItems()) {
			System.out.println(item);
		}
		
		System.out.println(String.format("Total: %.2f", sale.getTotal()));
	}

}