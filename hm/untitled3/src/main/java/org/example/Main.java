package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        arr.add(new Manager(34, "Karl", 50000));
        arr.add(new Executive(25, "Leon", 28000));
        arr.add(new Programmer(23, "Alisa", 35000));
        arr.add(new Programmer(25, "Robert", 35000));
        arr.add(new Secretary(29, "Clara", 20000));

        for (int i = 0; i < arr.size(); ++i) {
            arr.get(i).getSomeInformation();
            if (!(arr.get(i) instanceof Executive) && arr.get(i) instanceof Manager manager) {
                for (int j = 0; j < arr.size(); ++j) {
                    if (arr.get(j) instanceof Executive executive) {
                        manager.giveTask(executive);
                    }
                }
            } else if (arr.get(i) instanceof Executive executive) {
                if (Objects.equals(executive.getCondition(), "are working")) {
                    executive.finishWork();
                }
            } else if (arr.get(i) instanceof Programmer programmer) {
                programmer.appendCode("System.out.println(\"Hello, World!\")\n");
                programmer.clearCode();
                programmer.doTest();
            } else if (arr.get(i) instanceof Secretary secretary) {
                secretary.bringTea();
            } else {
                System.out.println("You must give the employee a position!");
            }
            System.out.println();
        }
    }
}

