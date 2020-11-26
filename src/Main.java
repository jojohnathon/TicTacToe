import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        while (!Board.gameOver) {
            int turnCount = 0;
            if (turnCount % 2 == 0) {
                System.out.print("Player 1's turn:");
                String playerX = scanner.next();
                turnCount = turnCount + 1;

                board.display();
            } else {
                System.out.print("Player 2's turn:");
                String playerO = scanner.next();
                turnCount = turnCount + 1;
                board.display();
            }
        }
    }
}
