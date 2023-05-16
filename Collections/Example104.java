//Hashset cannot take duplicate elements
    
import java.util.*;
public class Example104{
  public static void main(String[] args){
    HashSet<Integer> hs=new HashSet<Integer>();
   hs.add(10);
    hs.add(20);
    hs.add(10);
    hs.add(20);
    
    System.out.println(hs);
for(Integer o: hs){
  System.out.println(o);
}
    
    
}
}
