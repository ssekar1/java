/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class Novel extends Book {

    protected String genre;

    public Novel() {
        super(42, "Harry p", 548.2, "Unnamed");
        this.genre = "No subject";
    }

    public Novel(int stockID, String description, double price, String author, String genre) {
        super(stockID, description, price, author);
        this.genre = genre;
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public String getgenre() {
        return genre;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public boolean equals(Object another, Object subject) {
        if (another != null && another instanceof Novel) {
            Novel n = (Novel) another;
            return n.author.equals(author) && n.description.equals(description) && n.genre.equals(genre);
        }
        if (another != null && another instanceof TextBook) {
            TextBook t = (TextBook) another;
            return t.author.equals(author) && t.description.equals(description) && t.subject.equals(genre);

        }
        return false;
    }
}
