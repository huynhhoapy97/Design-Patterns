package com.huynhhoapy97;

import com.huynhhoapy97.abstractfactory.MaterialFactory;
import com.huynhhoapy97.concretefactory.PlasticFactory;
import com.huynhhoapy97.concretefactory.WoodFactory;

public class Main {
    public static void main(String[] args) {
        MaterialFactory plastic = new PlasticFactory();
        plastic.createChair();
        plastic.createTable();

        MaterialFactory wood = new WoodFactory();
        wood.createChair();
        wood.createTable();
    }
}
