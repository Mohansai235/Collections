/*Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/

import java.util.*;
public class PointOfSale{
  String productName;
  int quantity;
  double price;
  ArrayList<Product> products=new ArrayList<Product>();
  public void add(Product product){
    products.add(product);
  }
  public void rem(Product product){
    products.remove(product);
  }
  public void disp(){
    for (Product product : products) {       
      System.out.println(product.getProductName() + " : " + product.getQuantity()+" : "+ product.getPrice());
    }
  }
  public void total(){
    double total=0;
    for(Product product:products){
      total=total+(product.getPrice());
    }
    System.out.println("Total Price :"+total);
  }
  public void Search(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Product name you want to search");
    String name=s.next();
    if(name.equals(product.getProductName())){
    for (Product product : products) {       
      System.out.println(product.getProductName() + " : " + product.getQuantity()+" : "+ product.getPrice());
    }
  }
  }
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    PointOfSale pos=new PointOfSale();
      System.out.println("Enter Product Name,Quantity and Price : ");
    Product product1=new Product(s.next(),s.nextInt(),s.nextDouble());
       System.out.println("Enter Product Name,Quantity and Price : ");
    Product product2=new Product(s.next(),s.nextInt(),s.nextDouble());
    System.out.println("Enter Product Name,Quantity and Price : ");
    Product product3=new Product(s.next(),s.nextInt(),s.nextDouble());
    
    pos.add(product1);
    pos.add(product2);
    pos.add(product3);
    System.out.println();
    pos.disp();
    System.out.println();

    System.out.println("\nAfter removing one product");
    pos.rem(product1);
    pos.disp();
    System.out.println();

    pos.total();
  }
}
class Product {
	private String productName;
	private int quantity;
	private double price;
	Product(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public String toString() {
		String s = this.productName + ":";
		s = s + this.quantity + "\n";
		return s;
	}
	public String getProductName() {
		return this.productName;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
}