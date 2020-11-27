import java.util.Arrays;

public class Board {
   
    private char a1 = ' ';
    private char a2 = ' ';
    private char a3 = ' ';
    private char b1 = ' ';
    private char b2 = ' ';
    private char b3 = ' ';
    private char c1 = ' ';
    private char c2 = ' ';
    private char c3 = ' ';

    public boolean gameOver = false;

    public String checkWinner() {
        for (int i = 0; i < 8; i++){
            String line = null;
            switch (i) {
                case 0:
                    line = String.valueOf(a1) + String.valueOf(a2) + String.valueOf(a3);
                    break;
                case 1:
                    line = String.valueOf(b1) + String.valueOf(b2) + String.valueOf(b3);
                    break;
                case 2:
                    line = String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3);
                    break;
                case 3:
                    line = String.valueOf(a1) + String.valueOf(b1) + String.valueOf(c1);
                    break;
                case 4:
                    line = String.valueOf(a2) + String.valueOf(b2) + String.valueOf(c2);
                    break;
                case 5:
                    line = String.valueOf(a3) + String.valueOf(b3) + String.valueOf(c3);
                    break;
                case 6:
                    line = String.valueOf(a1) + String.valueOf(b2) +  String.valueOf(c3);
                    break;
                case 7:
                    line = String.valueOf(a3) + String.valueOf(b2) + String.valueOf(c1);
                    break;
            }
            if (line.equals("XXX")) {
                gameOver = true;
                return "X";
            } else if (line.equals("OOO")) {
                gameOver = true;
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i+1))) {   //this doesn't work
                break;
            }
            else if (i == 8) {
                gameOver = true;
                return "Draw";
        }

        System.out.println(Main.turn + "'s turn; enter a slot number to place " + Main.turn + " in:");
        return null;
    }
}

    public void storeCells() {
        if (Main.turn.equals("X")){
            char charOne = Main.playerX.charAt(0);
            char charTwo = Main.playerO.charAt(1);
            if (String.valueOf(charOne).equals("A")) {
                
            }
        }
    }

    public void display() {
        System.out.println("A   B   C   ");
        printRow(a1, b1, c1, 1);
        System.out.println("---|---|---");
        printRow(a2, b2, c2, 2);
        System.out.println("---|---|---");
        printRow(a3, b3, c3, 3);
    }

    private static void printRow(char a, char b, char c, int i) {
        System.out.println(i + ' ' + a + " | " + b + " | " + c);

    }
}
