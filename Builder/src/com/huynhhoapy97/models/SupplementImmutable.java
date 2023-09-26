package com.huynhhoapy97.models;

import com.huynhhoapy97.builders.SupplementBuilder;
import com.huynhhoapy97.enums.Brand;
import com.huynhhoapy97.enums.Category;
import com.huynhhoapy97.enums.Flavor;
import com.huynhhoapy97.enums.Size;

public class SupplementImmutable {
    private Brand brand;
    private Category category;
    private Flavor flavor;
    private Size size;

    private SupplementImmutable(Brand brand, Category category, Flavor flavor, Size size) {
        this.brand = brand;
        this.category = category;
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public String toString() {
        return "SupplementImmutable{" +
                "brand=" + brand +
                ", category=" + category +
                ", flavor=" + flavor +
                ", size=" + size +
                '}';
    }

    public static class SupplementBuilder {
        private Brand brand;
        private Category category;
        private Flavor flavor;
        private Size size;

        public SupplementBuilder addBrand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public SupplementBuilder addCategory(Category category) {
            this.category = category;
            return this;
        }

        public SupplementBuilder addFlavor(Flavor flavor) {
            this.flavor = flavor;
            return this;
        }

        public SupplementBuilder addSize(Size size) {
            this.size = size;
            return this;
        }

        public SupplementImmutable build() {
            return new SupplementImmutable(this.brand, this.category, this.flavor, this.size);
        }
    }
}
