package Patterns;

public class Example1 {
	
	public static void main(String[] args) {
		
		int rows=5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println("*");
				
			}
			System.out.println();
		}
		
		int n=4;
		System.out.println("1");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}