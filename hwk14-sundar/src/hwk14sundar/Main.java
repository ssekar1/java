/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk14sundar;

import java.util.Scanner;

/**
 *
 * @author ssekar1
 */
public class Main {

    public static void main(String[] args) {
        boolean done = false;
        Scanner scan = new Scanner(System.in);
        InventoryItem[] xlist = new InventoryItem[10];
        xlist[0] = new Book(495, " Hunger ", 2599.8, " Phill ");
        xlist[1] = new MusicCD(454, "Space ", 82.5, " RBH ");
        xlist[2] = new Novel(52, "Harry", 58.2, "Killings ", "War ");
        xlist[3] = new TextBook(552, "JFK", 5598.2, "Pany ", "History ");
        xlist[4] = new Book(485, " Car Finder ", 252.8, " Ron ");
        xlist[5] = new MusicCD(54, "SODR ", 82.5, " GTH ");
        xlist[6] = new Book(95, " Hunger Part 2 ", 2599.8, " Phill ");
        xlist[7] = new MusicCD(4564, "Space  Part 2", 812.5, " RBH ");
        xlist[8] = new Novel(55, "Harry Part 3", 584.2, "Killings ", "War ");
        xlist[9] = new TextBook(652, "JFK Part 5", 6598.2, "Pany ", "History ");

        Cart ylist = new Cart();
        while (done == false) {
            showInventory(xlist);
            System.out.println("1) buy a new item ");
            System.out.println("2) check out  ");
            int x = scan.nextInt(); // read an int
            if (x == 1) {
                System.out.println("Please enter the number of the item ");
                int y = scan.nextInt();
                ylist.add(xlist[y - 1]);
            }
            if (x == 2) {
                ylist.view();
                System.out.println(ylist.totalPrice());
                done=true;
            }
        }

    }

    public static void showInventory(InventoryItem[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ") " + (items[i]));
            items[i].view();
        }
    }
}
