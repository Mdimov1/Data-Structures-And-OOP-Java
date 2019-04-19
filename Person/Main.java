package edu.softuni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String text;
        int n = scanner.nextInt();
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            try {
                text = br.readLine();
                String[] line = text.split(" ");

                if (Integer.parseInt(line[1]) > 30) {
                    Person person = new Person(line[0], Integer.parseInt(line[1]));
                    persons.add(person);
                    System.out.println(person.getName() + " - " + person.getAge());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
