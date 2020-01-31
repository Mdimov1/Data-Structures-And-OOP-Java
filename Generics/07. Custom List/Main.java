package edu.exerciseone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList customList = new CustomList();
        String[] input = reader.readLine().split("\\s+");


        while(!input[0].equals("END")){

            switch (input[0]){
                case "Add":
                    customList.add(input[1]);
                    break;
                case "Remove":
                    customList.remove(input[1]);
                    break;
                case "Contains":
                    System.out.println(customList.contains(input[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(input[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax().toString());
                    break;
                case "Min":
                    System.out.println(customList.getMin().toString());
                    break;
                case "Print":
                    customList.print();
                    break;
            }

            input = reader.readLine().split("\\s+");
        }


    }
}
