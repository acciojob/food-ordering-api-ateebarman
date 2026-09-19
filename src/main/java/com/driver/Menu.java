package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
    	// your code goes here
    }

    public void addMenuItem(Food food) {
    	// your code goes here
        menuItems.add(food);
    }

    public List<Food> getMenuItems() {
    	// your code goes here
        return menuItems;
    }

    public Food getMenuItemById(int id) {
    	// your code goes here
        for (Food item : menuItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}