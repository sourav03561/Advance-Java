package Comperator_and_Comperable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//two type object compare
class Student1{
	String Name;
	int age;
	public Student1(String name, int age) {
		super();
		this.Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + "]";
	}
	
}
class CustomerSortingComparator implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
	   int NameCompare=o1.getName().compareTo(o2.getName());
	   int AgeCompare=o1.getAge()-o2.getAge();
	   return (NameCompare==0)?AgeCompare:NameCompare;
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create ArrayList to store Student
        List<Student1> al = new ArrayList<>();
  
        // create customer objects using constructor
        // initialization
        Student1 obj1 = new Student1("Ajay", 27);
        Student1 obj2 = new Student1("Sneha", 23);
        Student1 obj3 = new Student1("Simran", 37);
        Student1 obj4 = new Student1("Ajay", 22);
        Student1 obj5 = new Student1("Ajay", 29);
        Student1 obj6 = new Student1("Sneha", 22);
  
        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        System.out.println("Unsorted");
        for(Student1 s:al)
        {
        	System.out.println(s.toString());
        }
       
        Collections.sort(al,new CustomerSortingComparator());
        System.out.println("Sorted");
        for(Student1 s:al)
        {
        	System.out.println(s.toString());
        }
	}

}
