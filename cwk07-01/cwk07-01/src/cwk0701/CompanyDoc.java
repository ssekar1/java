/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0701;

/**
 *
 * @author apatel15
 */
public class CompanyDoc {

    private String title;
    private int length;

    public CompanyDoc() {
        this.title = "default";
        this.length = 0;

    }
    // accessros and mutators
    public int getLength(){
        return length;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle){
        title=newTitle;
    }
     public void setLength(int newLength){
        length=newLength;
    }

    public CompanyDoc(String mytitle) {
        this();
        this.title = mytitle;
    }

    public boolean longer(CompanyDoc doc) {
        if (this.length < doc.length) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return title + "(" + length + ")";
    }
}
