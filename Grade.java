package edu.fmi;

import java.util.Scanner;

public class Main {

    public static double grade(double uspeh) {
        if (uspeh >= 2.0 && uspeh < 3.0)
            System.out.print("Слаб ");
        else if (uspeh >= 3.0 && uspeh < 3.5)
            System.out.print("Среден ");
        else if (uspeh >= 3.5 && uspeh < 4.5)
            System.out.print("Добър ");
        else if (uspeh >= 4.5 && uspeh < 5.5)
            System.out.print("Много добър ");
        else if (uspeh >= 5.5 && uspeh <= 6.0)
            System.out.print("Отличен ");
        else
            System.out.print("Няма такава оценка! ");
        return uspeh;
    }

    public static boolean isValidName(String name)
    {
        boolean b = true;

        for (int i = 0; i < name.length(); i++) {
            if ("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".indexOf(name.charAt(i)) == -1)
                b = false;
        }
        return b;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Scanner input = new Scanner(System.in);

        System.out.print("Въведете факултетен номер: ");
        int fn = sc.nextInt();

        System.out.print("Въведете име: ");
        String firstname = input.nextLine();

        while(!isValidName(firstname)){
            System.out.print("Моля, въведете правилно името: ");
            firstname = input.nextLine();
        }

        System.out.print("Въведете фамилия: ");
        String lastName = input.nextLine();

        while(!isValidName(lastName)){
            System.out.print("Моля, въведете правилно фамилията: ");
            lastName = input.nextLine();
        }

        System.out.print("Въведете успех: ");
        double uspeh = sc.nextDouble();

        System.out.printf("%.2f", grade(uspeh));
    }
}
