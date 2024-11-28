package LearnCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExamplePractice1 {
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		HashSet<String> colors=new HashSet<String>();
		
		for(int i=1;i<=5;i++)
		{
			String color = sc.next();
			colors.add(color.toLowerCase());
		}
		System.out.println(colors);
	}

}
