//Comparator(Interface) 
//This interface is found in java.util pacakge and it contains two method named as compare(Object obj1,Object obj2) AND equals(Object obj)
//It provides multi sorting sequence
//compare(Object obj1,Object obj2):
// if obj1==obj2  returns zero
// if obj1>obj2 return positive value
// if obj1<obj2 returns negative value
//equals(): tests weather both objects equlas the invoking comparator
// boolean equals(Object obj);

import java.util.*;
class Student{
  String name;
  int rank;
  public Student(String name, int rank){
    this.name=name;
    this.rank=rank;
  }
  
}
class rankCamparision implements Comparator<Student>{
  public int compare(Student st1, Student st2){
    if(st1.rank==st2.rank){
      return 0;
    }
    else if(st1.rank>st2.rank){
      return 1;
    }
    else{
      return -1;
    }
  }
}
class nameComparison implements Comparator<Student>{
  public int compare(Student st1,Student st2){
    return st1.name.compareTo(st2.name);
  }
}
public class PloyMor {
  
  public static void main(String[] args){
   
   List<Student> al=new ArrayList<Student>();
    Student s1=new Student("madar",10);
    Student s2=new Student("saheb",9);
    Student s3=new Student("dudekula",1);
    al.add(s1);
    al.add(s2);
    al.add(s3);
        System.out.println("------Comparision based on rank-------");
Collections.sort(al, new rankCamparision());
    Iterator itr=al.iterator();
    while(itr.hasNext()){
    Student st=(Student)itr.next();
      System.out.println(st.name+"   "+st.rank);

        System.out.println("------Comparision based on name-------");
  Collections.sort(al, new nameComparison());
Iterator itr1=al.iterator();
    while(itr1.hasNext()){
    Student st=(Student)itr1.next();
      System.out.println(st.name+"   "+st.rank);
    }
  }
}
