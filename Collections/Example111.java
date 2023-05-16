import java.util.*;
public class Example111 {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    ArrayList<String> al=new ArrayList<String>();
    al.add("c");
    al.add("b");
    al.add("x");
    al.add("y");
    System.out.println(al);
    al.remove("x");  //removing object by passing object
     System.out.println(al);
    al.remove(2);  //removing object based on index position
    System.out.println(al);
  }
}
