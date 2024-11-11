package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
	
	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(new Product(101,"mobile",80000));
		products.add(new Product(102,"Tv",50000));
		products.add(new Product(103,"fridge",90000));
		
		List<Product> greaterthan50000 = products.stream().filter((price)->price.getPrice()>50000).collect(Collectors.toList());
		System.out.println(greaterthan50000);
		
		
	}

}
