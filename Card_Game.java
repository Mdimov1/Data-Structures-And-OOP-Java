/*
Input:
    Strings Player1 and Player2 consist only of the
    following characters: 2-9, J, Q, K, A
 */

package edu.softuni.polymorphism.DemoTest;

import java.util.HashMap;
import java.util.Scanner;

public class Card_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> cardPoints = new HashMap<>();
        cardPoints.put("2", 2);
        cardPoints.put("3", 3);
        cardPoints.put("4", 4);
        cardPoints.put("5", 5);
        cardPoints.put("6", 6);
        cardPoints.put("7", 7);
        cardPoints.put("8", 8);
        cardPoints.put("9", 9);
        cardPoints.put("J", 10);
        cardPoints.put("Q", 11);
        cardPoints.put("K", 12);
        cardPoints.put("A", 13);

        System.out.print("Please, enter Player1 cards: ");
        String Player1 = input.nextLine();
        System.out.print("Please, enter Player2 cards: ");
        String Player2 = input.nextLine();

        String[] cardsP1 = Player1.split("");
        String[] cardsP2 = Player2.split("");

        int player1Points = 0;
        int player2Points = 0;

        for (int i = 0; i < cardsP1.length; i++) {
            if (cardPoints.get(cardsP1[i]) > cardPoints.get(cardsP2[i])){
                player1Points++;
            } else if (cardPoints.get(cardsP1[i]) < cardPoints.get(cardsP2[i])){
                player2Points++;
            }
        }

        if(player1Points > player2Points){
            System.out.printf("The winner is Player1 with %d points.", player1Points);
        } else if (player2Points > player1Points){
            System.out.printf("The winner is Player2 with %d points.", player2Points);
        } else {
            System.out.printf("Player1 and Player2 have an equal results, %d points", player1Points);
        }
    }
}
