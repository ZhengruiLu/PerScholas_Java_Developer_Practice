package com.example;

public class Item{
    private String itemName;
    private String itemDesc;
    private double itemPrice;
    private Integer quantity;
    private Integer avaliableQuantity;
    
    public Item() {
        // Your code here
        quantity = 1;
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        // Your code here
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.avaliableQuantity = availableQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvaliableQuantity() {
        return avaliableQuantity;
    }

    public void setAvaliableQuantity(Integer avaliableQuantity) {
        this.avaliableQuantity = avaliableQuantity;
    }
    
    
    
}
