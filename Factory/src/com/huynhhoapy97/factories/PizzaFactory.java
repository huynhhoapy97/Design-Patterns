package com.huynhhoapy97.factories;

import com.huynhhoapy97.enums.PizzaType;
import com.huynhhoapy97.models.*;

public class PizzaFactory {
    private static Pizza pizza;

    private PizzaFactory() {

    }

    public static Pizza createPizza(PizzaType type) {
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
                System.out.println("Wrong pizza type. The default flavor is cheese");
                pizza = new PizzaCheese();
        }

        return pizza;
    }
}
