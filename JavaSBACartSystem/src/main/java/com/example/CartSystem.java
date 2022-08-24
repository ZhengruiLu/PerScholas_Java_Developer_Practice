package com.example;
import java.text.DecimalFormat;
import javax.print.attribute.TextSyntax;

public class CartSystem extends TheSystem {
	private final DecimalFormat df = new DecimalFormat("0.00");
	private final double tax = 1.39;
	
    CartSystem() {
    }

    @Override
    public void display() {
        // Your code here
    	double preTotal = 0;
    	System.out.println("Cart:");
    	System.out.format("%-20s | %-20s | %-10s | %-10s | %-10s\n", 
				"Name", "Description", 
				"Price", "Quantity", "Sub Total");

    	for (String name : super.getItemCollection().keySet()) {
    		Item item = super.getItemCollection().get(name);
			preTotal += item.getItemPrice();
    		
			System.out.format("%-20s | %-20s | %-10s | %-10s | %-10s\n", 
					item.getItemName(), item.getItemDesc(), 
					df.format(item.getItemPrice()), item.getQuantity(),
					df.format(item.getItemPrice() * item.getQuantity()));
		}
    	double total = preTotal * (1 + 1.39 * 0.01);
    	System.out.format("%-20s | %-20s | %-20s\n", 
				"preTotal", "tax",
				"total");
    	System.out.format("%-20s | %-20s | %-20s\n", 
				df.format(preTotal), tax,
				df.format(total));
    }
}
