package StringExample;

import java.util.Scanner;

public class PracticeExample1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int search = sc.nextInt();
		int arr[]= {2,4,5,7,2,9,4};
		
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]==search)
			{
				index=i;
				break;
			}
			
		}
		System.out.println(index);
		
	}

}
