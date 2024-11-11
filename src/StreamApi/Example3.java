package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example3 {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,78,89,57,35,98);
		asList.stream().filter((n)->n>20).forEach(n->System.out.println(n));
		System.out.println("=================================================");
		List<String> names = Arrays.asList("nisha","riya","sanika","neha","nikita");
		List<String> startnameS = names.stream().filter((n)->n.startsWith("s")).collect(Collectors.toList());
		System.out.println(startnameS);
	}

}
