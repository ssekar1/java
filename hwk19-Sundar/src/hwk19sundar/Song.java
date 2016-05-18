/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hwk19sundar;

/**
 *
 * @author ssekar1
 */
public class Song implements Comparable<Song> {

    public int compareTo(Song other) {
        // bigger than any null class
        if (other == null) {
            return 1;

        }

        int programDiff = getTitle().compareTo(other.getTitle());
        return programDiff;
    }
    protected String title;
    protected String artist;
    protected Album album;
    protected int trackNum;

    public Song() {
        title = "None";
        artist = "Unnamed";
        album = new Album("Gone");
        trackNum = 0;
    }

    public Song(String title, String artist, String album, int trackNum) {
        this.title = title;
        this.artist = artist;
        this.album = new Album(album);
        this.trackNum = trackNum;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(int trackNum) {
        this.trackNum = trackNum;
    }

    public void play() {
        System.out.println("song that is playing is: " + title);
    }

    @Override
    public String toString() {
        return "\n title= " + title + "\n artist= " + artist + " \n album= " + album + "\n trackNum= " + trackNum;
    }
    // compare method
}
