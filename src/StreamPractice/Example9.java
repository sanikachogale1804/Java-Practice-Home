package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example9 {
	
	public static void main(String[] args) {
		List<User> people = Arrays.asList(
	            new User("Alice", 30),
	            new User("Bob", 17),
	            new User("Charlie", 20),
	            new User("David", 16)
	        );
		  
		people.stream().filter((name)->name.getAge()>20).forEach((name)->System.out.println(name.getName()));
		
	}

}
