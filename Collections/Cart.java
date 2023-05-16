import java.util.*;
 public class  Cart {
  String name;
  double price;
  
ArrayList<Items> items=new ArrayList<Items>();
public void add(Items item){
        items.add(item);
    }
public void rem(Items item){
        items.remove(item);
}
public void disp(){
for (Items item : items) {            System.out.println(item.getName() + " : " + item.getPrice());
        }
    }
public void total(){
double total=0;
for(Items item : items){
            total=total+(item.getPrice());
        }
        System.out.println("Total Price : "+total);
}

 
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
 
Cart obj=new Cart();
        System.out.println("Enter Product Name and Price : ");
Items item1 = new Items(sc.next(),sc.nextDouble());
        System.out.println("Enter Product Name and Price : ");
Items item2 = new Items(sc.next(),sc.nextDouble());
 
        obj.add(item1);
        obj.add(item2);

        obj.disp();
 
        System.out.println("\nAfter removing one item");
        obj.rem(item1);
        obj.disp();
 
        obj.total();
    }
}

class Items{
  private String name;
  private double price;
  public Items(String name, double price) {
    this.name = name;
    this.price = price;
  }
  public String getName() {
    return name;
  }

public double getPrice() {
return price;
}
}
