package Practice;

import java.util.Scanner;

public class LoopPractice1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int a=0;int b=1;int c=0;
	
	
	for(int i=0;i<=n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
			
	}
	
}
	
}
