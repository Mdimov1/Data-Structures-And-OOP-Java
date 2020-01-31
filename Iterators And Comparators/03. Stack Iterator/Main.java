package edu.exerciseTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        Stack<Integer> list = null;
        int counter = 0;
        String[] inputs = null;
        int[] intItems = null;

        while(!("END").equals(line = reader.readLine())){
            counter++;

            String[] cmdArgs = line.split("\\s+", 2);

            switch(cmdArgs[0]){
                case "Push":
                    inputs = cmdArgs[1].split("\\D+");
                    intItems = new int[inputs.length];

                    for (int i=0; i<inputs.length; i++) {
                        intItems[i] = Integer.parseInt(inputs[i]);
                    }

                    if(counter == 1){
                        list = new Stack<Integer>(intItems);
                    } else{
                        for (int i: intItems) {
                            list.push(i);
                        }
                    }
                    break;
                case "Pop":
                    list.pop();
                    break;
            }
        }
        list.printAll();
        list.printAll();
    }
}
