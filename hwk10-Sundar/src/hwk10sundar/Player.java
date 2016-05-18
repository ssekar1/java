/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hwk10sundar;

/**
 *
 * @author ssekar1
 */
import java.util.Scanner;

public class Player {

    private String playerName;
    private String symbol;
    private TicTac board;

    public TicTac getBoard() {
        return board;
    }

    public void setBoard(TicTac board) {
        this.board = board;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        if (symbol.equals(" ") && symbol.length() == 1) {
            this.symbol = symbol;
        }
    }
    // default 

    public Player() {
        TicTac t = new TicTac();
        this.playerName = "No player";
        this.symbol = " ";
        this.board = t;

    }

    public Player(String playerName, String symbol, TicTac board) {
        this.playerName = playerName;
        this.symbol = symbol;
        this.board = board;
    }

    public String toString() {
        return playerName + "(" + symbol + ")";
    }
    public void userMove() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); // read an int
        int y = scan.nextInt(); // read an int
        
    }
            
}