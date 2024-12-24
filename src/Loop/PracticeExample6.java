package Loop;

import java.util.Scanner;

public class PracticeExample6 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;int b=1;int c=0;
		
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
