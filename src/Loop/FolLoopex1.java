package Loop;

import java.util.Scanner;

public class FolLoopex1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char n = sc.next().charAt(0);
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
