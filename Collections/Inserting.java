import java.util.*;
public class Inserting{
  public static void main(String[] args){
  // It only stores 30 values
    //collection concept it is dynamic in size increasing or decreasing
//I didn't give any size. Then how many values wil it store
    //1000 elements into arraylist --> 999 elemnts
    //1 elemnet left.
    //When i declare collection object. What is it size
    ArrayList<String> al=new ArrayList<String>();// 0

    al.add("madar");  // what is the size here is 2
    al.add("saheb");  // size -2
    al.add("dudekula"); //size -4
    al.add("lok"); // size -4 
    al.add("happy"); //size -8
    System.out.println(al);
    System.out.println();
  }
}
