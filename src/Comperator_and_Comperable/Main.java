package Comperator_and_Comperable;
import java.util.*;
import java.io.*;
import java.lang.*;

class Student{
	int rollno;
	String name, address;
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
}
class Sortbyroll implements Comparator<Student>
{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno-b.rollno;
	}
	
}
class Sortbyname implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student> ar=new ArrayList<Student>();
       ar.add(new Student(17,"sourav","jalpaiguri"));
       ar.add(new Student(04,"samrat","jalpaiguri"));
       ar.add(new Student(80,"sanu","jalpaiguri"));
       
       System.out.println("Unsorted");
       for(int i=0;i<ar.size();i++)
       {
    	   System.out.println(ar.get(i));
       }
       
       Collections.sort(ar,new Sortbyroll());
       
       System.out.println("Sorted according to roll");
       for(int i=0;i<ar.size();i++)
       {
    	   System.out.println(ar.get(i));
       }
       System.out.println("Sorted according to name");
       Collections.sort(ar,new Sortbyname());
       for(int i=0;i<ar.size();i++)
       {
    	   System.out.println(ar.get(i));
       }
	}

}
