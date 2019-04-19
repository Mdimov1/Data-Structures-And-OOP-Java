package edu.softuni;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    private static final String DEFAULT_EMAIL = "n/a";
    private static final int DEFAULT_AGE = -1;

    public Employee(String name, double salary, String position, String department){
        this(name, salary, position, department, DEFAULT_EMAIL, DEFAULT_AGE);
    }

    public Employee(String name, double salary, String position, String department, String email){
        this(name, salary, position, department, email, DEFAULT_AGE);
    }

    public Employee(String name, double salary, String position, String department, int age){
        this(name, salary, position, department, DEFAULT_EMAIL, age);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static String getDefaultEmail() {
        return DEFAULT_EMAIL;
    }

    public static int getDefaultAge() {
        return DEFAULT_AGE;
    }

    public Employee(String name, double salary, String position, String department, String email, int age){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }
}
