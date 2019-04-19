package edu.softuni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String line = reader.readLine();

        String[] text = line.split("[=;\\s+]");
        //Create persons
        for (int i = 0; i < text.length; i+=2) {
            Person person = new Person(text[i], Integer.parseInt(text[i+1]));
            people.add(person);
        }

        text = line.split("[=;\\s+]");
        //Create products
        for (int i = 0; i < text.length; i+=2) {
            Product product = new Product(text[i], Integer.parseInt(text[i+1]));
            products.add(product);
        }

        //Add to persons products
        while (!line.contains("END")){
            text = line.split("[=;\\s+]");

            String namePerson = people.get(0).getName();
            if(namePerson.equals(text[0])){
                people.get(0).boughtOrNot(text[1], );
            }
        }
    }
}
