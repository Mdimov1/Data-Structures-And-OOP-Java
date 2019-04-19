package edu.fmi;

public class Employee {
    private String firstName;
    private String lastName;
    private double workExperiance;
    private String position;

    public Employee(String firstName, String lastName, double workExperiance, String position) {
        if ((firstName!=null)&&(lastName!=null)&&(workExperiance>0)&&(position!=null)) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.workExperiance = workExperiance;
            this.position = position;
        }
    }
    public Employee(){
        this("","",0,"");
    }
   public Employee(Employee a) {
        this.firstName = a.firstName;
        this.lastName = a.lastName;
        this.workExperiance = a.workExperiance;
        this.position = a.position;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName!=null)
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName!=null)
        this.lastName = lastName;
    }

    public double getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(double workExperiance) {
        if (workExperiance>0)
        this.workExperiance = workExperiance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position!=null)
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", workExperiance=" + workExperiance +
                ", position='" + position + '\'' +
                '}';
    }
}
