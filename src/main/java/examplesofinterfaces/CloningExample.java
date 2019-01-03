package examplesofinterfaces;

import interfaces.Employee;

public class CloningExample {
    public static void main(String[] args) {
        Employee original = new Employee("John Public", 50000);
        Employee copy = original;
        copy.raiseSalary(10);

        //don't do this, it will change the original.
        //use clone instead

        Employee copy = original.clone();
        copy.raiseSalary(10);
    }
}
