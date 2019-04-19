package edu.softuni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name = reader.readLine();
		int age = Integer.parseInt(reader.readLine());

		try {
			Chicken chicken = new Chicken(name, age);
			double key = chicken.productPerDay(age);
			DecimalFormat df = new DecimalFormat("#.##");

			System.out.printf("Chicken " + name + " (age " + age +
					") can produce " + df.format(key) + " eggs per day.");

		} catch (IllegalArgumentException i){
			System.out.println(i.getMessage());
		}
	}
}
