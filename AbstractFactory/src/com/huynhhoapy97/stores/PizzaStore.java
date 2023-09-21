package com.huynhhoapy97.stores;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.models.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
