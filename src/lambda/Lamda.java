package lambda;
import java.util.*;
//to implement lamda we need function interface and lamda expression
//lamda is unname and anonymas
//lamda used to achive functional programming

//functional interface can have only one method
@FunctionalInterface
interface Mynumber{
	double getValue();
}
public class Lamda {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mynumber myNum;
       myNum=()->123.4;
       System.out.println(myNum.getValue());
       
       myNum=()->Math.random()*100;
	   System.out.println(myNum.getValue());
	  }

}
