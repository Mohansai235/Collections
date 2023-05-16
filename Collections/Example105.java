import java.util.*;
public class Example105{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    ArrayList<Integer> al=new ArrayList<Integer>();
    int ecount=0,ocount=0;
    System.out.println();
    System.out.println("Enter How many numbers you want to store");
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      System.out.println("Enter "+(i+1)+" number");
      int a=s.nextInt();
      al.add(a);
    }
    System.out.println("Even numbers are: ");
    for(Integer o:al){
      if(o%2==0){ 
        ecount++;
        System.out.println(o);
      }
     
    }
    System.out.println("Even numbers Count: "+ecount);
    System.out.println("Odd numbers are: ");
    for(Integer o:al){
      if(o%2!=0){
        ocount++;
        System.out.println(o);
      }
    }
    System.out.println("Odd numbers Count: "+ocount);
    System.out.println();

  }
}