package Projects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Project1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		TreeSet<Product> products=new TreeSet<Product>((p1,p2)->p2.getId()-p1.getId());
		
		products.add(new Product(101,"mobile",90000));
		products.add(new Product(102,"Laptop",68000));
		products.add(new Product(103,"HeadPhone",4000));
		products.add(new Product(104,"WashingMachine",50000));
		products.add(new Product(105,"Tv",100000));
		System.out.println(products);
	   
		System.out.println("Do you want to sort your Product by id:");
		char decision=sc.next().charAt(0);
		if(decision=='y')
		{
			Comparator<Product> idComparator=(p1,p2)->p1.getId()-p2.getId();
			System.out.println(idComparator);
		}
		
	}
	
}
