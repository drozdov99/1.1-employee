package ua.profitsoft.trainee.drozdov;

public class Manager extends Employee {

    public Manager(double fullSalary, int hoursWorked) {
        super(fullSalary, hoursWorked);
    }

    /**
     * @param hoursInMonth
     * @return salary according to the number of hours worked if worked hours less than hours in month
     * and full salary if worked hour greater or equals than hours in month
     * @throws IllegalArgumentException if employee's worked hours or salary less then 0
     */
    @Override
    public double getMonthlySalary(int hoursInMonth) throws IllegalArgumentException {
        if(getFullSalary() < 0 || getHoursWorked() < 0) {
            throw new IllegalArgumentException();
        }
        return getPercentageOfHoursWorked(hoursInMonth) >= 1 ? getFullSalary() : super.getMonthlySalary(hoursInMonth);
    }
}

