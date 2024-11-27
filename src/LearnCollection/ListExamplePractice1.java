package LearnCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
        LinkedList<Product> products=new LinkedList<Product>();
		
		products.add(new Product(101,"laptop",58000));
		products.add(new Product(102,"mobile",68000));
		products.add(new Product(10,"headphones",6000));
		
//		products.removeIf(p->p.getprice()<10000);
//		System.out.println(products);
		
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());
		Collections.sort(products,nameComparator);
		System.out.println(products);
		
		Comparator<Product> idComparator=(o1,o2)->o1.getId()-o2.getId();
		Collections.sort(products,idComparator);
		
	}

}
