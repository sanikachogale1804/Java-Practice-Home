package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example10 {
	
	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee("Alice", 5000),
		            new Employee("Bob", 4500),
		            new Employee("Charlie", 6000),
		            new Employee("David", 4000)
		        );
		 
		 employees.stream().map((name)->name.getSalary()*10).forEach((salary)->System.out.println(" new salary: "+ salary));
		
		 
	}

}
