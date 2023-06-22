package com.example.cooklife;

public class FoodItem {
    private String name;
    private int quantity;
    private boolean isPurchased;

    public FoodItem(String name, int quantity, boolean isPurchased) {
        this.name = name;
        this.quantity = quantity;
        this.isPurchased = isPurchased;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}


