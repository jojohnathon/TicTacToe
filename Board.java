public class Board {
    /*
    The following code is an example of logic a programmer might want to use.
    Feel free to delete and replace any code you wish to implement differently.
     */

    // representing our cells
    private char a1 = ' ';
    private char a2 = ' ';
    private char a3 = ' ';
    private char b1 = ' ';
    private char b2 = ' ';
    private char b3 = ' ';
    private char c1 = ' ';
    private char c2 = ' ';
    private char c3 = ' ';

    /**
     * Displays the board state
     */
    public void display() {
        printRow(a1, b1, c1);
        System.out.println("---|---|---");
        printRow(a2, b2, c2);
        System.out.println("---|---|---");
        printRow(a3, b3, c3);
    }

    /**
     * A private helper method to print out a row with symbols
     */
    private static void printRow(char a, char b, char c) {
        System.out.println("implement something!");
    }
}
