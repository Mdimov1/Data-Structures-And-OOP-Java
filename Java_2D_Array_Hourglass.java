package edu.softuni.polymorphism.DemoTest;

import java.util.Scanner;

public class Java_2D_Array_Hourglass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = sc.nextLine().split(" ");
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }
            sc.close();

            int result = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    result = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                            + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                            + arr[i + 2][j + 2];
                    if (result > maxSum) {
                        maxSum = result;
                    }
                }
            }
            System.out.println(maxSum);
    }
}
