package org.example;

public class Executive extends Manager {

    private String condition;

    public Executive(int age, String name, int salary) {
        super(age, name, salary);
        condition = "are free";
    }

    public final String getCondition() {
        return condition;
    }

    public void startWork() {
        System.out.println("Executive " + this.getName() + " started some work");
        condition = "are working";
    }

    public void finishWork() {
        System.out.println("Executive " + this.getName() + " finished some work");
        condition = "are free";
    }
}
