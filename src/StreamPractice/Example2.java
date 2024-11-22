package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example2 {
	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(101,"laptop",60000));
		list.add(new Product(102,"mobile",40000));
		list.add(new Product(103,"Tv",90000));
		list.add(new Product(104,"washingmachine",70000));
		
		System.out.println(list);
		
		System.out.println("======================================");
		
		List<Product> greaterthan60000 = 
				list.stream().filter((price)->price.getPrice()>60000).
				collect(Collectors.toList());
		System.out.println(greaterthan60000);
		
	    List<Product> startWithW = list.stream().filter((name)->name.getName().startsWith("w")).collect(Collectors.toList());	
		System.out.println(startWithW);
	    
	}

}
