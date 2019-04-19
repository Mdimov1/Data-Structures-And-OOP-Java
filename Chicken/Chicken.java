package edu.softuni;

public class Chicken {
    private String name;
    private int age;
    private final int years = 15;

    public Chicken(){

    }

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double productPerDay(int age){
        if (age > 0 && age <= 5){
            return 2;
        } else if (age > 5 && age <= 11){
            return 1;
        } else if (age > 11 && age <= 15){
            return 0.75;
        }
        return age;
    }
}
