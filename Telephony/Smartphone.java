package edu.softuni.polymorphism.Telephony;

public class Smartphone implements Call, Browse{
    private String phoneNumber;
    private String site;


    public Smartphone(String phoneNumber, String site) {
        this.phoneNumber = phoneNumber;
        this.site = site;
    }

    @Override
    public String browseInWWW() {
        return String.format("Browsing: %s!", site);
    }

    @Override
    public String callingOtherPhones() {
        return String.format("Calling... %s", phoneNumber);
    }
}
