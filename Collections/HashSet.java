//Hash Set: Hashset extends Abstarct set and implements set interface, It craetes a collection that uses a hashtable storage
//Hash table stores information by using mechanism called hashing
//a key is used to determine a unique value, called hashcode
import java.util.*;
public class HashSet {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   
   HashSet<String> hs=new HashSet<String>();
    hs.add("madar");
    hs.add("madar");
    hs.add("madar");
    hs.add("madar");
    System.out.println(hs);
    
  }
}
