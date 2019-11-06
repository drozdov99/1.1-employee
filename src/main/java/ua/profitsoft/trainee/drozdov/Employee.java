package ua.profitsoft.trainee.drozdov;

public abstract class Employee {

    private double fullSalary;
    private int hoursWorked;

    public Employee(double fullSalary, int hoursWorked) {
        this.fullSalary = fullSalary;
        this.hoursWorked = hoursWorked;
    }

    public double getPercentageOfHoursWorked(int workedHoursPerMonth){
        return ((double) hoursWorked) / workedHoursPerMonth;
    }

    /**
     * @param hoursInMonth
     * @return salary according to the number of hours worked
     * @throws IllegalArgumentException if employee's worked hours or salary less then 0
     */
    public double getMonthlySalary(int hoursInMonth) throws IllegalArgumentException {
        if(getHoursWorked() < 0 || getFullSalary() < 0) {
            throw new IllegalArgumentException();
        }
        return getPercentageOfHoursWorked(hoursInMonth) * fullSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getFullSalary() {
        return fullSalary;
    }

    public void setFullSalary(double fullSalary) {
        this.fullSalary = fullSalary;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
