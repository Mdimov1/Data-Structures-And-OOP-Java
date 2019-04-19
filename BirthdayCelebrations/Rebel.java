package edu.softuni.polymorphism.BirthdayCelebrations;

public class Rebel implements Buyer{
    private String name;
    private int age;
    private String group;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int buyFood() {
        return 0;
    }
}
