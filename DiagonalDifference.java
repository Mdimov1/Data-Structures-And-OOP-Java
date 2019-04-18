package edu.fmi;

import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] matrix) {
        int leftSum = 0;
        int rightSum = 0;
        int difference;

        for (int i = 0; i < matrix.length; i++) {
            leftSum += matrix[i][i];
        }
        for (int d = 0; d < matrix.length; d++) {
                rightSum += matrix[matrix.length-1-d][d];

        }
        difference = Math.abs(leftSum - rightSum);
        return difference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = sc.nextLine().split(" ");
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int m = 0; m < n; m++) {
                //int arrItem = Integer.parseInt(arrRowItems[m]);
                matrix[i][m] = sc.nextInt();
            }
        }
        int result = diagonalDifference(matrix);
        System.out.println(result);
    }
}
