package com.huynhhoapy97.concretefactory;

import com.huynhhoapy97.abstractfactory.MaterialFactory;
import com.huynhhoapy97.concretemodel.WoodChair;
import com.huynhhoapy97.concretemodel.WoodTable;
import com.huynhhoapy97.model.Chair;
import com.huynhhoapy97.model.Table;

public class WoodFactory implements MaterialFactory {
    @Override
    public void createTable() {
        Table table = new WoodTable();
        table.showMaterial();
    }

    @Override
    public void createChair() {
        Chair chair = new WoodChair();
        chair.showMaterial();
    }
}
