import java.util.*;
public class Example101{
  public static void main(String[] args){
  
  
            //GenericType
         ///Integer here is a class name
    ArrayList<Integer> al=new ArrayList<Integer>();// 0
     al.add(10);  //10 is not object, But it is stored as object
    //anything that is added to collection object is added as object only
     al.add(11);
     al.add(12);
    
    
System.out.println(al);
//DataType objName array name
    for(Integer o: al){
      System.out.println(o);
    }
  }
}
