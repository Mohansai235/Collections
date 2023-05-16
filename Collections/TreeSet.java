//Tree set:  implements navigable interface
// it stores data in assending order
// It is quite fast
// Excelent choice for for storing larg amount of data
import java.util.*;
public class PloyMor {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   
   TreeSet<Integer> hs=new TreeSet<Integer>();
    hs.add(100);  
    hs.add(50);  
    hs.add(50);  //This will not be added, Since it is duplicate
    hs.add(5);  
    System.out.println(hs);
    System.out.println(hs.size());
    Iterator itr=hs.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    
  }
}
