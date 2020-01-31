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
            String str = reader.readLine();
            Box<String> box = new Box(str);
            boxes.add(box);
        }

        String[] indexes = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        swap(boxes, firstIndex, secondIndex);

        for (Box box: boxes) {
            System.out.println(box.toString());
        }
    }

    static void swap(List<Box> currentList, int indexOne, int indexTwo){
        Box tipBox = currentList.get(indexOne);

        currentList.set(indexOne, currentList.get(indexTwo));
        currentList.set(indexTwo, tipBox);
    }
}
