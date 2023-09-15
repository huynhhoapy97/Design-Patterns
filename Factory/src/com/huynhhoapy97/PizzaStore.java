package com.huynhhoapy97;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.factories.PizzaFactory;
import com.huynhhoapy97.models.*;

public class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
