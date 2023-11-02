package com.huynhhoapy97.concretefactory;

import com.huynhhoapy97.abstractfactory.MaterialFactory;
import com.huynhhoapy97.concretemodel.PlasticChair;
import com.huynhhoapy97.concretemodel.PlasticTable;
import com.huynhhoapy97.model.Chair;
import com.huynhhoapy97.model.Table;

public class PlasticFactory implements MaterialFactory {
    @Override
    public void createTable() {
        Table table = new PlasticTable();
        table.showMaterial();
    }

    @Override
    public void createChair() {
        Chair chair = new PlasticChair();
        chair.showMaterial();
    }
}
