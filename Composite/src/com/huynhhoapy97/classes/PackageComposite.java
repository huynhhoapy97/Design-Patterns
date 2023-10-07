package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.ProductComponent;

import java.util.List;

public class PackageComposite implements ProductComponent {
    private List<Product> productList;

    public PackageComposite(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public double calculatePrice() {
        double total = 0;

        for (Product product : productList) {
            total += product.calculatePrice();
        }

        return total;
    }
}
