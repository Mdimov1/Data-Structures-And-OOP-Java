package edu.softuni;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public void setLastName(){
        if(super.getLastName().length() <= 3){
            throw new IllegalArgumentException("Expected length more than 3 " +
                    "symbols!Argument: lastName");
        }
    }

    public double getWeekSalary() {
        return this.weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10){
            throw new IllegalArgumentException("Expected value mismatch!" +
                    "Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return this.workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if(workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!" +
                    "Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s \nLast Name: %s \nWeek Salary: %.2f " +
                "\nHours per day: %.2f \nSalary per hour: %.2f",
                super.getFirstName(), super.getLastName(), this.getWeekSalary(),
                this.getWorkHoursPerDay(), this.getWeekSalary()/(this.getWorkHoursPerDay()*7));
    }
}
