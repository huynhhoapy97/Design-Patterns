package com.huynhhoapy97.classes;

import com.huynhhoapy97.abstracts.EmployeeDecorator;
import com.huynhhoapy97.interfaces.EmployeeComponent;

public class Manager extends EmployeeDecorator {
    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    private void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    private void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    private void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        this.employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
