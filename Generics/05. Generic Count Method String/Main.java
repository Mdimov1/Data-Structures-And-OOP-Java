package edu.exerciseone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Box<String> box = new Box();

        String str = reader.readLine();
        box.addElement(str);

        for (int i = 0; i < n - 1; i++) {
            str = reader.readLine();
            box.addElement(str);
        }

        String el = reader.readLine();
        int countGreaterElements = box.compareTo(el);

        System.out.println(countGreaterElements);

    }
}
