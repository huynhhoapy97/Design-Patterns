package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.ProductComponent;

public class Product implements ProductComponent {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
