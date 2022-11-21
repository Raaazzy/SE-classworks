package org.example;

public class Secretary extends Employee {

    public Secretary(int age, String name, int salary) { super(age, name, salary); }

    public void bringTea() {
        System.out.println("Boss want to drink tea...");
        System.out.println("Secretary: \"Already carry!\"");
    }
}

