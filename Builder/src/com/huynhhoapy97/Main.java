package com.huynhhoapy97;

import com.huynhhoapy97.concretebuilders.ConcreteSupplementBuilder;
import com.huynhhoapy97.enums.Brand;
import com.huynhhoapy97.enums.Category;
import com.huynhhoapy97.enums.Flavor;
import com.huynhhoapy97.enums.Size;
import com.huynhhoapy97.models.Supplement;
import com.huynhhoapy97.models.SupplementImmutable;

public class Main {
    public static void main(String[] args) {
        Supplement supplement = new ConcreteSupplementBuilder()
                .addBrand(Brand.LABRADA)
                .addCategory(Category.MEAL_REPLACEMENT)
                .addFlavor(Flavor.MINT_CHOCOLATE)
                .build();

        System.out.println(supplement);

        SupplementImmutable supplementImmutable = new SupplementImmutable.SupplementBuilder()
                .addBrand(Brand.EVOGEN)
                .addCategory(Category.EAA)
                .addFlavor(Flavor.STRAWBERRY)
                .addSize(Size.LARGE)
                .build();

        System.out.println(supplementImmutable);
    }
}
