package com.huynhhoapy97.abstracts;

import com.huynhhoapy97.interfaces.EmployeeComponent;

public abstract class EmployeeDecorator implements EmployeeComponent {
    protected EmployeeComponent employee;

    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getName();
    }
}
