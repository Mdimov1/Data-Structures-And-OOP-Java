package edu.softuni;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    protected void setAge(int age) {
        if (age >= 15 || age < 1){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}
