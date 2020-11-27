package src;

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
        for (int i = 0; i < 8; i++) {
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
                    line = String.valueOf(a1) + String.valueOf(b2) + String.valueOf(c3);
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
            } else if (Main.turnCount == 8){
                gameOver = true;
                return "Draw";
            }
        }
        
        System.out.println(Main.turn + "'s turn; enter a slot number to place " + Main.turn + " in:");
        return null;
}

    public void storeCells() {

        if (Main.turn.equals("X")) {
            char charOneX = Main.playerX.charAt(0);
            char charTwoX = Main.playerX.charAt(1);
            String columnX = String.valueOf(charOneX);
            String rowX = String.valueOf(charTwoX);
            switch (columnX.toUpperCase()) {
                case "A":
                    if (rowX.equals("1")) {
                        a1 = 'X';
                        System.out.println(a1);
                    } else if (rowX.equals("2")) {
                        a2 = 'X';
                    } else {
                        a3 = 'X';
                    }
                    break;
                case "B":
                    if (rowX.equals("1")) {
                        b1 = 'X';
                    } else if (rowX.equals("2")) {
                        b2 = 'X';
                    } else {
                        b3 = 'X';
                    }
                    break;
                case "C":
                    if (rowX.equals("1")) {
                        c1 = 'X';
                    } else if (rowX.equals("2")) {
                        c2 = 'X';
                    } else {
                        c3 = 'X';
                    }
                    break;
            }
        } else {
            char charOneO = Main.playerO.charAt(0);
            char charTwoO = Main.playerO.charAt(1);
            String columnO = String.valueOf(charOneO);
            String rowO = String.valueOf(charTwoO);
            switch (columnO.toUpperCase()) {
                case "A":
                    if (rowO.equals("1")) {
                        a1 = 'O';
                    } else if (rowO.equals("2")) {
                        a2 = 'O';
                    } else {
                        a3 = 'O';
                    }
                    break;
                case "B":
                    if (rowO.equals("1")) {
                        b1 = 'O';
                    } else if (rowO.equals("2")) {
                        b2 = 'O';
                    } else {
                        b3 = 'O';
                    }
                    break;
                case "C":
                    if (rowO.equals("1")) {
                        c1 = 'O';
                    } else if (rowO.equals("2")) {
                        c2 = 'O';
                    } else {
                        c3 = 'O';
                    }
                    break;
            }
        }
    }

    public void display() {
        System.out.println("A   B   C   ");
        printRow(a1, b1, c1);
        System.out.println("---|---|---");
        printRow(a2, b2, c2);
        System.out.println("---|---|---");
        printRow(a3, b3, c3);
    }

    private static void printRow(char a, char b, char c) {
        System.out.println(" " + a + " | " + b + " | " + c);

    }
}
