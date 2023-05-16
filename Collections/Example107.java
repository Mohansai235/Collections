import java.util.*;
public class Example107{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al=new ArrayList<Integer>();
    System.out.println("you want continue to add or not(Type only Y for yes and N for No)");
    char b=sc.next().charAt(0);
    do{
      System.out.println("Enter the elements: ");
        int c=sc.nextInt();
        al.add(c);
      System.out.println("you want continue to add or not(Type only Y for yes and N for No)");
      b=sc.next().charAt(0);
    }while(b=='Y');
    System.out.println("After adding the elements: ");
    for(Integer o:al){
      System.out.println(o);
    }
  }
}





