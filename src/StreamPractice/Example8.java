package StreamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {
	
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
	            new User("Alice", 30),
	            new User("Bob", 25),
	            new User("Charlie", 35),
	            new User("David", 40)
	        );
		
		users.stream().forEach((user)->System.out.println(user.getName()+" your age is "+user.getAge()));
	}

}
