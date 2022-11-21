package org.example;

public class Manager extends Employee {

    public Manager(int age, String name, int salary) {
        super(age, name, salary);
    }

    public void giveTask(Executive executive) {
        System.out.println("Manager " + this.getName() + " gave some task to Executive");
        executive.startWork();
    }
}

