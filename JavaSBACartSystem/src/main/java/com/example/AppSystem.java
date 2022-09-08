package com.example;

import java.text.DecimalFormat;
import java.util.Iterator;

public class AppSystem extends TheSystem {
	private static final DecimalFormat df = new DecimalFormat("0.00");

    AppSystem() {
    	super();
    }

    @Override
    public void display() {
        // Your code here
    	System.out.println("AppSystem Inventory:");
		System.out.format("%-20s | %-20s | %-10s | %-10s\n", 
				"Name", "Description", 
				"Price", "Avaliable Quantity");
		
    	for (String name : super.getItemCollection().keySet()) {
    		Item item = super.getItemCollection().get(name);

			System.out.format("%-20s | %-20s | %-10s | %-10s\n", 
					item.getItemName(), item.getItemDesc(), 
					df.format(item.getItemPrice()), item.getAvaliableQuantity());
		}
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Your code here
    	if (item == null) {
			return false;
		} else {
			if (super.getItemCollection().containsKey(item)){
				System.out.println(item.getItemName() + "is already in the App System");
				return false;		
			} else {
				super.getItemCollection().put(item.getItemName(), item);
				return true;
			} 
		}
			
    }

    public Item reduceAvailableQuantity(String item_name) {
        // Your code here
    	if (super.getItemCollection().containsKey(item_name)) {
    		Item item = super.getItemCollection().get(item_name);
    		item.getQuantity();//reduce by 1
			return item;
		} else {
			return null;
		}
    }
}
