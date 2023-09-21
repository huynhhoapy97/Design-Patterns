package com.huynhhoapy97.factories;

import com.huynhhoapy97.enums.RegionName;
import com.huynhhoapy97.stores.HanoiPizzaStore;
import com.huynhhoapy97.stores.HoChiMinhCityPizzaStore;
import com.huynhhoapy97.stores.PizzaStore;

public class RegionFactory {
    private static PizzaStore pizzaStore;

    private RegionFactory() {

    }

    public static PizzaStore rentRegionStore(RegionName name) {
        switch (name){
            case HOCHIMINHCITY:
                pizzaStore = new HoChiMinhCityPizzaStore();
                break;
            case HANOI:
                pizzaStore = new HanoiPizzaStore();
                break;
            default:
                pizzaStore = null;
        }

        return pizzaStore;
    }
}
