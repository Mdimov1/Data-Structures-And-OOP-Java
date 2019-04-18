package edu.fmi;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int f = 0; f < n-i; f++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
