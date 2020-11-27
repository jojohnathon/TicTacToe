import java.util.Scanner;

public class Main {
    static String turn;
    static String playerX;
    static String playerO;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        turn = "X";
        while (!board.gameOver) {
            if (turn.equals("X")) {
                System.out.print("Player 1's turn:");
                playerX = scanner.next();
                turn = "O";
                board.checkWinner();
                board.display();
            } else {
                System.out.print("Player 2's turn:");
                playerO = scanner.next();
                turn = "X";
                board.checkWinner();
                board.display();
            }
        }
    }
}
