import java.util.*;
public class Example108 {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    ArrayList<Object> al=new ArrayList<Object>();
int[] arr=new int[1];
    al.add(10);
    al.add("madar");
    al.add('d');
    al.add(1235548);
    al.add(true);
    //3 ways for loop. for each loop and Iterator
    for(int i=0;i<al.size(); i++){
      System.out.println(al.get(i));
    }
  }
}
