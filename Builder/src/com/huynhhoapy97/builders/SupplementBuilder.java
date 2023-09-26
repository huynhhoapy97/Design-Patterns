package com.huynhhoapy97.builders;

import com.huynhhoapy97.enums.Brand;
import com.huynhhoapy97.enums.Category;
import com.huynhhoapy97.enums.Flavor;
import com.huynhhoapy97.enums.Size;
import com.huynhhoapy97.models.Supplement;

public interface SupplementBuilder {
    SupplementBuilder addBrand(Brand brand);
    SupplementBuilder addCategory(Category category);
    SupplementBuilder addFlavor(Flavor flavor);
    SupplementBuilder addSize(Size size);
    Supplement build();
}
