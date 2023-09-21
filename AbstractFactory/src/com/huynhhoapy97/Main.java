package com.huynhhoapy97;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.enums.RegionName;
import com.huynhhoapy97.factories.RegionFactory;
import com.huynhhoapy97.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = RegionFactory.rentRegionStore(RegionName.HOCHIMINHCITY);
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
