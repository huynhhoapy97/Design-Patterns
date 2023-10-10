package com.huynhhoapy97.classes;

import com.huynhhoapy97.abstracts.EmployeeDecorator;
import com.huynhhoapy97.interfaces.EmployeeComponent;

public class Leader extends EmployeeDecorator {
    public Leader(EmployeeComponent employee) {
        super(employee);
    }

    private void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    private void motivate() {
        System.out.println(this.employee.getName() + " is motivating the members.");
    }

    private void monitor() {
        System.out.println(this.employee.getName() + " is monitoring the members.");
    }

    @Override
    public void doTask() {
        this.employee.doTask();
        planing();
        motivate();
        monitor();
    }
}
