//Storing Hetroginous data into collection object
import java.util.*;
public class Example102{
  public static void main(String[] args){
    int[] arr=new int[10]; //integer type data
    ArrayList al=new ArrayList();
    al.add(10);
    al.add(20);
    al.add("madar");
    al.add("saheb");
    al.add('c');
    al.add('a');
    System.out.println(al);
    Iterator itr=al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
    
    
}
}
