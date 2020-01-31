package edu.exerciseTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        ListyIterator<String> list = null;

        while(!("END").equals(line = reader.readLine())){
            String[] cmdArgs = line.split("\\s+", 2);

            switch (cmdArgs[0]){
                case "Create":
                    list = new ListyIterator<>(cmdArgs[1].split("\\s+"));
                    break;
                case "Move":
                    System.out.println(list.move());
                    break;
                case "Print":
                    list.print();
                    break;
                case "HasNext":
                    System.out.println(list.hasNext());
                    break;
                case "PrintAll":
                    list.printAll();
                    break;
            }
        }
    }
}
