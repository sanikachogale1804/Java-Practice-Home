package StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
	
	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(101,"laptop",60000));
		list.add(new Product(102,"mobile",40000));
		list.add(new Product(103,"Tv",90000));
		list.add(new Product(104,"washingmachine",70000));
		
		System.out.println(list);
		
	}

}
