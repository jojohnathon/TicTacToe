package src;

import java.util.Scanner;

public class Main {
    static String turn;
    static int turnCount;
    static String playerX;
    static String playerO;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        turn = "X";
        while (!board.gameOver) {
            if (turn.equals("X")) {
                board.display();
                System.out.print("Player X's turn:");
                playerX = scanner.next();
                board.storeCells();
                board.checkWinner();
                turn = "O";
                turnCount++;

            } else {
                board.display();
                System.out.print("Player O's turn:");
                playerO = scanner.next();
                board.storeCells();
                board.checkWinner();
                turn = "X";
                turnCount++;
            }
        }
    }
}
