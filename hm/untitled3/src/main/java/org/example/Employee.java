package org.example;

import java.util.ArrayList;

public abstract class Employee {

    private int age;
    private String name;
    protected int salary;

    public Employee(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public final int getAge() {
        return age;
    }

    public final String getName() {
        return name;
    }

    public final int getSalary() {
        return salary;
    }

    public final String getProf() {
        return this.getClass().getName().split("\\.")[this.getClass().getName().split("\\.").length - 1];
    }

    public void getSomeInformation() {
        System.out.println("I'm an " + this.getProf() + ". My name is " + this.getName() + " and I'm " + this.getAge() + " y.o. I earn " + this.getSalary() + " rubles a month.");
    }
}

