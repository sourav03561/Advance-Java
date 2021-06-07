package lambda;
import java.util.function.Function;

public class UseFunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<Integer,Integer> factorial=(n)->{
        	int result=1;
        	for(int i=1;i<=n;i++)
        	{
        		result=result*i;
        	}
        	return result;
        };
        System.out.println(factorial.apply(3));
	}

}
