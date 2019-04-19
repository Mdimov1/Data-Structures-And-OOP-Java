package edu.softuni.polymorphism.BirthdayCelebrations;

public class Citizen implements Birthdaydate, Buyer{
    private String name;
    private int age;
    private String id;
    private String birthday;
    private String year;

    public Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void birthdaysCelebrate() {
        String birthYear = birthday.substring(6);

        if(birthYear.equals(year)){
            System.out.println(birthday);
        }
    }

    @Override
    public int buyFood() {
        return 0;
    }
}
