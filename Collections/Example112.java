//Obtaing array from arraylist
import java.util.*;
public class Example112 {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    ArrayList<String> al=new ArrayList<String>();
    al.add("c");
    al.add("b");
    al.add("x");
    al.add("y");
    System.out.println(al);
    String[] arr=new String[al.size()];
    arr=al.toArray(arr);
    
   System.out.println(Arrays.toString(arr));
    
  }
}
