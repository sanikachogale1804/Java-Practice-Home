package Patterns;

import java.util.Scanner;

//left half pyramid pattern
public class Example2 {
	
	public static void main(String[] args) {
		
		int rows=6;
		int i,j;
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=0;j<=rows-i;j++)
			{
				System.err.print("*");
			}
			System.out.println();
		}
		
	}

}
