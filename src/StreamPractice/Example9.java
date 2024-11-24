package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example9 {
	
	public static void main(String[] args) {
		  List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "kiwi", "pineapple");
		  
		  words.stream().filter((word)->word.length()>5).forEach((word)->System.out.println(word));
		  
	}

}
