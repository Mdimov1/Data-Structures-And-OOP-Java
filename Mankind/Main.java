package edu.softuni;

import java.util.Scanner;

public class Main {

/*    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] student = reader.readLine().split(" ");
        Student student1 = new Student(student[0], student[1], Integer.parseInt(student[2]));

        String[] worker = reader.readLine().split(" ");
        Worker worker1 = new Worker(worker[0], worker[1], Double.parseDouble(worker[2]),
                Double.parseDouble(worker[3]));

        System.out.println(student1);
        System.out.println(worker1);
    }*/
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] student = scr.nextLine().split(" ");
        Student student1 = new Student(student[0], student[1], Integer.parseInt(student[2]));

        String[] worker = scr.nextLine().split(" ");
        Worker worker1 = new Worker(worker[0], worker[1], Double.parseDouble(worker[2]),
                Double.parseDouble(worker[3]));

        System.out.println(student1);
        System.out.println(worker1);
    }
}
