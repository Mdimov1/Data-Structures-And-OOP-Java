package edu.softuni;

public class Student extends Human{
    private int facultyNumber;

    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public int getFacultyNumber() {
        return this.facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        String num = Integer.toString(facultyNumber);

        if(num.length() < 5 || num.length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s \nLast Name: %s " +
                "\nFaculty number: %d", super.getFirstName(), super.getLastName(),
                this.getFacultyNumber());
    }
}
