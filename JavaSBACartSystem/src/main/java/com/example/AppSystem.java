package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {
        // Your code here
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Your code here
    }

    public Item reduceAvailableQuantity(String item_name) {
        // Your code here
    }
}
