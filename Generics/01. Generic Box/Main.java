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
        List<Box<String>> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Box box = new Box(reader.readLine());
            boxes.add(box);
        }

        for (Box box: boxes) {
            System.out.println(box.toString());
        }
    }
}
