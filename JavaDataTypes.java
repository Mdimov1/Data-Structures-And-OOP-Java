package edu.fmi;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] nums = new String[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.next();
        }

        for (int m = 0; m < n; m++) {
            try {
                long num = Long.parseLong(nums[m]);

                System.out.println(nums[m] + " can be fitted in:");
                if ( num >= Math.pow(-2, 7) && num <= (Math.pow(2, 7) - 1)){
                    System.out.println("* byte");
                } if ( num >= Math.pow(-2, 15) && num <= (Math.pow(2, 15) - 1)){
                    System.out.println("* short");
                } if  ( num >= Math.pow(-2, 31) && num <= (Math.pow(2, 31) - 1)){
                    System.out.println("* int");
                } if ( num >= Math.pow(-2, 63) && num <= (Math.pow(2, 63) - 1)){
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(nums[m] + " can't be fitted anywhere.");
                continue;
            }
        }
    }
}
