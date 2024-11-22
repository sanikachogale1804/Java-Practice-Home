package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	
	public static void main(String[] args) {
	
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product(101,"laptop",60000));
		list.add(new Product(102,"mobile",40000));
		list.add(new Product(103,"Tv",90000));
		list.add(new Product(104,"washingmachine",70000));
		
		List<String> productname = list.stream().map((name)->name.getName()).collect(Collectors.toList());
		System.out.println(productname);
		
		System.out.println("======================");
		List<Product> collect = list.stream().filter((name)->name.getName().startsWith("m")).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
