package com.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
	private List<Food> items;

    public Order() {
    	// your code goes here
        items = new ArrayList<>();
    }

    public void addItem(Food food) {
    	// your code goes here
        if (food == null) {
            throw new IllegalArgumentException("Food cannot be null");
        }
        items.add(food);
    }

    public List<Food> getItems() {
    	// your code goes here
        return Collections.unmodifiableList(items);
    }

    public double getTotalBill() {
        double totalBill = 0;
     // your code goes here
        for (Food item : items) {
            totalBill += item.getPrice();
        }
        return totalBill;
    }
}
