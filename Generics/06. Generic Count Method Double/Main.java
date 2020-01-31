package edu.exerciseone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Box<Double> box = new Box();

        double str = Double.parseDouble(reader.readLine());
        box.addElement(str);

        for (int i = 0; i < n - 1; i++) {
            str = Double.parseDouble(reader.readLine());
            box.addElement(str);
        }

        double el = Double.parseDouble(reader.readLine());
        int countGreaterElements = box.compareTo(el);

        System.out.println(countGreaterElements);

    }
}
