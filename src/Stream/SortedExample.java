package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> names=Arrays.asList("Reflection","Collection","Stream");
      List<String> result=names.stream().sorted().collect(Collectors.toList());
      System.out.println(result);
	}

}
