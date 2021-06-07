package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> numbers=Arrays.asList("sourav","rajdeep","samrat");
      List<String> result=numbers.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
      System.out.println(result);
	}

}
