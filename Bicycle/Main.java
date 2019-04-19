package edu.fmi;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Bicycle b = new Bicycle(1,3,2);
        System.out.println(b);
		
        MtnBike a = new MtnBike(2,3,4,5,6);
        System.out.println(a);
    }
}
