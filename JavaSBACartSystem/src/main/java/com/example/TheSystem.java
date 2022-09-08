package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
    private HashMap<String, Item> itemCollection;

    TheSystem() {
        // Your code here
    	itemCollection = new HashMap<String, Item>();
    	
    	if (getClass().getSimpleName().equals("AppSystem")) {
    		//add the items from the sample.txt to the itemCollection
    		try {
    			String location = "resources\\sample.txt";
        		File file = new File(location);
        		Scanner input = new Scanner(file);
        		while (input.hasNextLine()) {
					String[] itemInfo = input.nextLine().split("\\s{2,}");
					itemCollection.put(itemInfo[0], new Item(itemInfo[0], itemInfo[1], Double.valueOf(itemInfo[2]), Integer.valueOf(itemInfo[3])));					
				}
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("File not found!");
				e.printStackTrace();
			}		
    	}
    }

    public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

    public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public Boolean checkAvailability(Item item) {
        // Your code here
    	if (item != null && item.getQuantity() >= item.getAvaliableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() 
			+ "to the card. System only has " + item.getAvaliableQuantity() + item.getItemName());
			return false;
		}else if(item == null) {
			return false;
		}
    	else {
			return true;
		}
    }
    
    public Boolean add(Item item) {
        // Your code here
    	if (item != null) {
			if (itemCollection.containsKey(item)){
				itemCollection.get(item).setQuantity(itemCollection.get(item).getQuantity() + 1);
				return true;		
			} else if (!itemCollection.containsKey(item)){
				itemCollection.put(item.getItemName(), item);
				return true;
			} 
		}

		return false;
		
    }

    public Item remove(String itemName) {
        // Your code here
    	if (itemCollection.containsKey(itemName)) {
    		Item item = itemCollection.get(itemName);
			itemCollection.remove(itemName);
			return item;
		} else {
			return null;
		}
    }

    public abstract void display();
    
    
}
