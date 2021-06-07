package lambda;
import java.util.*;

interface SomeFunc<T>{
	T func(T t);
}

public class GenericLamda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use String based version of SomeFunc
		SomeFunc<String> reverse=(str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
			{
				result+=str.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverse.func("maago"));
		
		
		//use integer version
		SomeFunc<Integer> fact=(n)->{
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			return f;
		};
		
		System.out.println(fact.func(5));
	}

}
