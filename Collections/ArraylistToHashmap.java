//Converting from ArrayList to HashMap
import java.util.*;
public class ArraylistToHashmap {
  
  public static void main(String[] args){
   
   ArrayList<String> al=new ArrayList<String>();
    
    al.add("madar");
    al.add("saheb1234");
    al.add("dudekula");
    al.add("kurnool");
    System.out.println(al);
    PloyMor obj=new PloyMor();
    HashMap<Integer,String> hm=obj.convert(al);
    System.out.println(hm);
    
  }
  public HashMap<Integer,String> convert(ArrayList<String> al1){
    HashMap<Integer,String> hm1=new HashMap<Integer,String>();
    for(String x: al1){
      hm1.put(x.length(),x);
    }
    return hm1;
  }
}
