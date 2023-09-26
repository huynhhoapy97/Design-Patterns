package com.huynhhoapy97.models;

import com.huynhhoapy97.enums.Brand;
import com.huynhhoapy97.enums.Category;
import com.huynhhoapy97.enums.Flavor;
import com.huynhhoapy97.enums.Size;

public class Supplement {
    private Brand brand;
    private Category category;
    private Flavor flavor;
    private Size size;

    public Supplement(Brand brand, Category category, Flavor flavor, Size size) {
        this.brand = brand;
        this.category = category;
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Supplement{" +
                "brand=" + brand +
                ", category=" + category +
                ", flavor=" + flavor +
                ", size=" + size +
                '}';
    }
}
