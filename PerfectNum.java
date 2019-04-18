package edu.fmi;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNum {
    public static boolean isPerfect(double num){
        boolean result = false;
        int sum = 0 ;

        for (int i = 1; i < num; i++){
            if (num%i==0) {
                sum += i;
            }
        }
        if (sum == num)
            result = true;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num:");
        int n = sc.nextInt();
        ArrayList prefectNums = new ArrayList();

        for (int i = 1; i <= n; i++)
        {
            if (isPerfect(i))
                prefectNums.add(i);
        }
        System.out.println("All perfect nums are: "+prefectNums);
    }
}
