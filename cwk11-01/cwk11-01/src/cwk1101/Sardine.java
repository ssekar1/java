/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cwk1101;

/**
 *
 * @author apatel15
 */
public class Sardine {
    private static int sardineCount;
  static{
      sardineCount=0;
      
      
      
  }

    public static int getSardineCount() {
        return sardineCount;
    }

    public static void setSardineCount(int sardineCount) {
        Sardine.sardineCount = sardineCount;
    }

    
    public String val;
public Sardine(){
    val= "Sardine # "+sardineCount;
    sardineCount=sardineCount+1;
 }

public String toString(){
    return val;
}
  
    

  
    
   
       
   
        
        
    

 
  
    
    
}
