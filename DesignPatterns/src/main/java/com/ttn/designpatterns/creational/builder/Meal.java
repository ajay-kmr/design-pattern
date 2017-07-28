package com.ttn.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double cost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void display() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
