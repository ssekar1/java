/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class MusicCD extends InventoryItem {

    protected String performer;

    public MusicCD() {
        super(4125, "Space Bound", 852.5);
        performer = "Unnamed";

    }

    public MusicCD(int stockID, String description, double price, String performer) {
        super(stockID, description, price);
        this.performer = performer;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String toString() {
        return stockID + "," + performer + description + " (" + "$" + price + '}';
    }

    public void view() {
        System.out.println("Playing: " + description);
    }
}
