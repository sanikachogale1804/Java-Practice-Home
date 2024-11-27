package LearnCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

public class ListExamplePractice1 {
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(20);
		stack.push(45);
		stack.push(67);
		stack.push(67);
		stack.push(56);
		System.out.println(stack);
		System.out.println("=====================");
		System.out.println(stack.search(67));
		System.out.println("=====================");
		System.out.println(stack.pop());
		System.out.println(stack);
		
	}

}
