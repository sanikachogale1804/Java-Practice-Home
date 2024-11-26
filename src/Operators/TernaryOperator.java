package Operators;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		System.out.println(false?"sanika":"sneha");
		
		int a=50;
		int b=30;
		
		int biggervalue=a>b?a:b;
		System.out.println(biggervalue);
		System.out.println(a>b?"a is greater":"b is greater");
		
	}

}
