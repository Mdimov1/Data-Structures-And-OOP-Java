package edu.fmi;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {

        Arrays.sort(ar);
        int maxNum = ar[ar.length-1];
        int numCandles = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxNum){
                numCandles++;
            }
        }
        return numCandles;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arCount = sc.nextInt();

        int[] ar = new int[arCount];

        String[] arItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = sc.nextInt();
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);
    }
}
