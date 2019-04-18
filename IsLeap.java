package edu.fmi;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static boolean isLeap(int year)
    {
        boolean leap = false;

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            leap = true;
        return leap;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Въведете рожденна година: ");
        int year = input.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthDays = 0;

        if (isLeap(year))
        {
            for (int i = 0; i <= currentYear - year; i += 4)
            {
                birthDays = i / 4;
            }
            System.out.printf("Имал е %d рожденни дни!", birthDays);
        }
        else
        {
            System.out.print("Годината не е високосна!");
        }
    }
}
