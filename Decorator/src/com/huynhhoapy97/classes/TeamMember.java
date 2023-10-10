package com.huynhhoapy97.classes;

import com.huynhhoapy97.abstracts.EmployeeDecorator;
import com.huynhhoapy97.interfaces.EmployeeComponent;

public class TeamMember extends EmployeeDecorator {
    public TeamMember(EmployeeComponent employee) {
        super(employee);
    }

    private void reportTask(){
        System.out.println(this.employee.getName() + " is reporting task");
    }

    private void coordinateWithColleagues(){
        System.out.println(this.employee.getName() + " is coordinating with colleagues");
    }

    @Override
    public void doTask() {
        this.employee.doTask();
        reportTask();
        coordinateWithColleagues();
    }
}
