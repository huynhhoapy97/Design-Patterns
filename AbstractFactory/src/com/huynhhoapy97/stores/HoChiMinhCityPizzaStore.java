package com.huynhhoapy97.stores;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.models.*;

public class HoChiMinhCityPizzaStore extends PizzaStore {
    private Pizza pizza;

    public HoChiMinhCityPizzaStore() {

    }

    @Override
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type){
            case CORN:
                pizza = new PizzaCorn();
                break;
            case BANANA:
                pizza = new PizzaBanana();
                break;
            case CHEESE:
                pizza = new PizzaCheese();
                break;
            case HONEY:
                pizza = new PizzaHoney();
                break;
            default:
                System.out.println("The default flavor is banana");
                pizza = new PizzaBanana();
        }

        return pizza;
    }
}
