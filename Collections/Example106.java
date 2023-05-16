import java.util.*;
public class Example106{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    ArrayList<String> a1=new ArrayList<String>();
    System.out.println();
    System.out.println("Enter how many Words you want to store:");
    int n=s.nextInt();
    System.out.println("Enter Words");
    for(int i=0;i<n;i++){
      String a=s.next();
      a1.add(a);
    }
    System.out.println("Words that are end with i are: ");
    for(String o:a1){
      if(o.endsWith("i")){
        System.out.println(o);
      }
    }
    System.out.println();

  }
}