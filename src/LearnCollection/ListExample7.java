package LearnCollection;

import java.util.Stack;

public class ListExample7 {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(40);
		stack.push(90);
		stack.push(56);
		stack.push(10);
		System.out.println(stack);
		System.out.println("=====================================");
		stack.search(90);
		
	}

}
