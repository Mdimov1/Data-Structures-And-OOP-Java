package edu.fmi;

public class RegularSraff extends Employee {
    private double salary;

    public RegularSraff(String firsName, String lastName, double workExperience, String position, double salary) {
        super(firsName, lastName, workExperience, position);
        if (salary > 0)
            this.salary = salary;
    }

    public RegularSraff() {
        super();
        this.salary = 0;
    }

    public RegularSraff(RegularSraff b) {
        super(b);
        this.salary = b.salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            for (int i = 1; i <= getWorkExperiance(); i++) {
                salary = salary + (salary*0.2);
            }
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "RegularSraff{" +
                "salary=" + salary +
                '}';
    }
}