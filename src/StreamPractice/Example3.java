package StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(34,89,21,79,25,17);
		
		System.out.println(list);
		List<Integer> greaterthan20 = list.stream().filter((n)->n>20).collect(Collectors.toList());
		System.out.println(greaterthan20);
		
		System.out.println("===============================");
		List<Integer> collect = list.stream().filter((n)->n%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
