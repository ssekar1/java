/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class InventoryItem {

    protected int stockID;
    protected String description;
    protected double price;

    public InventoryItem(int stockID, String description, double price) {
        this.stockID = stockID;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockID() {
        return stockID;
    }

    public void setStockID(int stockID) {
        this.stockID = stockID;
    }

    // Equals
    public boolean equals(Object other) {
        if (other != null && other instanceof InventoryItem) {
            InventoryItem m = (InventoryItem) other;
            return getPrice() == m.getPrice() && m.getDescription().equals(description);
        }
        return false;
    }

    public void view() {
        System.out.println("Viewing: " + description);
    }

    public String toString() {
        return stockID + "." + description + "(" + "$" + price + '}';
    }
}
