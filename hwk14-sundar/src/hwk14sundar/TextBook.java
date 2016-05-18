/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class TextBook extends Book {

    protected String subject;

    public TextBook() {
        super(4552, "Harry I", 5598.2, "Unnamed");
        this.subject = "No subject";
    }

    public TextBook(int stockID, String description, double price, String author, String subject) {
        super(stockID, description, price, author);
        this.subject = subject;
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean equals(Object another) {
        if (another != null && another instanceof TextBook) {
            TextBook t = (TextBook) another;
            return t.author.equals(author) && t.description.equals(description) && t.subject.equals(subject);
        }
        if (another != null && another instanceof Novel) {
            Novel n = (Novel) another;
            return n.author.equals(author) && n.description.equals(description) && n.genre.equals(subject);

        }
        return false;
    }
}
