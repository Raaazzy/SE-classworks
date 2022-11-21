package org.example;

public class Programmer extends Employee implements Raisable {

    private String code;

    public Programmer(int age, String name, int salary) {
        super(age, name, salary);
        code = "";
    }

    public void appendCode(String code) {
        System.out.println("Code appended");
        this.code += code;
    }

    public String showCode() { return code; }

    public void clearCode() {
        System.out.println("Code cleared");
        this.code = "";
    }

    @Override
    public void doTest() {
        if (this.getName() == "Robert") {
            System.out.println("Programmer Robert passed the test");
            giveBonus();
        }
        else {
            System.out.println("Programmer Robert didn't pass the test");
        }
    }

    @Override
    public void giveBonus() {
        this.salary += 1000;
        System.out.println("Programmer's salary: " + this.salary);
    }
}