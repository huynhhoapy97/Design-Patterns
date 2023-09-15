package com.huynhhoapy97;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.stores.HanoiPizzaStore;
import com.huynhhoapy97.stores.HoChiMinhCityPizzaStore;
import com.huynhhoapy97.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        /*PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);*/

        PizzaStore pizzaStore = new HoChiMinhCityPizzaStore();
        pizzaStore.orderPizza(PizzaType.DEFAULT);
    }
}
