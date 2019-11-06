package ua.profitsoft.trainee.drozdov;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Accountant {
    private static final Logger log = Logger.getLogger(Accountant.class.getName());

    private static Accountant instance;

    public static Accountant getInstance() {
        if (instance == null) {
            instance = new Accountant();
        }
        return instance;
    }

    public double getTotalSalary(List<Employee> employees, int hoursInMonth){
        double totalSalary = 0;
        for (Employee e : employees) {
            try {
                totalSalary += e.getMonthlySalary(hoursInMonth);
            } catch (IllegalArgumentException ex) {
                log.log(Level.INFO,"Salary or number of hours couldn't be less then 0", ex);
            }
        }
        return totalSalary;
    }
}
