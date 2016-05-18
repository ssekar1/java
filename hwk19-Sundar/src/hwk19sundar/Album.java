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
public class Album implements Comparable<Album> {

    public int compareTo(Album other) {
        // bigger than any null class
        if (other == null) {
            return 1;
        }
        int programDiff = getTitle().compareTo(other.getTitle());
        return programDiff;
    }
    protected String title;
    protected int track;
    protected ArrayList<Song> listy;

    public Album(String title, int track, ArrayList<Song> listy) {
        this.title = title;
        this.track = track;
        this.listy = listy;
    }

    public Album(String title) {
        this.title = title;

    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    ArrayList<Song> getListy() {
        return listy;
    }

    void setListy(ArrayList<Song> listy) {
        this.listy = listy;
    }

    public void addSong(Song songy) {
        listy.add(songy);
        songy.setTrackNum(listy.size());
    }

    public String trackList() {
        String temp = " ";
        Song songTemp;
        ListIterator<Song> one = listy.listIterator();
        while (one.hasNext()) {
            songTemp = one.next();
            temp += songTemp.getTrackNum() + songTemp.getTitle() + "/n";
        }
        return temp;
    }

    public void play() {
        ListIterator<Song> two = listy.listIterator();
        while (two.hasNext()) {
            two.next().play();
        }
    }
    // Extra Credit
    public void addExistingSong() {
        int temp = 0;
        Song songTemp;
        ListIterator<Song> one = listy.listIterator();
        while (one.hasNext()) {
            songTemp = one.next();
            temp += songTemp.getTrackNum();
    }
    }

    @Override
    public String toString() {
        return "title=" + title;
    }
}
