package ArrayPractice;

public class Example2 {
	
	public static void main(String[] args) {
		
		int arr[]= {12,89,56,35,29,34};
		int sum=0;
		for(int num:arr)
		{
			if(num%2==1)
			{
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
