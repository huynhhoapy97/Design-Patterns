package com.huynhhoapy97;

import com.huynhhoapy97.abstracts.EmployeeDecorator;
import com.huynhhoapy97.classes.EmployeeComponentConcrete;
import com.huynhhoapy97.classes.Leader;
import com.huynhhoapy97.classes.Manager;
import com.huynhhoapy97.classes.TeamMember;
import com.huynhhoapy97.interfaces.EmployeeComponent;

public class Main {
    public static void main(String[] args) {
        EmployeeComponent employee = new EmployeeComponentConcrete("Hoa Truong");

        System.out.println("-------- TEAM MEMBER --------");
        EmployeeComponent member = new TeamMember(employee);
        member.doTask();

        System.out.println("-------- LEADER --------");
        EmployeeComponent leader = new Leader(employee);
        leader.doTask();

        System.out.println("-------- MANAGER --------");
        EmployeeComponent manager = new Manager(employee);
        manager.doTask();

        System.out.println("-------- LEADER was added some roles like MANAGER --------");
        EmployeeComponent leaderAndManager = new Manager(leader);
        leaderAndManager.doTask();
    }
}
