package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(34,89,21,79,25,17);
		
		System.out.println(list);
		List<Integer> greaterthan20 = list.stream().filter((n)->n>20).collect(Collectors.toList());
		System.out.println(greaterthan20);
		
	}

}
