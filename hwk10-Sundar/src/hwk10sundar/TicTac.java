/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk10sundar;

/**
 *
 * @author ssekar1
 */
public class TicTac {

    private String[][] grid;
    private Player Player1, Player2;
    private int movesLeft;

    public void resetGrid() {
        grid = new String[3][3];
        // fill up the array

        for (int i = 0; i < grid.length; i++) {
            // go from 0 to length-1 of individual array
            for (int j = 0; j < grid[i].length; j++) {
                // i which is row, j which is column, is the coordinate in the array
                grid[i][j] = " ";
                System.out.print(grid[i][j] + " ");
                movesLeft = 9;
            }

        }
    }

    public TicTac() {
        resetGrid();
        Player p = new Player("Player1", "X", this);
        System.out.println(p);
        Player q = new Player("Player2", "O", this);
        System.out.println(q);
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        if (grid.length == 3 && grid[0].length == 3) {
            this.grid = grid;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = "(" + i + ", " + j + ")";
                    System.out.print(grid[i][j] + " ");

                }
            }

        }
    }

    public Player getPlayer1() {
        return Player1;
    }

    public void setPlayer1(Player Player1) {

        if (Player1 != null) {
            this.Player1 = Player1;
            Player1.setBoard(this);
        }
    }

    public Player getPlayer2() {
        return Player2;
    }

    public void setPlayer2(Player Player2) {

        if (Player2 != null) {
            this.Player2 = Player2;
            Player2.setBoard(this);
        }
    }

    public boolean set(int a, int b, Player Player3) {
        if ((a >= 1 && a <= 3) && (b >= 1 && b <= 3)) {
            grid[a][b] = Player3.getSymbol();
            movesLeft--;
            return true;

        }
        return false;

    }

    public boolean joinPlayer1(Player x) {
        if (!x.getSymbol().equals(Player2.getSymbol()) && (!x.getPlayerName().equals(Player2.getPlayerName()))) {
            setPlayer1(x);
            resetGrid();
            return true;

        }
        return false;

    }

    public boolean joinPlayer2(Player y) {
        if (!y.getSymbol().equals(Player1.getSymbol()) && (!y.getPlayerName().equals(Player1.getPlayerName()))) {
            setPlayer1(y);
            resetGrid();
            return true;


        }
        return false;

    }

    public String toString() {
        String returnMe = " ";
        returnMe = returnMe + "\n     1   2   3 ";
        returnMe = returnMe + "\n  --------------\n";
        for (int i = 0; i < grid.length; i++) {
            returnMe = returnMe + (i + 1) + " |";
            for (int j = 0; j < grid.length; j++) {

                returnMe = returnMe + " " + grid[i][j] + " " + "|";

            }
            returnMe = returnMe + "\n  --------------\n";
        }
        return returnMe;
    }

    public String ticTacWin() {
        // rows
        for (int x = 0; x < 3; x++) {
            if ((grid[x][1].equals(grid[x][0])) && (grid[x][1].equals(grid[x][2]))) {
                return (grid[x][1]);
            }

        }
        // cols
        for (int y = 0; y < 3; y++) {
            if ((grid[1][y].equals(grid[0][y])) && (grid[1][y].equals(grid[2][y]))) {
                return (grid[1][y]);

            }
        }
        // diag
        if ((grid[1][1].equals(grid[0][0])) && (grid[1][1].equals(grid[2][2]))
                || (grid[1][1].equals(grid[0][2])) && (grid[1][1].equals(grid[2][0]))) {
            return (grid[1][1]);
        }
        return null;
    
}
    
}
    