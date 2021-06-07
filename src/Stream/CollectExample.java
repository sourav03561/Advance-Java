package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class CollectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(2,3,4,5);
		Set<Integer> square=numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(square);
	}

}
