package lambda;
import java.util.*;
@FunctionalInterface
interface Mynum{
	boolean get(int n);
}

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[] {1,2,3,9,24};
        Mynum mynum;
        for(int i=0;i<arr.length;i++)
        {
        	mynum=(n)->(n%2)==0;
        	System.out.println(mynum.get(arr[i]));
        }
	}

}
