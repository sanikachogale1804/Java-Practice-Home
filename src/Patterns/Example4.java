package Patterns;

public class Example4 {
	public static void main(String[] args) {
		
		int n=5;
		int i;
		int j;
		int num=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
		
			System.out.println();
		}
		
	}

}
