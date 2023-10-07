package com.huynhhoapy97;

import com.huynhhoapy97.classes.PackageComposite;
import com.huynhhoapy97.classes.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product_1 = new Product("phone", 2500000.0);
        Product product_2 = new Product("book", 650000.0);
        Product product_3 = new Product("backpack", 1200000.0);

        System.out.println(product_1);
        System.out.println(product_2);
        System.out.println(product_3);

        List<Product> productList = Arrays.asList(product_1, product_2, product_3);
        PackageComposite packageComposite = new PackageComposite(productList);
        System.out.println("Total price: " + packageComposite.calculatePrice());

    }
}
