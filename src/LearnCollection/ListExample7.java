package LearnCollection;

import java.util.Stack;

public class ListExample7 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(40);
		stack.push(90);
		stack.push(56);
		stack.push(56);
		stack.push(10);
		System.out.println(stack.empty());
		System.out.println(stack);
		System.out.println("=====================================");
		System.out.println(stack.search(56));
		System.out.println("=====================================");
//		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println("=====================================");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		
		System.out.println(stack.empty());
	}

}
