package com.huynhhoapy97.concretebuilders;

import com.huynhhoapy97.builders.SupplementBuilder;
import com.huynhhoapy97.enums.Brand;
import com.huynhhoapy97.enums.Category;
import com.huynhhoapy97.enums.Flavor;
import com.huynhhoapy97.enums.Size;
import com.huynhhoapy97.models.Supplement;

public class ConcreteSupplementBuilder implements SupplementBuilder {
    private Brand brand;
    private Category category;
    private Flavor flavor;
    private Size size;

    @Override
    public SupplementBuilder addBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public SupplementBuilder addCategory(Category category) {
        this.category = category;
        return this;
    }

    @Override
    public SupplementBuilder addFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    @Override
    public SupplementBuilder addSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public Supplement build() {
        return new Supplement(this.brand, this.category, this.flavor, this.size);
    }
}
