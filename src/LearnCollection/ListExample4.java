package LearnCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample4 {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("sanika");
		list.add("riya");
		list.add("akshata");
		list.add("tushar");
		System.out.println(list);
		
		Predicate<String> n=(name)->name.startsWith("a");
		list.removeIf(n);
		System.out.println(list);
		
		LinkedList<Product> products=new LinkedList<Product>();
		products.add(new Product(101,"laptop",58000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(10,"headphones",6000));
		System.out.println(products);
		
//		Predicate<Product> p=(product)->product.getprice()<50000;
//		products.removeIf(p);
//		System.out.println(products);
		
		System.out.println("===================");
		
		Comparator<Product> pricecomparator=(p1,p2)->p2.getprice()-p1.getprice();
		Collections.sort(products,pricecomparator);
		
		
	}

}
