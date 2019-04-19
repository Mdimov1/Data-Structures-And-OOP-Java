package edu.softuni.polymorphism.DefineAnInterfacePerson;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String birthDate;
    private String id;

    public Citizen(String name, int age, String birthDate, String id) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.id = id;
    }

    @Override
    public String getBirthdate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
}
