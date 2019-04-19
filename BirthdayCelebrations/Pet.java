package edu.softuni.polymorphism.BirthdayCelebrations;

public class Pet implements Birthdaydate{
    private String name;
    private String birthday;
    private String year;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void setYear(String year){
        this.year = year;
    }

    @Override
    public void birthdaysCelebrate() {
        String birthYear = birthday.substring(6);

        if(birthYear.equals(year)){
            System.out.println(birthday);
        }
    }
}
