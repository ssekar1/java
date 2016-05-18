/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk19sundar;

import java.util.*;

/**
 *
 * @author ssekar1
 */
public class Main {

    public static void main(String[] args) {
        // example with strings
        // ArrayList is a generic type, here we make one of strings
        ArrayList<Song> list = new ArrayList<Song>();

        // putting new items in list
        list.add(new Song("Dalek", "Bob", "Mercury", 1));
        list.add(new Song("Cyberman", "Bob", "Mercury", 2));
        list.add(new Song("Voords", "Brown", "Zinc", 3));
        list.add(new Song("Nimon", "Brown", "Zinc", 4));
        list.add(new Song("Silurians", "Tommy", "Gold", 5));
        list.add(new Song("Autons", "Tommy", "Gold", 6));
        list.add(new Song("Axons", "Jack", "Lead", 7));
        list.add(new Song("Cry", "Jack", "Lead", 8));
        list.add(new Song("Pain", "Leo", "Silver", 9));
        list.add(new Song("Gain", "Leo", "Silver", 10));
        list.add(new Song("Love", "Bob", "Ionic", 11));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new SongComparator());
        System.out.println(list);
        Collections.sort(list, new SongAlphaComparator());
        System.out.println(list);

        Album album1 = new Album("Romeo", 1, list);
        album1.addSong(new Song("Rambo", "Stall", "Movies", 1));
        album1.addSong(new Song("Expand", "Arnold", "Movies", 2));
        album1.addSong(new Song("Recall", "Levis", "Moviest", 3));
        album1.addSong(new Song("True", "Bruce", "Movies", 4));
        System.out.println(album1);
        album1.play();
        
    }
}
