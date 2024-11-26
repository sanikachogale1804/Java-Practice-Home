package Operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		int a=50;
		System.out.println(a==50 && a!=50);
		System.out.println(a<=0 && a!=50);
		System.out.println(a>=0 && a==50);
		System.out.println(a<=0 || a>=0);
		System.out.println(a<=50 || a<=0);
		System.out.println(!(a<=50 || a<=0));


	}

}
