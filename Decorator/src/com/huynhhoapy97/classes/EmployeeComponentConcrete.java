package com.huynhhoapy97.classes;

import com.huynhhoapy97.interfaces.EmployeeComponent;

public class EmployeeComponentConcrete implements EmployeeComponent {
    private String name;

    public EmployeeComponentConcrete(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void doTask() {
        // Unsigned task
    }
}
