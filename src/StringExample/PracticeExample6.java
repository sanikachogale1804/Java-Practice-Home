package StringExample;

public class PracticeExample6 {
	
	public static void main(String[] args) {
		
		int arr[]= {12,67,78,63,90,45};
		
		int sum=0;
		for(int data:arr)
		{
			if(data%2==1)
			{
				sum+=data;
			}
		}
		System.out.println(sum);
		
	}

}
