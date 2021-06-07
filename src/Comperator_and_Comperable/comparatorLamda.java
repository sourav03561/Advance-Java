package Comperator_and_Comperable;
import java.util.*;

public class comparatorLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= new int[][]{{0,2},{5,3},{6,6},{4,1}};
        //sort the array according to second element in assending order
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
       System.out.println("sort in reverse order");
      //sort the array according to second element in descending order
        Arrays.sort(arr,(a,b)->b[1]-a[1]);
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
