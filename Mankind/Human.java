package edu.softuni;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    protected void setFirstName(String firstName) {

        if(!Character.isUpperCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case " +
                    "letter!Argument: firstName");
        } else if (firstName.length() < 4){
            throw new IllegalArgumentException("Expected length at least " +
                    "4 symbols!Argument: firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    protected void setLastName(String lastName) {
        if(!Character.isUpperCase(lastName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case " +
                    "letter!Argument: lastName");
        } else if (firstName.length() < 3){
            throw new IllegalArgumentException("Expected length at least " +
                    "4 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }
}
