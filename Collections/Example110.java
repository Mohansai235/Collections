import java.util.*;
public class Example110 {
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al=new ArrayList<Integer>();
int[] arr=new int[1];
    al.add(10);
    al.add(11);
    al.add(12);
    al.add(13);
    
    //3 ways for loop. for each loop and Iterator
    System.out.println("-------Normal for loop-------");
    for(int i=0;i<al.size(); i++){
      System.out.println(al.get(i));
      if((al.get(i))%2==0){
        al.remove(al.get(i));
      }
    }
    
    System.out.println("-------Iterator-------");
    Iterator itr=al.iterator();
         //false
    while(itr.hasNext()){
      int obj=(Integer)itr.next();
      
      System.out.println(obj);
      
    }
    System.out.println("-------for Each loop---------");
    for(Object a: al){
      System.out.println(a);
    }
  }
}
