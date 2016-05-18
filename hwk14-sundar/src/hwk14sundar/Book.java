/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class Book extends InventoryItem {

    protected String author;

    public Book() {
        super(918, "Harry Potter", 152.5);
        author = "Unnamed";

    }

    public Book(int stockID, String description, double price, String author) {
        super(stockID, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void view() {
        System.out.println("Opening Book: " + description);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return stockID + "," + description + " by " + author + " (" + "$" + price + '}';
    }
}
