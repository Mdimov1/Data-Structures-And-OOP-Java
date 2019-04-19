package edu.softuni.polymorphism.Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String driverName = scanner.nextLine();
        Cars ferrari = new Ferrari(driverName);
        System.out.println(ferrari);
    }
}
