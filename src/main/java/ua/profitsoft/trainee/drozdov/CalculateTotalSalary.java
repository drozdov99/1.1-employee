package ua.profitsoft.trainee.drozdov;

import java.util.ArrayList;
import java.util.List;

public class CalculateTotalSalary {

    /**
     * Demo
     */
    public static void main(String[] args) {

        Employee employee1 = new Developer(100, -5);
        Employee employee2 = new Manager(100, 100);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);

        Accountant accountant = new Accountant();
        System.out.println( accountant.getTotalSalary(employees, 160));

    }
}
