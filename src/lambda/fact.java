package lambda;
import java.util.*;

interface Math1{
	int fact(int n);
}
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 math=(n)->{
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			return f;
		};
		System.out.println(math.fact(5));
	}

}
