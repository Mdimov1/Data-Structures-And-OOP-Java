package edu.fmi;

import java.util.Scanner;

public class Main {

    public static void Caesar(String text, int num) {
        //Цикъл въртящ се от нула до броя на символите в text
        for (int i = 0; i < text.length(); i++)
        {
            char symbol = text.charAt(i);
            //Условие проверяващо за спейсове
            if (text.charAt(i) == 32) {
                System.out.print(" ");
            }
            //Условие проверяващо дали i-тия символ в text съдържа буква
            else if ("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".indexOf(symbol) != -1) {
                //Цикъл шифриращ малките букви в text
                for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                    if (text.charAt(i) == alphabet) {
                        if ((alphabet + num) > 122)
                            System.out.print((char) (96 + ((alphabet + num) - 122)));
                        else
                            System.out.print((char) (alphabet + num));
                    }
                }
                //Цикъл шифриращ главните букви в text
                for (char alphabet2 = 'A'; alphabet2 <= 'Z'; alphabet2++) {
                    if (text.charAt(i) == alphabet2) {
                        if ((alphabet2 + num) > 90) {
                            System.out.print((char) (64 + ((alphabet2 + num) - 90)));
                        } else
                            System.out.print((char) (alphabet2 + num));
                    }
                }
            }
            //Изписва въведеният символ различен от буква(анг) или спейс
            else
                System.out.print(symbol);
        }
    }

    public static void InverseMethodOfCaesar(String text, int num) {
        //Цикъл въртящ се от нула до броя на символите в text
        for (int i = 0; i < text.length(); i++)
        {
            char symbol = text.charAt(i);
            //Условие проверяващо за спейсове
            if (text.charAt(i) == 32) {
                System.out.print(" ");
            }
            //Условие проверяващо дали i-тия символ в text съдържа буква
            else if ("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".indexOf(symbol) != -1) {
                //Цикъл дешифриращ малките букви в text
                for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                    if (text.charAt(i) == alphabet) {
                        if ((alphabet - num) < 97)
                            System.out.print((char) (122 - (96 - (alphabet - num))));
                        else
                            System.out.print((char) (alphabet - num));
                    }
                }
                //Цикъл дешифриращ главните букви в text
                for (char alphabet2 = 'A'; alphabet2 <= 'Z'; alphabet2++) {
                    if (text.charAt(i) == alphabet2) {
                        if ((alphabet2 - num) < 65) {
                            System.out.print((char) (90 - (64 - (alphabet2 - num))));
                        } else
                            System.out.print((char) (alphabet2 - num));
                    }
                }
            }
            //Изписва въведеният символ различен от буква(анг) или спейс
            else
                System.out.print(symbol);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter num: ");
        int num = input.nextInt();

        if (num > 0 && num < 27) {
            Caesar(text, num);
            System.out.println();
            InverseMethodOfCaesar(text, num);
        }
        else
            System.out.println("Unvalid input!");
    }
}
