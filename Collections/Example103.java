//adding duplicates
import java.util.*;
public class Example103{
  public static void main(String[] args){
 
    int[] arr=new int[10]; //integer type data
 
    ArrayList<Integer> al=new ArrayList<Integer>();
 
  
 
    al.add(10);
    al.add(20);
 
     al.add(10);
    al.add(20);
   
 
    System.out.println(al);
for(Integer o: al){
  System.out.println(o);

}
  }
}