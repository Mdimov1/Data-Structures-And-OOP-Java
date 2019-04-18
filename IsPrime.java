package edu.fmi;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(double num) {
        boolean result = false;
        if (num <= 0)
        {
            result = false;
        } else
            {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        ArrayList primeNums=new ArrayList();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if(isPrime(i)){
                primeNums.add(i);
            }
        }
        System.out.println("All prime nums are: " + primeNums);
    }
}
