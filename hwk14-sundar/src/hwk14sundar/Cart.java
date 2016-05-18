/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

/**
 *
 * @author ssekar1
 */
public class Cart {

    public InventoryItem[] Items;
    public int firstEmptyInstance;

    public Cart() {
        Items = new InventoryItem[10];
        firstEmptyInstance = 0;
    }

    public boolean add(InventoryItem things) {
        if (firstEmptyInstance < Items.length) {
            Items[firstEmptyInstance] = things;
            firstEmptyInstance++;
            return true;
        }

        return false;
    }

    public double totalPrice() {
        double total = 0;
        if (Items != null) {

            for (InventoryItem x : Items) {
                if (x != null) {
                    total += x.getPrice();
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        String end = " ";

        for (int i = 0; i < Items.length; i++) {
            if (Items[i] != null) {
                end += Items[i].getDescription();
            }
            return end + totalPrice();

        }
        return end;
    }

    public boolean equals(Object other) {
        if (other != null && other instanceof Cart) {
            Cart c = (Cart) other;

            for (int i = 0; i < Items.length; i++) {
                if (Items[i] != null) {
                    if (!Items[i].equals(c.Items[i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void view() {
        for (int i = 0; i < Items.length; i++) {
            if (Items[i] != null) {
                Items[i].view();
            }
        }
    }
}
