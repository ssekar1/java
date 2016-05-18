/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cwk0701;

/**
 *
 * @author apatel15
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CompanyDoc doc1=new CompanyDoc();
       CompanyDoc doc2=new CompanyDoc("Exon");
       doc1.setLength(50);
    if (doc1.longer(doc2)){
        System.out.println("doc1 is longer");
        }else {
          System.out.println("doc2 is longer");

    }
       System.out.println(minim(2,3));
       System.out.println(minim("apple","ball"));
       Person p1=new Person("Pop", 5);
       Person p2=new Person("roar",10);
       System.out.println(minim (p1,p2));
    }

    public static int minim(int a, int b) {
        int minimum;
        minimum = a;
        if (b < a) {

            minimum = b;
        }
        return minimum;

    }

    public static String minim(String a, String b) {
        String shortest;
        shortest=a;
        if (b.length() < a.length()) {

            shortest=b;
        }
        return shortest;

    }
    public static Person minim(Person x, Person y){
        if (x==null||y==null){
        return null;
        }
        Person youngest;
        youngest=x;
        if (y.getAge()<x.getAge()){
            youngest=y;
        }
        return youngest;
    }
    
}
