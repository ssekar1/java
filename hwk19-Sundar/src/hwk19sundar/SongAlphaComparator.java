/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk19sundar;

// sort alphabetically by album, and if the albums are the same, then sort by track number.
import java.util.*;

/**
 *
 * @author ssekar1
 */
public class SongAlphaComparator implements Comparator<Song> {

    public int compare(Song song1, Song song2) {
        // take care of null cases
        if (song1 == null && song2 == null) {
            return 0;
        }
        if (song1 == null) {
            return -1;
        }
        if (song2 == null) {
            return 1;
        }

        // determine difference in number of credits
        int diffTitle = song1.getAlbum().compareTo(song2.getAlbum());

        // if there is a difference, use that as comparison value
        if (diffTitle != 0) {
            return diffTitle;
        }


        return song1.getTrackNum() - (song2.getTrackNum());



    }
}
