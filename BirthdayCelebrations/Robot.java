package edu.softuni.polymorphism.BirthdayCelebrations;

public class Robot implements Birthdaydate{
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public void birthdaysCelebrate() {

    }
}
