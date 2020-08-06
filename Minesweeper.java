package my.edu;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    private static String ENTER_MOVE_USER = "Enter your move, (row, column)\n->";
    private static int[][] board;
    private static int numberOfMines;
    private static boolean showMines;

    public static void main(String[] args) {
        System.out.println("Enter the Difficulty Level");
        System.out.println("Press 0 for BEGINNER 9 * 9 Cells and 10 Mines");
        System.out.println("Press 1 for INTERMEDIATE 16 * 16 Cells and 40 Mines");
        System.out.println("Press 2 for BEGINNER 24 * 24 Cells and 99 Mines");

        Scanner scanner = new Scanner(System.in);

        // Read game level
        int level = scanner.nextInt();

        // If level is not valid, enter level again
        while(level != 0 && level != 1 && level != 2){
            System.out.println("Please, enter valid level!");
            level = scanner.nextInt();
        }

        // 2D Array for the board
        switch (level){
            case 0:
                board = new int[9][9];
                numberOfMines = 10;
                break;
            case 1:
                board = new int[16][16];
                numberOfMines = 40;
                break;
            case 2:
                board = new int[24][24];
                numberOfMines = 99;
                break;
        }

        // First Fill the board with not moves ect. 0
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }

        // Second Fill the board with random mines
        setMinesInBoard(board, numberOfMines);

        // Print the board in the start
        printBoard(board, showMines);

        // User move
        System.out.print(ENTER_MOVE_USER);
        int i = Integer.parseInt(scanner.next());
        int j = Integer.parseInt(scanner.next());

        // Read move while there is not on mines
        while(board[i][j] != 3){
            board[i][j] = 2;
            printBoard(board, showMines);

            System.out.print(ENTER_MOVE_USER);

            i = Integer.parseInt(scanner.next());
            j = Integer.parseInt(scanner.next());
        }

        // On mine
        if(board[i][j] == 3){
            showMines = true;
            printBoard(board, showMines);
            System.out.println();
            System.out.println("You Lose!");
        }
    }

    // This method can print board with mines and without mines
    private static void printBoard(int[][] board, boolean mines){
        System.out.println("Current Status of Board :");

        // Print first line
        System.out.print("    ");
        for (int i = 0; i < board.length; i++) {
            System.out.printf(" %d", i);
        }

        System.out.println();

        for (int i = 0; i < board.length; i++) {
            System.out.printf("%d  ", i);

            // For a better view if the i is less than 10, we will print one more " "
            if(i < 10){
                System.out.print(" ");
            }

            for (int j = 0; j < board.length; j++) {
                // For a better view if the i is bigger than 9, we will print one more " "
                if(j > 9){
                    System.out.print(" ");
                }

                // Print "-" if the position is not chosen
                // Print "2" if the position is chosen
                // Print "*" if there is a mine
                if(board[i][j] == 2){
                    System.out.print(" 2");
                }else if(mines && board[i][j] == 3){
                    System.out.print(" *");
                }else {
                    System.out.print(" -");
                }

            }
            System.out.println();
        }
    }

    // This method set mines in the board in the random positions
    // and set "3" in the "board" - 2D array, where there is a mine
    private static void setMinesInBoard(int[][] board, int numberOfMines){
        int randI = getRandomNumberInRange(0, board.length - 1);
        int randJ = getRandomNumberInRange(0, board.length - 1);

        for (int i = 0; i < numberOfMines; i++) {
            board[randI][randJ] = 3;

            randI = getRandomNumberInRange(0, board.length - 1);
            randJ = getRandomNumberInRange(0, board.length - 1);
        }
    }

    // This method return a random number in selected range
    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
