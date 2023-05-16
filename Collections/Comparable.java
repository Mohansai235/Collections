//Comparable(Interface) 
//This interface is found in java.lang pacakge and it contains only one method named as compareTo(Object)
//It provides single sorting sequence
//i.e you can sort the elements on the basis of single data member only.
// if obj1==obj2  returns zero
// if obj1>obj2 return positive value
// if obj1<obj2 returns negative value
import java.util.*;
class Student implements Comparable<Student>{
  String name;
  int rank;
  public Student(String name, int rank){
    this.name=name;
    this.rank=rank;
  }
  public int compareTo(Student st){
    if(rank==st.rank){
      return 0;
    }
    else if(rank>st.rank){
      return 1;
    }
    else{
      return -1;
    }
  }
}
public class Comparable {
  
  public static void main(String[] args){
   
   List<Student> al=new ArrayList<Student>();
    Student s1=new Student("madar",10);
    Student s2=new Student("saheb",9);
    Student s3=new Student("dudekula",1);
    al.add(s1);
    al.add(s2);
    al.add(s3);
    
Collections.sort(al);
    Iterator itr=al.iterator();
    while(itr.hasNext()){
    Student st=(Student)itr.next();
      System.out.println(st.name+"   "+st.rank);
    }
  }
}
