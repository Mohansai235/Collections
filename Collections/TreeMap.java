//TreeMap stores data in assending order (Natural Ordering)

import java.util.*;
public class TreeMap {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   TreeMap<String,Integer> hm=new TreeMap<String,Integer>();
    hm.put("madar",10);
    hm.put("saheb",10);
    hm.put("madar",10);  //This can not be inserted since it is duplicate key
    hm.put("dudekula",1);
    System.out.println(hm);
    
    Set<Map.Entry<String,Integer>> s=hm.entrySet();
    for(Map.Entry<String,Integer> x: s){​​
      System.out.println(x.getKey()+"   "+x.getValue());
    }
   
  }
}
