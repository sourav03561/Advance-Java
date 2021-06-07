package Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create a list of integers
	     List<Integer> numbers=Arrays.asList(2,3,4,5);
	     List<Integer> square=numbers.stream().map(x->x*x).collect(Collectors.toList());
	     System.out.print(square);
	     
	}

}
