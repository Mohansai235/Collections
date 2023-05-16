//Linked list is better for inserting and deleting elements
import java.util.*;
public class LinkedList {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    LinkedList<String> ll=new LinkedList<String>();
    ll.add("c");
    ll.add("x");
    ll.add("y");
    ll.add("z");
    ll.add("c");
    System.out.println(ll);
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
    
  }
}
