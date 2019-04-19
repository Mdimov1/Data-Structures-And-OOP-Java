package edu.softuni.polymorphism.Telephony;

import java.util.Scanner;

public class Main {
    private static final String DEFAULT_SITE = "";
    private static final String DEFAULT_PHONE_NUMBER = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String[] phoneNumbers = firstLine.split("\\s+");

        String secondLine = scanner.nextLine();
        String[] sites = secondLine.split("\\s+");

        //Call
        for (int i = 0; i < phoneNumbers.length; i++) {
            Call sm = new Smartphone(phoneNumbers[i], DEFAULT_SITE);
            System.out.println(sm.callingOtherPhones());
        }
        //Browse
        for (int i = 0; i < sites.length; i++) {
            if(sites[i].matches(".*\\d.*")){
                System.out.println("Invalid URL!");
            } else {
                Browse sm = new Smartphone(DEFAULT_PHONE_NUMBER,sites[i]);
                System.out.println(sm.browseInWWW());
            }
        }
    }
}
